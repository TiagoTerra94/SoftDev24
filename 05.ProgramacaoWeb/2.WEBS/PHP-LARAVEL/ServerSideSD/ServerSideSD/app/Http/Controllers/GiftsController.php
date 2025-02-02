<?php

namespace App\Http\Controllers;

use App\Models\Gift;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class GiftsController extends Controller
{

    public function showGifts(){

        //$this -> deleteGift(3);
        $allGiftsDB = $this -> getAllGiftsDB();

        //dd($allGiftsDB);

        return view('gifts.gifts', compact('allGiftsDB'));
    }

    public function getAllGiftsDB(){
        $allGifts = DB::table('gifts')
            ->join('users', 'users.id','=', 'gifts.users_id')
            ->select('gifts.*', 'users.name as user_name',
            DB::raw('gifts.valor_previsto - gifts.valor_gasto AS diff')
            )
            ->get();

        return $allGifts;
    }

    public function deleteGift($id){
        DB::table('gifts')
        ->where('id', $id)
        ->delete();

        return back();
    }

    public function viewGift($id){
        $gift = DB::table('gifts')
        ->join('users', 'users.id', '=', 'gifts.users_id')
        ->select('gifts.*','users.name as username')
        ->where('gifts.id', $id)
        ->first();

        return view('gifts.view_gift', compact('gift'));
    }

    public function createGift(Request $request){

        $request->validate([
            'name'=> 'required|string|max:50',
            'valor_previsto'=>'required|integer',
            'valor_gasto'=>'required|integer',
            'users_id' => 'required'
        ]);

        Gift::insert([
            'name'=> $request->name,
            'valor_previsto'=>$request->valor_previsto,
            'valor_gasto'=>$request->valor_gasto,
            'users_id'=>$request->users_id,
        ]);

        return redirect()->route('gifts')->with('message','Gift has been added with success!');
    }

    public function addGifts(){
        $users = DB::Table('users')
            ->get();

        return view('gifts.add_gifts', compact('users'));
    }

    public function editGift($id){
        $users = DB::Table('users')
            ->get();

        $gift = Gift::findOrFail($id);

        return view('gifts.gift_edit', compact('gift', 'users'));
    }

    public function updateGift(Request $request, $id){
        $gift = Gift::findOrFail($id);

        $request->validate([
            'name' => 'required|string|max:255',
            'valor_previsto' => 'required|integer',
            'valor_gasto' => 'required|integer',
            'users_id' => 'required',
        ]);

        // Atualizar os dados
        $gift->update([
            'name' => $request->name,
            'valor_previsto' => $request->valor_previsto,
            'valor_gasto' => $request->valor_gasto,
            'users_id'=>$request->users_id,
        ]);

        return redirect()->route('gifts')->with('message', 'Gift atualizado com sucesso!');
    }

}

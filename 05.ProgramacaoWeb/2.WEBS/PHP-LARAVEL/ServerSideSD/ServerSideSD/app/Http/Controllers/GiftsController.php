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
            ->select('gifts.*', 'users.name as user_name')
            ->get();

        return $allGifts;
    }

    protected function deleteGift($id){
        DB::table('gifts')
        ->where('id', $id)
        ->delete();

        return back();
    }

    public function viewGift($id){
        $gift = DB::table('gifts')
        ->join('users', 'users.id', '=', 'gifts.users_id')
        ->where('gifts.id', $id)
        ->select('gifts.*', 'users.name as username')
        ->first();

        return view('gifts.view_gift', compact('gift'));
    }

    public function createGift(Request $request){

        $request->validate([
            'name'=> 'required|string|max:50',
            'valor_previsto'=>'required|integer',
            'valor_pago'=>'required|integer',
            'user_id' => 'required'
        ]);

        Gift::insert([
            'name'=> $request->name,
            'valor_previsto'=>$request->valor_previsto,
            'valor_pago'=>$request->valor_pago,
            'user_id'=>$request->user_id,
        ]);

        return redirect()->route('gifts')->with('message','Gift has been added with success!');
    }

    public function addGifts(){
        $users = DB::Table('users')
            ->get();

        return view('gifts.add_gifts', compact('users'));
    }
}

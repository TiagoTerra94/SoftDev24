<?php

namespace App\Http\Controllers;
use Illuminate\Support\Facades\DB;

use Illuminate\Http\Request;

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
    }
}

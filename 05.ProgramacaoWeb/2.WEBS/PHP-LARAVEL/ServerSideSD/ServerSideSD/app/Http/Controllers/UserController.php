<?php

namespace App\Http\Controllers;

use App\Models\User;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Facades\Hash;

class UserController extends Controller
{
    public function allUsers() {
        $cesaeInfo = $this->getCesaeInfo();
        $allContacts = $this->getContacts();

        //Função para inserir user na <b>base de dados</b>
        //$this->inserirUserIntoDB();

        //Update values on DB
        //$this->updateUserAtDB();

        /**Pesquisa quando existe campo preenchido */
        /*if($request()->query('search')){
            $search = request()->query('search');
        }else{
            $search=null;
        }*/
        /**Operação ternaria */
        $search = request()->query('search')? request()->query('search') :null;
        //Print all users
        $allUsers = $this -> getAllUsersFromDB($search);


        //debug para saber se tem dados
        //dd($allUsers);

        return view('users.all_users', compact('cesaeInfo', 'allContacts', 'allUsers'));
    }

    public function addUsers(){
        return view('users.add_user'); //caminho da blade
    }

    public function removeUser(){
        return view('users.remove_user');
    }

    private function getCesaeInfo(){
        $cesaeInfo =[
            'name'=> 'Cesae',
            'address' => 'Rua Ciriaco Cardoso 186, 4150-212 Porto',
            'email' => 'cesae@cesae.pt'
        ];

        return $cesaeInfo;
    }

    protected function getContacts(){
        $contacts =[
        ['id' => 1, 'name'=> 'Tiago', 'phone' =>'912345987'],
        ['id' => 2, 'name'=> 'Rui', 'phone' =>'931756382'],
        ['id' => 3, 'name'=> 'Ruben', 'phone' =>'934023124'],
        ];

        return $contacts;
    }

    public function inserirUserIntoDB(){
        DB::table('users')->insert([
            'name' => 'Ruben',
            'email'=>'rubenpereira@gmail.com',
            'password'=>'008397'
        ]);
    }

    public function updateUserAtDB(){
        DB::table('users')->where('id', 1)
            ->update([
                'address' => ' Rua Flaviense, 1',
                'updated_at'=>now()
            ]);


    }

    protected function getAllUsersFromDB($search){

        $users = DB::table('users');

        if($search){
            //dd($search);
            $users = $users->where('name','LIKE',"%{$search}%")
            ->orWhere('email', $search);
        }

        $users=$users->get();

        return $users;
    }

    public function deleteUser($id){
        DB::table('gifts')
        ->where('user_id', $id)
        ->delete();

        DB::table('users')
        ->where('id', $id)
        ->delete();

        return back();
    }

    public function viewUser($id){
        $user = DB::table('users')
        ->where('id', $id)
        ->first();

        return view('users.view_user', compact('user'));
    }

    public function createUser(Request $request){
        //dd($request->all());

        /**Update User */
        if(isset($request->id)){

            $request->validate([
                'name'=> 'required|string|min:3',
                'address'=>'max:100',
                'nif'=>'max:15'
            ]);

            User::where('id', $request->id )
            ->update([
                'name' => $request->name,
                'address' =>$request->address,
                'nif' =>$request->nif
            ]);

            return redirect()->route('users.show')->with('message','User has been updated with success!');
        }else{

        $request->validate([
            'name'=> 'required|string|min:3|max:10',
            'email'=>'required|email|unique:users',
            'password'=>'required|min:8'
        ]);

        User::insert([
            'name'=> $request->name,
            'email'=>$request->email,
            'password'=>Hash::make($request->password)
        ]);

        return redirect()->route('users.show')->with('message','User has been added with success!');
    }
    }
}

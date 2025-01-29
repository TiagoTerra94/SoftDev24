<?php

namespace App\Http\Controllers;

use App\Models\Task;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class TaskController extends Controller
{
    public function showTasks(){

        $allTasks = $this -> getTasksInfo();
        $allTasksDB = $this ->getAllTasks();
        $availableTasks = $this ->getAvailableTasks();

        //dd($allTasksDB);


        return view('tasks.tasks', compact('allTasks', 'availableTasks', 'allTasksDB'));
    }

    private function getTasksInfo(){
        $tasksInfo =[
            ['name' => 'Rita', 'task' => 'Estudar Laravel'],
            ['name' => 'Joao', 'task' => 'Estudar MySQL']
        ];

        return $tasksInfo;
    }

    private function getAvailableTasks(){
        $availableTasks =[
            'SQL',
            'JS',
            'Java',
            'POO'
        ];

        return $availableTasks;
    }

    public function getAllTasks(){
        $allTasks = DB::table('tasks')
            ->join ('users', 'users.id', '=', 'tasks.user_id' )
            ->select('tasks.*', 'tasks.id','users.name as user_name')
            ->get();

        return $allTasks;
    }

    public function viewTask($id){
        $task = DB::table('tasks')
        ->join('users', 'users.id', '=', 'tasks.user_id')
        ->where('tasks.id', $id)
        ->select('tasks.*', 'users.name as username')
        ->first();

        return view('tasks.view_task', compact('task'));
    }

    public function deleteTask($id){
        DB::table('tasks')
        ->where('id', $id)
        ->delete();

        return back();
    }

    public function addTask(){
        $users = DB::Table('users')
            ->get();

        return view('tasks.add_task', compact('users'));
    }

    public function createTask(Request $request){

        $request->validate([
            'name'=> 'required|string|max:50',
            'description'=>'required|string',
            'user_id' => 'required'
        ]);

        Task::insert([
            'name'=> $request->name,
            'description'=>$request->description,
            'user_id'=>$request->user_id,
        ]);

        return redirect()->route('tasks')->with('message','Task has been added with success!');
    }
}

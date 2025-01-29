<?php

use App\Http\Controllers\TaskController;
use App\Http\Controllers\UserController;
use App\Http\Controllers\HomeController;
use App\Http\Controllers\GiftsController;
use Illuminate\Support\Facades\Route;

Route::get('/', function () {
    return view('welcome');
});

//Página Principal
Route::get('/home', [HomeController::class, 'index'])->name('home');

//Páginas de utilizadores
Route::get('/users', [UserController::class, 'allUsers'])->name('users.show');

//Página para ver dados de utilizador
Route::get('/users/{id}', [UserController::class, 'viewUser'])->name('users.view');

//Página para deletar utilizador
Route::get('/delete-user/{id}', [UserController::class, 'deleteUser'])->name('users.delete');

//Página para ver tasks
Route::get('/tasks/{id}', [TaskController::class, 'viewTask'])->name('tasks.view');

//Página para deletar task
Route::get('delete-task/{id}', [TaskController::class, 'deleteTask'])->name('tasks.delete');

//Página Hello
Route::get('/hello/{name}', function ($name) {//caminho do site
    return '<h1>Hello</h1>'.$name;//o que vai aparecer
});

//Página caso não existir
Route::fallback(function () {
    return view('fallback');
});

//Página de adicionar utilizadores
Route::get('/add-user', [UserController::class, 'addUsers'])->name('users.add');

//Página que faz POST para o server dos Users
Route::post('/create-user', [UserController::class, 'createUser'])->name('users.create');

//Página para adicionar tasks
Route::get('/add-task', [TaskController::class, 'addTask'])->name('tasks.add');

//Página para fazer POST para o server das Tasks
Route::post('/create-task', [TaskController::class, 'createTask'])->name('tasks.create');

Route::get('/remove-user', [UserController::class, 'removeUser'])->name('users.remove');

Route::get('/tasks', [TaskController::class, 'showTasks'])->name('tasks');

Route::get('/insert-user', [UserController::class, 'inserirUserIntoDB'])->name('users.insert');

Route::get('/gifts', [GiftsController::class, 'showGifts'])->name('gifts');



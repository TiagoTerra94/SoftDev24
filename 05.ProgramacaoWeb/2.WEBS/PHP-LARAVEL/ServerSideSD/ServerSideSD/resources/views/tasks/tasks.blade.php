@extends('layouts.fo_layout')
@section('content')
@if (session('message'))
<div class="alert alert-sucess" style="text-success">
    {{ session('message') }}
</div>
@endif

<h1>Tasks List</h1>
<table class="table">
    <thead>
      <tr>
        <th scope="col">ID</th>
        <th scope="col">Name Task</th>
        <th scope="col">User Id</th>
        <th scope="col">User Name</th>
        <th scope="col"></th>
        <th scope="col"></th>
      </tr>
    </thead>
    <tbody>
        @foreach ($allTasksDB as $allTask)
        <tr>
            <td>{{$allTask->id}}</td>
            <td>{{$allTask->name}}</td>
            <td>{{$allTask->user_id}}</td>
            <td>{{$allTask->user_name}}</td>
            <td><a class="btn btn-info" href="{{route('tasks.view', $allTask->id)}}">View</a></td>
            <td><a class="btn btn-danger" href="{{route('tasks.delete', $allTask->id)}}">Delete</a></td>
        </tr>
        @endforeach
    </tbody>
  </table>
  <br>
  <h5><a href="{{route('home')}}">Voltar</a></h5>
@endsection

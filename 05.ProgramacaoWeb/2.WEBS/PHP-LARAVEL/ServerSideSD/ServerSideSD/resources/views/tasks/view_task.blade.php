@extends('layouts.fo_layout')

@section('content')
<h4>Task Info: </h4>
<table class="table">
    <thead>
      <tr>
        <th scope="col">Name</th>
        <th scope="col">Responsavel</th>
        <th scope="col">Description</th>
        <th></th>
      </tr>
    </thead>
    <tbody>
        <tr>
            <td>{{$task->name}}</td>
            <td>{{$task->username}}</td>
            <td>{{$task->description}}</td>
        </tr>
    </tbody>
  </table>
@endsection

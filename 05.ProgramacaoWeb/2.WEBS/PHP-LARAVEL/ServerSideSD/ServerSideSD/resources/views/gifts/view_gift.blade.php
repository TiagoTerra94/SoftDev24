@extends('layouts.fo_layout')

@section('content')
<h4>Gift Info: </h4>
<table class="table">
    <thead>
      <tr>
        <th scope="col">Gift Name</th>
        <th scope="col">Predicted Value</th>
        <th scope="col">Spent Value</th>
        <th scope="col">To</th>
        <th></th>
      </tr>
    </thead>
    <tbody>
        <tr>
            <td>{{$gift->name}}</td>
            <td>{{$gift->valor_previsto}}</td>
            <td>{{$gift->valor_gasto}}</td>
            <td>{{$gift->username}}</td>
            <td><a class="btn btn-info" href="{{route('gifts.edit', $gift->id)}}">Edit</a></td>
        </tr>
    </tbody>
  </table>
@endsection

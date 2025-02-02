@extends('layouts.fo_layout')

@section('content')
<h4>User Info: </h4>

<table class="table">
    <thead>
      <tr>
        <th scope="col">Name</th>
        <th scope="col">Address</th>
        <th scope="col">Nif</th>
        <th></th>
      </tr>
    </thead>
    <tbody>
        <tr>
            <td>{{$user->name}}</td>
            <td>{{$user->address}}</td>
            <td>{{$user->nif}}</td>
        </tr>
    </tbody>
  </table>
@endsection

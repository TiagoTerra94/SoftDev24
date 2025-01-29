@extends('layouts.fo_layout')
@section('content')

@if (session('message'))
<div class="alert alert-sucess" style="text-success">
    {{ session('message') }}
</div>
@endif

    <h1>All Users</h1>
    <hr>
    <h6>{{$cesaeInfo['name']}}</h6>
    <h6>{{$cesaeInfo['address']}}</h6>
    <h6>{{$cesaeInfo['email']}}</h6>
    <hr>
    <table class="table">
        <thead>
          <tr>
            <th scope="col">id</th>
            <th scope="col">Name</th>
            <th scope="col">Email</th>
            <th scope="col"></th>
            <th scope="col"></th>
          </tr>
        </thead>
        <tbody>

            @foreach ($allUsers as $user)
            <tr>
            <th scope="row">{{$user->id}}</th>
                <td>{{$user->name}}</td>
                <td>{{$user->email}}</td>
                <td><a class="btn btn-info" href="{{route('users.view', $user->id)}}">More</a></td>
                <td><a class="btn btn-danger" href="{{route('users.delete', $user->id)}}">Delete</a></td>
            </tr>
            @endforeach


        </tbody>
      </table>
    <h5><a href="{{route('home')}}">Voltar</a></h5>
@endsection

@extends('layouts.fo_layout')
@section('content')
@if (session('message'))
<div class="alert alert-sucess" style="text-success">
    {{ session('message') }}
</div>
@endif
    <h1>Gifts List:</h1>
<table class="table">
    <thead>
      <tr>
        <th scope="col">Gift Name</th>
        <th scope="col">Predicted Value</th>
        <th scope="col">Spent Value</th>
        <th scope="col">Diff Value</th>
        <th scope="col">To</th>
        <th scope="col"></th>
        <th scope="col"></th>
      </tr>
    </thead>
    <tbody>
        @foreach ($allGiftsDB as $allGift)
        <tr>
            <td>{{$allGift->name}}</td>
            <td>{{$allGift->valor_previsto}}</td>
            <td>{{$allGift->valor_gasto}}</td>
            <td>{{$allGift->diff}}</td>
            <td>{{$allGift->user_name}}</td>
            <td><a class="btn btn-info" href="{{route('gifts.view', $allGift->id)}}">View/Edit</a></td>
            <td><a class="btn btn-danger" href="{{route('gifts.delete', $allGift->id)}}">Delete</a></td>
        </tr>
        @endforeach
    </tbody>
  </table>
  <br>
    <h5><a href="{{route('home')}}">Voltar</a></h5>
@endsection

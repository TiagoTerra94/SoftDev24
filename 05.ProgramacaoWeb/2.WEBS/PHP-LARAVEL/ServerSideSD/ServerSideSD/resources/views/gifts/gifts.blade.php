@extends('layouts.fo_layout')
@section('content')
    <h5>Gifts List:</h5>
<table class="table">
    <thead>
      <tr>
        <th scope="col">ID</th>
        <th scope="col">Gift</th>
        <th scope="col">To</th>
      </tr>
    </thead>
    <tbody>
        @foreach ($allGiftsDB as $allGift)
        <tr>
        <th scope="row">{{$allGift->id}}</th>
            <td>{{$allGift->name}}</td>
            <td>{{$allGift->user_name}}</td>
        </tr>
        @endforeach
    </tbody>
  </table>
    <h5><a href="{{route('home')}}">Voltar</a></h5>
@endsection

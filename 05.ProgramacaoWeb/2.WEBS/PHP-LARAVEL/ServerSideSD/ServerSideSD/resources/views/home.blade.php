@extends('layouts.fo_layout')
@section('content')
@auth
    <h1>Olá {{Auth::user()->name}}</h1>
@endauth
    <h5>Welcome to my database </h5>
    <h6>{{$myVar}}</h6>
    <h6>{{$contactInfo['nome']}}</h6>
    <img src="{{asset('images/image_001.jpg')}}" alt="Image not found" style="align-content: center">
@endsection

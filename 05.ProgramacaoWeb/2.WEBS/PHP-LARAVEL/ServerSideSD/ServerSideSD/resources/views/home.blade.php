@extends('layouts.fo_layout')
@section('content')
    <h5>Olá, estou em casa. </h5>
    <h6>{{$myVar}}</h6>
    <h6>{{$contactInfo['nome']}}</h6>
    <img src="{{asset('images/image_001.jpg')}}" alt="Image not found">
@endsection

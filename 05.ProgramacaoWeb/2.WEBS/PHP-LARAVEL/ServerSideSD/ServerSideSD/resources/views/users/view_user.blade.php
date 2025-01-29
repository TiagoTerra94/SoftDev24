@extends('layouts.fo_layout')

@section('content')
<h4>User Info: </h4>
<h6>Name: {{$user->name}}</h6>
<h6>Address: {{$user->address}}</h6>
<h6>Nif:  {{$user->nif}}</h6>
@endsection

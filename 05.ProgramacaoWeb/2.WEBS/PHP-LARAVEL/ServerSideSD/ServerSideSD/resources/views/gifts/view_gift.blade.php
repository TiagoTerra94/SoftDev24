@extends('layouts.fo_layout')

@section('content')
<h4>Gift Info: </h4>
<h6>Name: {{$gift->name}}</h6>
<h6>Predicted Value: {{$gift->valor_previsto}}</h6>
<h6>Spent Value: {{$gift->valor_gasto}}</h6>
<h6>To: {{$gift->username}}</h6>
@endsection

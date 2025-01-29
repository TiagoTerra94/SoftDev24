@extends('layouts.fo_layout')

@section('content')
<h4>Task Info: </h4>
<h6>Name: {{$task->name}}</h6>
<h6>Responsavel: {{$task->username}}</h6>
<h6>Description: {{$task->description}}</h6>
@endsection

@extends('layouts.fo_layout')
@section('content')
    @auth
        <h1>Olá {{ Auth::user()->name }}</h1>
        @if (Auth::user()->user_type == 1)
            <div class="alert alert-warning" role="alert">
                Conta Administrador
            </div>
        @endif

    @endauth
@endsection

@extends('layouts.fo_layout')
@section('content')
<h1>Edit User</h1>
<form action="{{route('users.create')}}" method="POST">
    @csrf
    <div class="mb-3">
    <input type="hidden" name="id" value="{{ $user->id }}">
      <label for="exampleInputEmail1" class="form-label">Email address</label>
      <input disabled type="email" class="form-control" name="email" aria-describedby="emailHelp" value="{{$user->email}}">
    </div>
    <div class="mb-3">
      <label for="exampleInputPassword1" class="form-label">Name</label>
      <input type="text" class="form-control" name="name" value="{{$user->name}}">
      @error('name')
        Invalid Name
      @enderror
    </div>
    <div class="mb-3">
        <label for="exampleInputPassword1" class="form-label">Morada</label>
        <input type="text" class="form-control" name="address" value="{{$user->address}}">
        @error('address')
            Invalid address
        @enderror
      </div>
      <div class="mb-3">
        <label for="exampleInputPassword1" class="form-label">NIF</label>
        <input type="text" class="form-control" name="nif" value="{{$user->nif}}">
        @error('nif')
        Invalid nif
        @enderror
      </div>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
  <h5><a class="btn btn-secondary" href="{{route('home')}}">Voltar</a></h5>
@endsection

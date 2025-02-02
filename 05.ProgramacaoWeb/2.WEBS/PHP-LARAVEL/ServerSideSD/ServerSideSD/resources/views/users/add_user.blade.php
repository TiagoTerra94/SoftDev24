@extends('layouts.fo_layout')
@section('content')
    <h1>Form Add User</h1>
    <form method="POST" action="{{route('users.create')}}">
        @csrf

        <div class="mb-3">
          <label for="exampleInputEmail1" class="form-label">Name: </label>
          <input type="text" class="form-control" name="name" aria-describedby="emailHelp">
        </div>
        @error('name')
            Invalid Name.
        @enderror

        <div class="mb-3">
          <label for="exampleInputPassword1" class="form-label">Email: </label>
          <input type="email" class="form-control" name="email">
          <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
        </div>
        @error('email')
            Invalid Email.
        @enderror

        <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Password: </label>
            <input type="password" class="form-control" name="password">
          </div>
        @error('password')
            Invalid Password.
        @enderror

        <button type="submit" class="btn btn-primary">Submit</button>
      </form>
      <br>
    <h5><a href="{{route('home')}}">Voltar</a></h5>
@endsection

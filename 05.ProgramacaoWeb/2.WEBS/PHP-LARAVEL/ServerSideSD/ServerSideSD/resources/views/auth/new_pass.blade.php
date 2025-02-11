@extends('layouts.fo_layout')
@section('content')
<form method="POST" action="{{route('password.update')}}">
    @csrf
    <div class="mb-3">
      <label for="exampleInputEmail1" class="form-label">Email address</label>
      <input name="email" value="{{request()->email}}" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
    </div>
    <div class="mb-3">
      <label for="exampleInputPassword1" class="form-label">Password</label>
      <input name="password" type="password" class="form-control" id="exampleInputPassword1" placeholder="Type new password">
    </div>
    <div class="mb-3">
        <label for="exampleInputPassword1" class="form-label">Password Confirmation</label>
        <input name="password_confirmation" type="password" class="form-control" id="exampleInputPassword1" placeholder="Confirm new password"/>
      </div>
    <input type="hidden" name="token" value="{{request()->route('token')}}">
    <button type="submit" class="btn btn-primary">Submit new pass</button>
  </form>
@endsection

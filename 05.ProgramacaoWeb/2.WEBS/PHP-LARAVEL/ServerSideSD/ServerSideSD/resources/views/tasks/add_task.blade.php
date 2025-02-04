@extends('layouts.fo_layout')
@section('content')
    <h1>Form Add Task</h1>
    <form method="POST" action="{{route('tasks.create')}}">
        @csrf

        <div class="mb-3">
          <label for="nametask" class="form-label">Name Task: </label>
          <input type="text" class="form-control" name="name" aria-describedby="emailHelp">
        </div>
        @error('name')
            Invalid name.
        @enderror

        <div class="mb-3">
          <label for="descriptiontask" class="form-label">Description: </label>
          <input type="text" class="form-control" name="description">
        </div>
        @error('description')
            Invalid description.
        @enderror

        <div class="mb-3">
            <label for="useridtask" class="form-label">User: </label>
            <select name="user_id" class="form-select">
                <option value="">--Please choose an option--</option>
                @foreach ($users as $user)
                    <option value="{{$user -> id}}">{{$user->name}}</option>
                @endforeach
            </select>
        </div>
        @error('user_id')
            Invalid user.
        @enderror

        <button type="submit" class="btn btn-primary">Submit</button>
      </form>
      <br>
      <h5><a class="btn btn-secondary" href="{{route('home')}}">Voltar</a></h5>
@endsection

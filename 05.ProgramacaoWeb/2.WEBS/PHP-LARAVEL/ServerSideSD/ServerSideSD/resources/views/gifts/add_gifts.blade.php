@extends('layouts.fo_layout')
@section('content')
    <h1>Form Add Gift</h1>
    <form method="POST" action="{{route('gifts.create')}}">
        @csrf

        <div class="mb-3">
          <label for="nametask" class="form-label">Name Gift: </label>
          <input type="text" class="form-control" name="name" aria-describedby="emailHelp">
        </div>
        @error('name')
            Invalid name.
        @enderror

        <div class="mb-3">
          <label for="descriptiontask" class="form-label">Predicted Value: </label>
          <input type="number" class="form-control" name="valor_previsto">
        </div>
        @error('valor_previsto')
            Invalid value.
        @enderror

        <div class="mb-3">
            <label for="descriptiontask" class="form-label">Spent Value: </label>
            <input type="number" class="form-control" name="valor_gasto">
          </div>
          @error('valor_gasto')
              Invalid value.
          @enderror

        <div class="mb-3">
            <label for="useridtask" class="form-label">To: </label>
            <select name="users_id" class="form-select">
                <option value="">--Please choose an option--</option>
                @foreach ($users as $user)
                    <option value="{{$user->id}}">{{$user->name}}</option>
                @endforeach
            </select>
        </div>
        @error('users_id')
            Invalid user.
        @enderror

        <button type="submit" class="btn btn-primary">Submit</button>
      </form>
      <br>
      <h5><a class="btn btn-secondary" href="{{route('home')}}">Voltar</a></h5>
@endsection

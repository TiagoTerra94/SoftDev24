@extends('layouts.fo_layout')
@section('content')
    <h1>Edit Gift</h1>
    <form method="POST" action="{{ route('gifts.update', $gift->id) }}">
        @csrf
        @method('PUT')

        <div class="mb-3">
          <label for="nametask" class="form-label">Name Gift: </label>
          <input type="text" class="form-control" name="name" aria-describedby="emailHelp" value="{{$gift->name}}" required>
        </div>
        @error('name')
            Invalid name.
        @enderror

        <div class="mb-3">
          <label for="predictedvalue" class="form-label">Predicted Value: </label>
          <input type="number" class="form-control" name="valor_previsto" value="{{$gift->valor_previsto}}">
        </div>
        @error('valor_previsto')
            Invalid value.
        @enderror

        <div class="mb-3">
            <label for="spentvalue" class="form-label">Spent Value: </label>
            <input type="number" class="form-control" name="valor_gasto" value="{{$gift->valor_gasto}}">
          </div>
          @error('valor_gasto')
              Invalid value.
          @enderror

        <div class="mb-3">
            <label for="useridtask" class="form-label">To: </label>
            <select name="users_id" class="form-select">
                <option value="">--Please choose an option--</option>
                @foreach ($users as $user)
                    <option value="{{$user->id}}" required>{{$user->name}}</option>
                @endforeach
            </select>
        </div>
        @error('users_id')
            Invalid user.
        @enderror

        <button type="submit" class="btn btn-primary">Submit Changes</button>
      </form>
      <br>
    <h5><a href="{{route('gifts')}}">Voltar</a></h5>
@endsection

@extends('layouts.fo_layout')
@section('content')
    @if (session('message'))
        <div class="alert alert-sucess" style="text-success">
            {{ session('message') }}
        </div>
    @endif

    <h1>All Users</h1>
    <hr>
    <h6>{{ $cesaeInfo['name'] }}</h6>
    <h6>{{ $cesaeInfo['address'] }}</h6>
    <h6>{{ $cesaeInfo['email'] }}</h6>
    <hr>

    <form action="">
        <input type="text" id="" name="search">
        <button type="submit" class="btn btn-secondary" value="{{ request()->query('search') }}">Search</button>
    </form>
    <br>
    <table class="table">
        <thead>
            <tr>
                <th scope="col">Photo</th>
                <th scope="col">Name</th>
                <th scope="col">Email</th>
                <th scope="col">Address</th>
                <th scope="col">Nif</th>

                <th scope="col"></th>

            </tr>
        </thead>
        <tbody>

            @foreach ($allUsers as $user)
                <tr>
                    <td><img style="width: 50px; height:50px" src="{{$user->photo? asset('storage/'.$user->photo) : asset('images/no_photo.jpg')}}" alt=""></td>
                    <td>{{ $user->name }}</td>
                    <td>{{ $user->email }}</td>
                    <td>{{ $user->address }}</td>
                    <td>{{ $user->nif }}</td>

                    <td><a class="btn btn-info" href="{{ route('users.view', $user->id) }}">View/Edit</a>

                        @auth
                            @if (Auth::user()->email == 'ruicruz@email.com')
                                <a class="btn btn-danger" href="{{ route('users.delete', $user->id) }}">Delete</a>
                            @endif
                        @endauth

                    </td>
                </tr>
            @endforeach


        </tbody>
    </table>
    <br>
    <h5><a class="btn btn-secondary" href="{{ route('home') }}">Voltar</a></h5>
@endsection

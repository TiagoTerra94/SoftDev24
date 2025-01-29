<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="{{asset('css/style.css')}}">
</head>

<body>
    <nav id="nav" class="navbar navbar-expand-lg">
        <div class="container-fluid">
          <a class="navbar-brand" href="#">BD XPTO</a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="{{route('home')}}">Home</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="{{ route('users.show') }}">All Users</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="{{ route('users.add')}}">Add Users</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="{{ route('users.remove')}}">Remove Users</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="{{ route('tasks')}}">Tasks</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="{{ route('tasks.add')}}">Add Tasks</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="{{ route('gifts')}}">Gifts</a>
              </li>
            </ul>
            <form class="d-flex" role="search">
              <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
              <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
          </div>
        </div>
      </nav>

      <div class="container">

        @yield('content')

        </div>
      <!--ScriptJs-->
      <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
      <a href="javascript:void(0);" class="icon" onclick="myFunction()">&#9776;</a>
    </body>
</html>

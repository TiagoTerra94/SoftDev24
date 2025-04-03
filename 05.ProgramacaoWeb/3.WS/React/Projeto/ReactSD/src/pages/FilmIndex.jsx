import { useState, useEffect } from "react"
import starwarsmovies from "../assets/starwars_movies.jpg"
import Films from "../components/Films";

export default function AvailableFilms(){

    const [availableFilm, setFilm] = useState(null)

     useEffect(() => {
        fetch("http://swapi.dev/api/films")
          .then((response) => response.json())
          .then((resData) => {
            setFilm(resData.results);
          });
      }, []);

    return(
        <>
        <div>
            <img src={starwarsmovies} alt="Movies" />
            <h1>Movie Picker</h1>
            <p>In a World VERY VERY VERY FAR AWAY</p>
        </div>
        <main>
        <Films
            title="Available Film"
            films={availableFilm}
            fallbackText="No Film Available"
        />
        </main>
        </>
    )
}
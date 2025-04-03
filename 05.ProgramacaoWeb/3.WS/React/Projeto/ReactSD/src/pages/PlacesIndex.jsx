import { useEffect, useState, useRef, useCallback } from "react";
import Places from "../components/places/Places";
import globeImg from "../components/places/globe.png";
import { updatePlaces } from "../http";


export default function AvailablePlaces() {  
  
  //Hook useState e useEffect
  const [availablePlaces, setPlaces] = useState(null)
  const [userPlaces, setUserPlaces] = useState([])
  const selectedPlace = useRef(null)

  useEffect(() => {
    fetch("http://localhost:3000/places")
      .then((response) => response.json())
      .then((resData) => {
        setPlaces(resData.places);
      });
  }, []);

 function handleSelectedPlace(selectedPlace) {

  //primeiro mostramos ao utilizador que esta tudo certo
   setUserPlaces((prevPickedPlaces) => {
     if (!prevPickedPlaces) {
       prevPickedPlaces = [];
     }
     if (prevPickedPlaces.some((place) => place.id === selectedPlace.id)) {
       return prevPickedPlaces;
     }
     return [selectedPlace, ...prevPickedPlaces];
   });

   //faz pedido put para o backend, para enviar à api
     updatePlaces([selectedPlace, ...userPlaces]);
 }

 const handleRemovePlace = useCallback(
   async function handleRemovePlace() {
     setUserPlaces((prevPickedPlaces) =>
       prevPickedPlaces.filter((place) => place.id !== selectedPlace.current.id)
     );
     updatePlaces(
       userPlaces.filter((place) => place.id != selectedPlace.current.id)
     );
   },
   [userPlaces]
 );

 function handleStartRemovePlace(place) {
  selectedPlace.current = place;
  handleRemovePlace()
}

  return (
    <>
    <div>
      <img src={globeImg} alt="Stylized globe" />
      <h1>PlacePicker</h1>
      <p>
        Create your personal collection of places you would like to visit or
        you have visited.
      </p>
    </div>
    <main>
    <Places
        title="My Selected Places"
        fallbackText="Select Your Places"
        places ={userPlaces}
        onSelectPlace={handleStartRemovePlace}
      />
      <Places
        title="Available Places"
        places={availablePlaces}
        fallbackText="No Places Available"
        onSelectPlace={handleSelectedPlace}
      />
    </main>
  </>
  );
}

import EasterGifts from "../components/EasterGifts.jsx"
import { useState, useEffect } from "react";
import { TabButton } from "../components/TabButton.jsx";

export default function AvailableEasterGifts() {
  // Hook useState para alterar valor da variável
  const [availableGifts, setGifts] = useState(null);

  useEffect(() => {
      fetch("http://localhost:3000/gifts")
        .then((response) => response.json())
        .then((resData) => {
          setGifts(resData.gifts);
        });
    }, []);

  
  return (
    <>
    <div>
      <h2>Prendas da Páscoa</h2>
      </div>
      <main>
        <EasterGifts
          title="Gifts"
          gifts={availableGifts}
          fallbackText="No gifts available"
        />
      </main>
    </>
  );
}

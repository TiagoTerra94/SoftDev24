import { easterGifts} from "../data/easterGifts.js";
import { useState } from "react";
import { TabButton } from "../components/TabButton.jsx";

export default function EasterGifts() {
  // Hook useState para alterar valor da variável
  const [content, setContent] = useState();

  // Função que define o estado
  function handleSelect(name) {
    setContent(name);
  }

  // Encontrar o objeto correto no array
  //const selectedGift = eastergift.find((gift) => gift.name === content);

  return (
    <div>
      <h2>Prendas da Páscoa</h2>
      <nav>
        <TabButton
          active={content === "Sara"}
          onSelect={() => handleSelect("Sara")}
        >
          Sara
        </TabButton>
        <TabButton
          active={content === "Fred"}
          onSelect={() => handleSelect("Fred")}
        >
          Fred
        </TabButton>
      </nav>

      {content? (
        easterGifts.map(
          (item) =>
            item.name === content && (
              <div id="tab-content">
                    <h3>{item.name}</h3>
                    <p>{item.gift}</p>
                    <p>{item.price}</p>
              </div>
            )
        )
      ) : (
        <p className="p-red">Não ha prendas para mostrar</p>
      )}
    </div>
  );
}

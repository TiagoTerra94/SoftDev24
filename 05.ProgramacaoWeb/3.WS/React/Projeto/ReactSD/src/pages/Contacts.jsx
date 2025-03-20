import { userData } from "../data/data";
import {useParams} from "react-router-dom"

export default function Contacts() {
  let { name } = useParams();
  return (
    <div>
      <h5>Olá { name }</h5>
      <h2>Contactos</h2>
      {userData.map((item) => (
        <div key={item.title}>
          <h4>Name: {item.firstName} {item.lastName}</h4>
          <h4> Email: {item.email}</h4>
        </div>
      ))}
    </div>
  );
}

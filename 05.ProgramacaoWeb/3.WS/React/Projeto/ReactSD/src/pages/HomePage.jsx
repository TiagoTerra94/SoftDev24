import { useContext } from "react";
import { Link, useLocation } from "react-router-dom";
import { AuthContext } from "../contexts/AuthContext";
import { TabButton } from "../components/TabButton";


export default function HomePage(){
    const location = useLocation();
    const message = location.state?.message || null;
    const {user, logout} = useContext(AuthContext);

    console.log(user)

    return(
    <div>
        {message && <div>{message}</div>}
        <h5>As Minhas Funcionalidades</h5>
        <ul>
            <li><Link to="/shopping">ShoppingList</Link></li>
            <li><Link to="/contacts/Tiago">Contactos</Link></li>
            <li><Link to="/eastergifts">Prendas</Link></li>
            <li><Link to="/places">Places</Link></li>
            <li><Link to="/starwarsmovies">Star Wars Movies</Link></li>
            {!user ? 
            <div>
                <li><Link to="/register">Register</Link></li>
                <li><Link to="/login">Login</Link></li>
            </div> :
            <li><TabButton onSelect={logout}>Logout</TabButton></li>}
        </ul>
    </div>);
}
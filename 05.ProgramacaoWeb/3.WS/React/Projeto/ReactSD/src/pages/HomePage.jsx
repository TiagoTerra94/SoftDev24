import { Link, useLocation } from "react-router-dom";


export default function HomePage(){
    const location = useLocation();
    const message = location.state?.message || null;

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
            <li><Link to="/register">Register</Link></li>
            <li><Link to="/login">Login</Link></li>
        </ul>
    </div>);
 
}
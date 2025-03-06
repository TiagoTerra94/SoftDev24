import './Card.css'

export default function Card(props){
  return(
    <div className='card'>
      <h4>Name: {props.firstName} {props.lastName}</h4>
      <h4>Title: {props.title}</h4>
    </div>
  ); 
}

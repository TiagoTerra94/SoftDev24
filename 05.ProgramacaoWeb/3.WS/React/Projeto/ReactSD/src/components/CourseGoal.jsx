export default function CourseGoal({title = 'Java', description = 'Fazer Algoritmos Incríveis'}){
    return(
        <div>
            <h2>Curso: {title}</h2> 
            <p>Descrição: {description}</p>
        </div>
    )
}
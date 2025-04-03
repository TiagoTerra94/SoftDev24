

export default function Films({title, films = null, fallbackText}){
    return(
        <section className="movies-category">
            <h2>{title}</h2>
            {(!films || films.length === 0) && <p className="fallback-text">{fallbackText}</p>}
            {films && films.length > 0 && (
                <ul className="films">
                    {films.map((film)=>(
                        <li key={film.title}>
                            <h3>{film.title}</h3>
                            <h3>{film.opening_crawl}</h3>
                            <h3>{film.release_date}</h3>
                        </li>
                    ))}
                </ul>
            )}
        </section>
    )
}
export default function Gifts({name, gifts = null, fallbackText}){
    return(
        <section>
            <h2>{name}</h2>
            {(!gifts || gifts.length === 0) && <p>{fallbackText}</p>}
            {gifts && gifts.length > 0 && (
                <ul>
                    {gifts.map((gift)=>(
                        <li key={gift.title}>
                            <h3>{gift.name}</h3>
                            <h3>{gift.title}</h3>
                            <h3>{gift.gift}</h3>
                            <h3>{gift.price}</h3>
                        </li>
                    ))}
                </ul>
            )}
        </section>
    )
}
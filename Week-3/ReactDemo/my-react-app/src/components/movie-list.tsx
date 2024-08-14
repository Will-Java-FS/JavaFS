//this component dynamically generates multiple JSX elements
export function MovieList() {

    const movies = ["Thor", "Iron Man", "Captain America", "Black Panther"];

    //this will loop through our movies array and return JSX list elements
    const movieListItems = movies.map(m => <li key = {m}>{m}</li>);

    return(
        <>
        <ul>
            {movieListItems}
        </ul>
        </>
    )

}
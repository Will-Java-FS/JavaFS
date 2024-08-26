import axios from "axios";
import { useState } from "react";

export default function Pokemon() {

    const [pokemons, setPokemons] = useState([]);

    //asynchronous function to connect to our base endpoint
    const getData = async () => {

        //axios will return a response with our function
        const response = await axios.get(
            "https://pokeapi.co/api/v2/pokemon?limit=30"
        );

        console.log(response.data)
        //the response is stored as data, so  anything must be accessed using response.data
        setPokemons(response.data.results);
    };

    return (
        <>
        <table>
            <tr>
                <th>Name</th>
                <th>Link</th>
            </tr>
            <tbody>
                {pokemons && pokemons.map && 
                pokemons.map((pokemon : {name: string, url: string}, index) => (
                    <tr key={pokemon.name}>
                        <td>{index}</td>
                        <td>{pokemon.name}</td>
                        <td>{pokemon.url}</td>
                    </tr>
                ))

                }
            </tbody>
        </table>
        <button onClick={getData}>Get Pokemon</button>
        </>
    )
}
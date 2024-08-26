import { useState } from "react";

//this component uses State
export default function Counter() {

    //let value = 0;

    /*function increase(){
        value++;
        console.log(value);
    }*/


    const [value, setValue] = useState(0);

    function increase() {
        setValue(value + 1);
        console.log(value);
    }

    return(
        <>
        <h3>The value is {value}</h3>
        <button onClick={increase}>Increase!</button>
        </>
    )
}
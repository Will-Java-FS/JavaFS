//function component
//Pascal casing for function names (for components)
export default function Intro(){

    const name = "Kelsey Morrison";

    //a react component returns JSX element
    //shorthand for <React.Fragment> -> <>
    return(
        <>
        <h1>Hello, World!</h1>
        <p>Welcome to my app! My name is {name}</p>
        </>
    )

}
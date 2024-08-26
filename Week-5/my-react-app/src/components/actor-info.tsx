/**
 * 
 * @param props {{name:string, age:number, worth: number}}
 * @returns 
 */
export function Actor(props: {name:string, age:number, worth: number}) {

    const name = props.name;
    const age = props.age;
    const worth = props.worth;

    //this is useful in JS projects
    //const {name, age, worth} = props;

    console.log(name, age, worth);

    return(<>
        <table>
            <tbody>
                <tr>
                    <td>Name: </td>
                    <td>{name}</td>
                </tr>
                <tr>
                    <td>Age: </td>
                    <td>{age}</td>
                </tr>
                <tr>
                    <td>Worth: </td>
                    <td>{worth}</td>
                </tr>
            </tbody>
        </table>
    </>)
}
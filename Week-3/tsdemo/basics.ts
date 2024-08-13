
//explicitly declared
let isSunny: boolean = true; //boolean
let numberOne: number = 1; //number
let word: string = "Hello, World!";//string
let bigNumber: bigint; //big int

//let guid: symbol

//implicitly declared
//let car = "toyota";// type inference

let numbers: number[] = [1, 2, 3, 4];//array
let words: Array<string> = ["Hello", "Hey", "Hi"] //this is using generics!

function add(a: number, b: number){
    return a + b;
}

let func = (c: number): number => {return c}; //arrow function syntax

//object creation
const house: { type: string, bedrooms: number, bathrooms: number, age: number} =
{
    type: "single-family home",
    bedrooms: 3,
    bathrooms: 2,
    age: 45
}

console.log(house)
console.log(house.type)

//Aliases
type car = "Toyota" | "Ford" | "Honda";

let car1: car = "Honda";
let car2: car = "Ford";
let car3: car = "Toyota";

//Interfaces
interface Animal {
    size: string,
    age: number
}

interface Dog extends Animal {
    breed: string,
    color: string
}

const dog: Dog = {
    size: "Large",
    age: 11,
    breed: "Husky",
    color: "black"
}

console.log(dog);

//Tuples
let myTuple: [boolean, string, number, boolean] 

myTuple = [true, "Purple", 14, false]
console.log(myTuple)
myTuple.push(false)
console.log(myTuple)

let otherTuple: readonly[string, number]=["Large Pizza", 12.99];
//otherTuple.push(true)

//union types
function checkType(variable: string | boolean){
    console.log(`the value is  ${variable} `)
}
console.log(checkType(false))
console.log(checkType("true"))

//Enums
//string enum

enum dropdown {
    IT = "IT Deparment",
    HR = "Human Resources",
    F = "Finance"
}

console.log(dropdown.HR)

//numerical enum
enum zipCode {
    Columbus = 100,
    NewYork,
    Miami = 200,
    LosAngeles
}

console.log(zipCode.NewYork)
console.log(zipCode.LosAngeles)

//console.log("Purple Cat");
//console.log(word);
//console.log(add(9, 17));
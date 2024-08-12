
//implicitly declared
let isSunny = true; //boolean
let numberOne = 1; //number
let word = "Hello, world"; //string
//using type inference based on data passed in

//to have explicit type checking active
//explicitly declared
let isSunny2:boolean = true; //boolean
let numberOne2:number= 1; //number
let word2:string = "Hello, world"; //string
let bigNumber:bigint;

//type dog="beagle" | "Dalmation";
//let puppy: dog = "Dalmation";
//type dog = {size: string, age: number}

//let car = "toyota";//type inference in action

let numbers: number[]=[1,2,3,4];//array
let words: Array<string>=["Hello","Hey","Hi"];//this is using generics
//calling interface array, generic interface with Array 
//making an array of type string

function add(a:number, b: number){
    return a + b;
}

let func = (c:number) => {return c}; //arrow function

//object creation
const house: {type:string, bedrooms:number, bathrooms:number, age:number}
={
    type:"single family home",
    bedrooms: 3,
    bathrooms: 2,
    age: 45
}

console.log(house)
console.log(house.type)

//Aliases
type car = "Toyota" | "Ford" | "Honda";

let car1:car="Honda";
let car2:car="Ford";
let car3:car="Toyota";

//Interfaces
interface Animal {
    size: string,
    age: number
}

interface Dog extends Animal {
    breed: string,
    color: string
}

const dog: Dog ={
    size: "Large",
    age: 11,
    breed: "Husky",
    color: "black"
}

console.log(dog);

//Tuples
let myTuple: [boolean,string,number,boolean] 

myTuple=[true, "Purple",14,false]

console.log(myTuple)
myTuple.push(false)
console.log(myTuple)

let otherTuple: readonly[string,number]=["large pizza",12.99];
//readonly does not have push cannot otherTuple.push(true)


//union types
function checkType(variable: string|boolean){
    console.log(`the value is ${variable}`)
}

console.log(checkType(false))
console.log(checkType("true"))

//Enums
//string enum

enum dropdown {
    IT = "IT Department",
    HR = "Human Resources",
    F = "Finance"
}

console.log(dropdown.HR)


//numerical enum
enum zipCode {
    Columbus = 43567,
    NewYork,
    Miami,
    LosAngeles
}

console.log(zipCode.Miami)


// console.log("purple cat");
// console.log(word);

// console.log(add(9,17));











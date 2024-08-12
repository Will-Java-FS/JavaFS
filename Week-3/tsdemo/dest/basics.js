"use strict";
//implicitly declared
let isSunny = true; //boolean
let numberOne = 1; //number
let word = "Hello, world"; //string
//using type inference based on data passed in
//to have explicit type checking active
//explicitly declared
let isSunny2 = true; //boolean
let numberOne2 = 1; //number
let word2 = "Hello, world"; //string
let bigNumber;
//type dog="beagle" | "Dalmation";
//let puppy: dog = "Dalmation";
//type dog = {size: string, age: number}
//let car = "toyota";//type inference in action
let numbers = [1, 2, 3, 4]; //array
let words = ["Hello", "Hey", "Hi"]; //this is using generics
//calling interface array, generic interface with Array 
//making an array of type string
function add(a, b) {
    return a + b;
}
let func = (c) => { return c; }; //arrow function
//object creation
const house = {
    type: "single family home",
    bedrooms: 3,
    bathrooms: 2,
    age: 45
};
console.log(house);
console.log(house.type);
let car1 = "Honda";
let car2 = "Ford";
let car3 = "Toyota";
const dog = {
    size: "Large",
    age: 11,
    breed: "Husky",
    color: "black"
};
console.log(dog);
//Tuples
let myTuple;
myTuple = [true, "Purple", 14, false];
console.log(myTuple);
myTuple.push(false);
console.log(myTuple);
let otherTuple = ["large pizza", 12.99];
//readonly does not have push cannot otherTuple.push(true)
//union types
function checkType(variable) {
    console.log(`the value is ${variable}`);
}
console.log(checkType(false));
console.log(checkType("true"));
//Enums
//string enum
var dropdown;
(function (dropdown) {
    dropdown["IT"] = "IT Department";
    dropdown["HR"] = "Human Resources";
    dropdown["F"] = "Finance";
})(dropdown || (dropdown = {}));
console.log(dropdown.HR);
//numerical enum
var zipCode;
(function (zipCode) {
    zipCode[zipCode["Columbus"] = 43567] = "Columbus";
    zipCode[zipCode["NewYork"] = 43568] = "NewYork";
    zipCode[zipCode["Miami"] = 43569] = "Miami";
    zipCode[zipCode["LosAngeles"] = 43570] = "LosAngeles";
})(zipCode || (zipCode = {}));
console.log(zipCode.Miami);
// console.log("purple cat");
// console.log(word);
// console.log(add(9,17));

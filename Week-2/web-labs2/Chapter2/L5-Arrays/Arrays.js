/**
 * Arrays are not of a fixed length in JavaScript - you can access and set values using the [] operators like
 * you may be used to, but now you can also add and remove elements from arrays using push and pop methods.
 *
 * Array-specific methods such as map, filter, reduce, and foreach also see a lot of use in JavaScript, and will
 * also become increasingly important in the JavaScript frameworks you'll be learning later. Those will be discussed
 * in a future activity.
 */
let content = document.getElementById("content");
let input = document.getElementById("input");
let pushButton = document.getElementById("pushButton");
let popButton = document.getElementById("popButton");
let length = document.getElementById("length");
let arr = [];
content.innerText=arr;
length.innerText=0;

pushButton.onclick = updatePush;
popButton.onclick = updatePop;

/**
 * on button click, grab the input value, have the arrPush function push the value to arr, and update the site
 * no need to change this function
 */
function updatePush(){
    arrPush(input.value);
    content.innerText=arr;
    length.innerText=arrLength();
}
/**
 * on button click, have the arrPush function pop a value from arr, and update the site
 * no need to change this function
 */
function updatePop(){
    arrPop();
    content.innerText=arr;
    length.innerText=arrLength();
}
/**
 * TODO: push a new value to the arr array.
 * @param item a new value
 */
function arrPush(item){
}
/**
 * TODO: pop a value from the arr array.
 */
function arrPop(){
}
/**
 * TODO: return the length of arr
 */
function arrLength(){
}
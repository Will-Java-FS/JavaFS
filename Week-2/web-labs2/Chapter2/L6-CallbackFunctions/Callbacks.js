/**
 * This lab will have you interact with the Array methods map, filter, and reduce.
 * It will also have you interact with callback functions, which are functions passed as parameters, since the
 * map, filter, and reduce methods rely on callback functions.
 * You can read more about all the array methods here:
 * https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array
 * You can read more about callback functions here:
 * https://developer.mozilla.org/en-US/docs/Glossary/Callback_function
 */
let original = document.getElementById("original");
let afterFilter = document.getElementById("afterFilter");
let afterMap = document.getElementById("afterMap");
let originalArray = ["Homer", "Marge", "Bart", "Lisa", "Maggie", "Principal Skinner", "Mr Burns", "Moe", "Ned Flanders"]
original.innerText = originalArray;
afterFilter.innerText = arrFilter(originalArray);
afterMap.innerText = arrMap(originalArray);
arrForEach(originalArray);
/**
 * TODO: return the result of the arr.filter method when using the containsSpace as a callback function.
 * This should return an array of only items of arr that do not contain a space.
 * I'll provide this first one to you: return arr.filter(containsSpace);
 */
function arrFilter(arr){
//    code here
}
/**
 * TODO: return the result of the arr.map method when using the convertToUppercase as a callback function.
 * This should return an array of the items of arr, all converted to uppercase characters.
 */
function arrMap(arr){
//    code here
}
/**
 * TODO: return the result of the arr.forEach method when using the filterContainsSpace as a callback function.
 * This won't modify the site, but if you open up the developer console (f12 by default) you can see every character
 * logged to the console. (this is the equivalent of System.out.println)
 */
function arrForEach(arr){
//    code here
}
/**
 * function intended to be used as a callback in array.filter
 * @param str a string (single element of an array of strings)
 * @returns true if str contains a space, false if it does not
 */
function containsSpace(str){
    if(str.includes(" ")){
        return true;
    }else{
        return false;
    }
}

/**
 * function intended to be used as a callback in array.map
 * @param str
 * @returns uppercase of str
 */
function convertToUppercase(str){
    return str.toUpperCase();
}
/**
 * function intended to be used as a callback in array.forEach
 * @param str a string (single element of an array of strings)
 */
function consoleLogEachItem(str){
    console.log(str);
}
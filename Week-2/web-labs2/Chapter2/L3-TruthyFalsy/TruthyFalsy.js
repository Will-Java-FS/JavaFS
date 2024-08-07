/**
 * This lab will demonstrate the use of truthy & falsy values.
 * check out the function & documentation below.
 *
 * More info on truthy & falsy here:
 * https://developer.mozilla.org/en-US/docs/Glossary/Truthy
 */

let r1 = document.getElementById("r1");
let r2 = document.getElementById("r2");
let r3 = document.getElementById("r3");
let r4 = document.getElementById("r4");
let r5 = document.getElementById("r5");
let r6 = document.getElementById("r6");
let r7 = document.getElementById("r7");
let r8 = document.getElementById("r8");
let r9 = document.getElementById("r9");
let r10 = document.getElementById("r10");
r1.innerText = isTruthyOrFalsy(true);
r2.innerText = isTruthyOrFalsy(false);
r3.innerText = isTruthyOrFalsy(0);
r4.innerText = isTruthyOrFalsy(1);
r5.innerText = isTruthyOrFalsy("");
r6.innerText = isTruthyOrFalsy("abc");
r7.innerText = isTruthyOrFalsy({});
r8.innerText = isTruthyOrFalsy({property:"value"});
r9.innerText = isTruthyOrFalsy(null);
r10.innerText = isTruthyOrFalsy(undefined);

/**
 * TODO: from what you know about type coercion, putting a variable inside of an if statement should coerce into
 * a boolean value if the variable is not already a boolean. However, this results in a situation in which certain
 * values coerce to true, and others coerce to false - "truthy" and "falsy" values. As a general rule, 0, null,
 * undefined, "", and false all coerce to false, and everything else coerces to true.
 *
 * Fill out the remainder of the method: if(value), return true, otherwise, return false. Then, open the html
 * file in your browser to verify the list of truthy and false values.
 * @param value
 */
function isTruthyOrFalsy(value){
    if(value){

    }else{

    }
}
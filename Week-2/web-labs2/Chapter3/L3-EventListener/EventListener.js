/**
 * as your site grows in size and complexity, you will most likely need to keep track of many user interactions
 * simultaneously. For instance, when a user moves their mouse or clicks on elements, we may want to not only
 * perform the basic functionality of the site, but we may want to also store analytic data, perform styling changes,
 * and spawn obnoxious pop-up ads - all at the same time. Using 'onclick' has worked so far, but limits us to a single
 * function that fires when the click event happens. With event listeners, we can have multiple functions fire on a
 * single event, and also introduce a bit more customization of events later on.
 *
 * https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/addEventListener
 */
let button1 = document.getElementById("button1");
let button2 = document.getElementById("button2");
let reset = document.getElementById("reset");
let text1 = document.getElementById("text1");
let text2 = document.getElementById("text2");
let text3 = document.getElementById("text3");
//set the initial text
resetText()
//example eventListener
reset.addEventListener("click", resetText);
/**
 * TODO: add four new event listeners: when button1 is clicked, both updateTextOnButton1Click and
 * updateTextOnEitherButtonClick should fire. when button2 is clicked, both updateTextOnButton2Click and
 * updateTextOnButton2Click should fire.
 */

//code here





/**
 * When the reset button is clicked, reset the text fields to their original states.
 * dont change this method
 */
function resetText(){
    text1.innerText = "this text will change when button1 is clicked";
    text2.innerText = "this text will change when either button1 or button2 is clicked";
    text3.innerText = "this text will change when button2 is clicked";
}

/**
 * update the text1 element
 * dont change this method
 */
function updateTextOnButton1Click(){
    text1.innerText = "button1 clicked";
}
/**
 * update the text2 element
 * dont change this method
 */
function updateTextOnEitherButtonClick(){
    text2.innerText = "either button1 or button2 clicked";
}
/**
 * update the text3 element
 * dont change this method
 */
function updateTextOnButton2Click(){
    text3.innerText = "button2 clicked";
}
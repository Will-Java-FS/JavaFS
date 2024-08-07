/**
 * This exercise will discuss how to create & append elements to the page in JavaScript.
 * https://developer.mozilla.org/en-US/docs/Web/API/Node/appendChild
 */
let button = document.getElementById("button");
let input = document.getElementById("input");
let list = document.getElementById("list");
button.onclick = addItem;
/**
 * TODO: every time the button is clicked, this method should create & append an <li> element to the 'list' element.
 * The innerText of the new <li> element should be the current value of the input box.
 * This is a three-step process: you must create the element, set its attributes, and then append it to an existing
 * element on the page. For instance, if you were appending an <img> element with some src attribute to a div named
 * "container", it would look like this:
 * let imgElement = document.createElement("img");
 * imgElement.src = "image.jpg";
 * container.appendChild(imgElement);
 * your task will be to do the same, but with the requirements specified in the TODO statement.
 */
function addItem(){

}
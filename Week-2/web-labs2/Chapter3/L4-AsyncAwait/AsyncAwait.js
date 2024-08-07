/**
 * JavaScript often needs to handle some asynchronous events, and handles this through Promises & async/await.
 * Promises are values that take time to resolve.
 * Await forces a function to wait for the resolution of a promise.
 * Async marks a function as asynchronous, allowing other functions & events to fire while the function is waiting.
 * These features allow for JavaScript to efficiently process events while maintaining a pleasant user experience.
 */
let text = document.getElementById("text");
let button = document.getElementById("button");
button.addEventListener("click", countdown);

/**
 * At the start of this exercise, this code doesn't work properly - your page will simply
 * display [object Promise] because the page was updated prematurely, before the "Success" message
 * was generated. Instead, you're going to need to navigate around this problem using async/await.
 * async is a keyword that is applied to functions, which would be added to the first like like this:
 * async function countdown() {
 * await is a keyword that is applied to a function call that returns a promise like this:
 * let value = await getPromise();
 * TODO: add async & await to this function, then verify that the page is able to display "Success!"
 */
function countdown() {
    let value = getPromise();
    text.innerText = value;
}
/**
 * This function returns a new Promise. A Promise is a value that might exist in the future, but takes
 * time to form, whether it be a web request or other waiting-intensive action.
 * Don't worry to much about the code in this method. The setInterval method is used to force JavaScript
 * to wait 1000 milliseconds before returning "Success!"
 *
 * Don't change this function
 * @returns a Promise.
 */
function getPromise(){
    return new Promise(function(resolve) {
        setInterval(function() {
            resolve("Success!");
        }, 1000)
    })
}
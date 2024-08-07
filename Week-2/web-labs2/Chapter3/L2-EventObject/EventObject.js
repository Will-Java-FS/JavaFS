/**
 * The Event Object is provided whenever an event fires. In this case, when onclick happens, the eventObject is
 * actually sent as the first argument to whatever function is used to handle the onclick.
 *
 * The Event Object contains many useful properties that can tell us about the specific event that occurred. In this
 * example, the target property contains the specific HTML element that was clicked.
 *
 * also, the onclick event is being applied to the entire body of the page (all elements).
 *
 * https://developer.mozilla.org/en-US/docs/Web/API/Event
 */
document.body.onclick = updateContentWithEventObjectTarget;
let content = document.getElementById("content");
/**
 * TODO: set the innerText of content to the target property of the event object.
 * that target property can simply be retrieved via eventObject.target, so when you click on something on the page,
 * some information about the clicked element will be displayed.
 */
function updateContentWithEventObjectTarget(eventObject){
}
/**
 * TODO: this is your final task within the basic web development labs... no starting template will be provided..
 * The elements for you to use are:
 * number input with id "input"
 * button with id "button"
 * span with id "content"
 * You should be retrieving a image from GET https://picsum.photos/id/${input.value}/info, where the input
 * value is retrieved from the input box when the button is clicked. You should use either String concatenation or
 * a template literal to interpolate the numeric image id - for instance, the request could look something like
 * GET https://picsum.photos/id/14/info
 * You can test out that endpoint using curl, postman, or your browser. Here's an example response Object from the
 * picsum API:
 *  {
 *      id:14,
 *      author:"Paul Jarvis",
 *      width:2500,
 *      height:1667,
 *      url:"https://unsplash.com/photos/IQ1kOQTJrOQ",
 *      download_url:"https://picsum.photos/id/14/2500/1667"
 *  }
 * After retrieving that image, you should append a new img element, which should use the image download_url as its src.
 * (the 'url' property doesn't link directly to the image, but 'download_url' does)
 */
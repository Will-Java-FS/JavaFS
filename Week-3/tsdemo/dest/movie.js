"use strict";
class Movie {
    constructor(id, title, price, isAvailable, returnDate) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.isAvailable = isAvailable;
        this.returnDate = returnDate;
    }
    //declaring functions inside of a class definition means we don't need the 'function' keyword
    checkout() {
        //TS requires you to specify that this is an instance member using the 'this' keyword
        this.isAvailable = false;
        this.returnDate = Date.now() + 1000 * 3600;
        /*doSomething() {
            this.checkout();
        }*/
    }
}
//Unlike Java, you can write code outside of the class
let movie1 = new Movie(1, "The Avengers", 10.99, true, 0);
console.log(movie1);
movie1.checkout();
console.log(movie1);

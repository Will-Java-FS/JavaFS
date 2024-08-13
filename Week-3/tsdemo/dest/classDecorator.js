"use strict";
//decorators have functionality that is executed, while annotations just provide a label for your code
Object.defineProperty(exports, "__esModule", { value: true });
exports.ClassDecorator = ClassDecorator;
function ClassDecorator(constructor) {
    console.log("this class decorator was called from: " + constructor.name);
}

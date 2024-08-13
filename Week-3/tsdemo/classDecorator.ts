//decorators have functionality that is executed, while annotations just provide a label for your code

export function ClassDecorator(constructor: Function) {
    console.log("this class decorator was called from: " + constructor.name)
}
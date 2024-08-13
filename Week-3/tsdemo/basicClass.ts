import { ClassDecorator } from "./classDecorator";

@ClassDecorator
class BasicClass {

    private message: string;

    constructor(message: string){
        this.message = message;
    }

    greetings(){
        console.log(this.message);
    }
}

const basic = new BasicClass("Hello, everyone!");
basic.greetings();
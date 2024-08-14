import { useRef } from "react";

export default function ContactForm() {

    //this hook gives a constant mutable reference to a node somewhere on the DOM
    const emailInput = useRef<HTMLInputElement>(null);

    function sendEmail() {
        //I want to send an email to the location provided in the input field
        console.log(emailInput.current!.value);
    }

    return(
        <>
        <h3>Request a follow-up email</h3>
        <input type="text" ref={emailInput}/>
        <button onClick={sendEmail}>Email Me</button>
        </>
    )
}
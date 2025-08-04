import React, { Component } from "react";
import CurrencyConvertor from "./CurrencyConvertor";

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      counter: 0,
    };
  }

  // Increment method
  increment = () => {
    this.setState({ counter: this.state.counter + 1 });
  };

  // Decrement method
  decrement = () => {
    this.setState({ counter: this.state.counter - 1 });
  };

  // Method to say hello
  sayHello = () => {
    alert("Hello! Have a great day!");
  };

  // Method to handle multiple actions
  incrementAndSayHello = () => {
    this.increment();
    this.sayHello();
  };

  // Method with argument
  sayMessage = (msg) => {
    alert(`Message: ${msg}`);
  };

  // Synthetic event example
  handleClick = (event) => {
    alert("I was clicked (Synthetic Event)!");
    console.log(event); // logs SyntheticEvent object
  };

  render() {
    return (
      <div style={{ marginLeft: "40px", fontFamily: "Arial" }}>
        <h1>React Event Examples</h1>

        {/* Counter Section */}
        <h2>Counter: {this.state.counter}</h2>
        <button onClick={this.increment}>Increment</button>
        <button onClick={this.decrement} style={{ marginLeft: "10px" }}>
          Decrement
        </button>

        <br /><br />

        {/* Multiple method invocation */}
        <button onClick={this.incrementAndSayHello}>
          Increment & Say Hello
        </button>

        <br /><br />

        {/* Button with argument */}
        <button onClick={() => this.sayMessage("Welcome")}>Say Welcome</button>

        <br /><br />

        {/* Synthetic Event */}
        <button onClick={this.handleClick}>Click Me (Synthetic Event)</button>

        <hr />

        {/* Currency Converter Component */}
        <CurrencyConvertor />
      </div>
    );
  }
}

export default App;

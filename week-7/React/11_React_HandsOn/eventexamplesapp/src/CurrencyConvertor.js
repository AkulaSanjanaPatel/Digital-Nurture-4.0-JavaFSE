import React, { Component } from "react";

class CurrencyConvertor extends Component {
  constructor(props) {
    super(props);
    this.state = {
      rupees: "",
      euro: "",
    };
  }

  handleChange = (event) => {
    this.setState({ rupees: event.target.value });
  };

  handleSubmit = (event) => {
    event.preventDefault();
    const conversionRate = 0.011; // Example: 1 INR = 0.011 Euro
    const euroValue = (this.state.rupees * conversionRate).toFixed(2);
    this.setState({ euro: euroValue });
  };

  render() {
    return (
      <div style={{ marginTop: "30px" }}>
        <h2>Currency Converter (INR ➜ Euro)</h2>
        <form onSubmit={this.handleSubmit}>
          <label>
            Enter amount in Rupees:{" "}
            <input
              type="number"
              value={this.state.rupees}
              onChange={this.handleChange}
            />
          </label>
          <button type="submit" style={{ marginLeft: "10px" }}>
            Convert
          </button>
        </form>

        {this.state.euro && (
          <p>
            {this.state.rupees} INR = <strong>{this.state.euro} EUR</strong>
          </p>
        )}
      </div>
    );
  }
}

export default CurrencyConvertor;

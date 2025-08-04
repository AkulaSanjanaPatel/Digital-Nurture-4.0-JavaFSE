import React from "react";
import "./App.css";

function App() {
  // Single office object
  const office = {
    name: "Tech Park Office",
    rent: 55000,
    address: "Banjara Hills, Hyderabad",
    image: process.env.PUBLIC_URL + "/images/Tech_Office_Park.jpg"
  };

  const offices = [
  {
    name: "Tech Park Office",
    rent: 55000,
    address: "Banjara Hills, Hyderabad",
    image: process.env.PUBLIC_URL + "/images/Tech_Office_Park.jpg"
  },
  {
    name: "City Center Workspace",
    rent: 75000,
    address: "Madhapur, Hyderabad",
    image: process.env.PUBLIC_URL + "/images/city_center_workspace.jpeg"
  },
  {
    name: "Downtown Business Hub",
    rent: 45000,
    address: "Gachibowli, Hyderabad",
    image: process.env.PUBLIC_URL + "/images/Downtown Business Hub.jpeg"
  }
];


  // JSX rendering
  return (
    <div style={{ marginLeft: "40px", fontFamily: "Arial" }}>
      {/* Heading */}
      <h1>Office Space Rental</h1>

      {/* Display a single office space first */}
      <h2>{office.name}</h2>
      <img src={office.image} alt={office.name} style={{ borderRadius: "6px" }} />
      <p><strong>Address:</strong> {office.address}</p>
      <p
        style={{
          color: office.rent < 60000 ? "red" : "green",
          fontWeight: "bold"
        }}
      >
        Rent: ₹{office.rent}
      </p>

      <hr />

      {/* Display list of office spaces */}
      <h2>Available Office Spaces:</h2>
      {offices.map((item, index) => (
        <div
          key={index}
          style={{
            marginBottom: "20px",
            border: "1px solid grey",
            padding: "10px",
            width: "300px",
            borderRadius: "8px"
          }}
        >
          <h3>{item.name}</h3>
          <img
            src={item.image}
            alt={item.name}
            style={{ width: "200px", borderRadius: "6px" }}
          />
          <p><strong>Address:</strong> {item.address}</p>
          <p
            style={{
              color: item.rent < 60000 ? "red" : "green",
              fontWeight: "bold"
            }}
          >
            Rent: ₹{item.rent}
          </p>
        </div>
      ))}
    </div>
  );
}

export default App;

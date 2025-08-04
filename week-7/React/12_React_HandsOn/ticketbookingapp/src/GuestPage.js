import React from "react";

function GuestPage() {
  return (
    <div style={{ marginLeft: "40px" }}>
      <h2>Welcome, Guest!</h2>
      <p>You can browse the flight details below:</p>
      <ul>
        <li>Flight AI101 - Delhi to Mumbai - 7:00 AM</li>
        <li>Flight AI205 - Hyderabad to Bangalore - 9:30 AM</li>
        <li>Flight AI330 - Chennai to Delhi - 2:00 PM</li>
      </ul>
      <p>Please login to book tickets.</p>
    </div>
  );
}

export default GuestPage;

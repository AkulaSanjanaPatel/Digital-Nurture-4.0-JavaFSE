import React from "react";

function UserPage({ onLogout }) {
  return (
    <div style={{ marginLeft: "40px" }}>
      <h2>Welcome, User!</h2>
      <p>You are now logged in and can book tickets.</p>

      <ul>
        <li>Flight AI101 - Delhi to Mumbai - 7:00 AM <button>Book Ticket</button></li>
        <li>Flight AI205 - Hyderabad to Bangalore - 9:30 AM <button>Book Ticket</button></li>
        <li>Flight AI330 - Chennai to Delhi - 2:00 PM <button>Book Ticket</button></li>
      </ul>

      <button onClick={onLogout} style={{ marginTop: "20px" }}>Logout</button>
    </div>
  );
}

export default UserPage;

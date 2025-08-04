import React, { useState } from "react";
import GuestPage from "./GuestPage";
import UserPage from "./UserPage";

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => {
    setIsLoggedIn(true);
  };

  const handleLogout = () => {
    setIsLoggedIn(false);
  };

  return (
    <div>
      <h1 style={{ marginLeft: "40px" }}>Ticket Booking Application</h1>
      {isLoggedIn ? (
        <UserPage onLogout={handleLogout} />
      ) : (
        <div>
          <GuestPage />
          <button onClick={handleLogin} style={{ marginLeft: "40px" }}>
            Login
          </button>
        </div>
      )}
    </div>
  );
}

export default App;

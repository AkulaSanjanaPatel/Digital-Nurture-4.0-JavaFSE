import React, { useState } from "react";
import ThemeContext from "./ThemeContext";
import EmployeesList from "./EmployeesList";
import "./App.css";

function App() {
  const [theme, setTheme] = useState("light");

  const toggleTheme = () => {
    setTheme(theme === "light" ? "dark" : "light");
  };

  return (
    <ThemeContext.Provider value={theme}>
      <div className={`App ${theme}`}>
        <h1>Employee Management</h1>
        <button onClick={toggleTheme} style={{ marginBottom: "20px" }}>
          Switch to {theme === "light" ? "Dark" : "Light"} Theme
        </button>
        <EmployeesList />
      </div>
    </ThemeContext.Provider>
  );
}

export default App;

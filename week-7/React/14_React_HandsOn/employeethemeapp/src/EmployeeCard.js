import React, { useContext } from "react";
import ThemeContext from "./ThemeContext";

function EmployeeCard({ employee }) {
  const theme = useContext(ThemeContext);

  return (
    <div
      className={`employee-card ${theme}`}
      style={{
        border: "1px solid grey",
        padding: "10px",
        margin: "10px",
        width: "250px",
        borderRadius: "8px",
      }}
    >
      <h3>{employee.name}</h3>
      <p>{employee.role}</p>
      <button className={`btn-${theme}`}>View Details</button>
    </div>
  );
}

export default EmployeeCard;

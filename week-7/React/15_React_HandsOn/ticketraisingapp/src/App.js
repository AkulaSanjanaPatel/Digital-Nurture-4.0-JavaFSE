import React from "react";
import ComplaintRegister from "./ComplaintRegister";

function App() {
  return (
    <div
      className="App"
      style={{
        display: "flex",
        flexDirection: "column",
        alignItems: "center",
        justifyContent: "flex-start",
        minHeight: "100vh",
        fontFamily: "Arial",
        paddingTop: "40px",
      }}
    >
      <h1 style={{ marginBottom: "20px", textAlign: "center" }}>
        Ticket Raising Application
      </h1>
      <ComplaintRegister />
    </div>
  );
}

export default App;

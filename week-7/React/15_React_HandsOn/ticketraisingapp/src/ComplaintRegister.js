import React, { useState } from "react";

function ComplaintRegister() {
  const [employeeName, setEmployeeName] = useState("");
  const [complaint, setComplaint] = useState("");

  const generateReference = () => {
    return "REF" + Math.floor(Math.random() * 100000);
  };

  const handleSubmit = (event) => {
    event.preventDefault();
    if (employeeName.trim() === "" || complaint.trim() === "") {
      alert("Please fill in all fields.");
      return;
    }
    const refNumber = generateReference();
    alert(
      `Complaint submitted successfully!\nEmployee: ${employeeName}\nReference Number: ${refNumber}`
    );
    setEmployeeName("");
    setComplaint("");
  };

  return (
    <div
      style={{
        display: "flex",
        flexDirection: "column",
        alignItems: "center",
        marginTop: "50px",
        fontFamily: "Arial",
      }}
    >
      <h2>Raise a Complaint</h2>
      <form
        onSubmit={handleSubmit}
        style={{
          display: "flex",
          flexDirection: "column",
          alignItems: "center",
          gap: "15px",
          border: "1px solid grey",
          padding: "20px",
          borderRadius: "8px",
          width: "350px",
          backgroundColor: "#f9f9f9",
        }}
      >
        <div style={{ width: "100%" }}>
          <label style={{ display: "block", marginBottom: "5px" }}>
            Employee Name:
          </label>
          <input
            type="text"
            value={employeeName}
            onChange={(e) => setEmployeeName(e.target.value)}
            placeholder="Enter employee name"
            style={{ width: "100%", padding: "5px" }}
          />
        </div>

        <div style={{ width: "100%" }}>
          <label style={{ display: "block", marginBottom: "5px" }}>
            Complaint Details:
          </label>
          <textarea
            value={complaint}
            onChange={(e) => setComplaint(e.target.value)}
            placeholder="Enter complaint details"
            rows="4"
            style={{ width: "100%", padding: "5px" }}
          ></textarea>
        </div>

        <button
          type="submit"
          style={{
            padding: "8px 16px",
            backgroundColor: "#4CAF50",
            color: "white",
            border: "none",
            borderRadius: "4px",
            cursor: "pointer",
          }}
        >
          Submit Complaint
        </button>
      </form>
    </div>
  );
}

export default ComplaintRegister;

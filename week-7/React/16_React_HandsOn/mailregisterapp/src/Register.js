import React, { useState } from "react";

function Register() {
  const [name, setName] = useState("");
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");

  const [errors, setErrors] = useState({});

  const validateForm = () => {
    let formErrors = {};
    let isValid = true;

    // Name Validation
    if (name.trim().length < 5) {
      formErrors.name = "Name must be at least 5 characters long.";
      isValid = false;
    }

    // Email Validation
    if (!email.includes("@") || !email.includes(".")) {
      formErrors.email = "Email must include @ and .";
      isValid = false;
    }

    // Password Validation
    if (password.length < 8) {
      formErrors.password = "Password must be at least 8 characters long.";
      isValid = false;
    }

    setErrors(formErrors);
    return isValid;
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    if (validateForm()) {
      alert(`Registration Successful!\nName: ${name}\nEmail: ${email}`);
      setName("");
      setEmail("");
      setPassword("");
      setErrors({});
    }
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
      <h2>Mail Registration</h2>
      <form
        onSubmit={handleSubmit}
        style={{
          display: "flex",
          flexDirection: "column",
          gap: "15px",
          border: "1px solid grey",
          padding: "20px",
          borderRadius: "8px",
          width: "300px",
          backgroundColor: "#f9f9f9",
        }}
      >
        <div>
          <label>Name:</label>
          <input
            type="text"
            value={name}
            onChange={(e) => setName(e.target.value)}
            style={{ width: "100%", padding: "5px" }}
          />
          {errors.name && (
            <p style={{ color: "red", fontSize: "12px" }}>{errors.name}</p>
          )}
        </div>

        <div>
          <label>Email:</label>
          <input
            type="email"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
            style={{ width: "100%", padding: "5px" }}
          />
          {errors.email && (
            <p style={{ color: "red", fontSize: "12px" }}>{errors.email}</p>
          )}
        </div>

        <div>
          <label>Password:</label>
          <input
            type="password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
            style={{ width: "100%", padding: "5px" }}
          />
          {errors.password && (
            <p style={{ color: "red", fontSize: "12px" }}>{errors.password}</p>
          )}
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
          Register
        </button>
      </form>
    </div>
  );
}

export default Register;

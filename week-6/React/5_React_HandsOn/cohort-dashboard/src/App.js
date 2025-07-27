import React from 'react';
import './App.css';
import CohortDetails from './components/CohortDetails';

function App() {
  return (
    <div className="App" style={{ padding: "20px" }}>
      <h2>Cohort Dashboard</h2>
      <CohortDetails
        name="React Spring Boot Batch 1"
        startDate="2025-07-01"
        endDate="2025-08-10"
        status="ongoing"
      />
      <CohortDetails
        name="Data Science with Python"
        startDate="2025-05-01"
        endDate="2025-06-15"
        status="completed"
      />
    </div>
  );
}

export default App;

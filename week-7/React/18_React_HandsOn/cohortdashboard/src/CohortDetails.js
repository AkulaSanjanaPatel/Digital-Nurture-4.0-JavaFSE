import React from 'react';

const CohortDetails = ({ cohort }) => {
  return (
    <div>
      <h3>{cohort.code}</h3>
      <p><strong>Name:</strong> {cohort.name}</p>
      <p><strong>Status:</strong> {cohort.status}</p>
    </div>
  );
};

export default CohortDetails;

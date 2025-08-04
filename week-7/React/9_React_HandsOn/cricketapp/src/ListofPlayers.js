import React from "react";

function ListofPlayers() {
  const players = [
    { name: "Virat Kohli", score: 90 },
    { name: "Rohit Sharma", score: 45 },
    { name: "KL Rahul", score: 72 },
    { name: "Hardik Pandya", score: 30 },
    { name: "Ravindra Jadeja", score: 65 },
    { name: "Suryakumar Yadav", score: 85 },
    { name: "Rishabh Pant", score: 50 },
    { name: "Shubman Gill", score: 25 },
    { name: "Mohammed Shami", score: 10 },
    { name: "Bumrah", score: 75 },
    { name: "Ashwin", score: 55 }
  ];

  // Use map to display players
  const allPlayers = players.map((player, index) => (
    <li key={index}>{player.name} - {player.score}</li>
  ));

  // Filter players with score < 70 using arrow function
  const lowScorers = players
    .filter(player => player.score < 70)
    .map((player, index) => (
      <li key={index}>{player.name} - {player.score}</li>
    ));

  return (
    <div style={{ marginLeft: "40px" }}>
      <h2>All Players</h2>
      <ul>{allPlayers}</ul>

      <h2>Players with Score Below 70</h2>
      <ul>{lowScorers}</ul>
    </div>
  );
}

export default ListofPlayers;

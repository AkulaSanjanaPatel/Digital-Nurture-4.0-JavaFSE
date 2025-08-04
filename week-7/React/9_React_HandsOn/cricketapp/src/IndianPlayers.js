import React from "react";

function IndianPlayers() {
  // Two arrays
  const T20players = ["Virat", "Rohit", "SKY", "Hardik", "Pant"];
  const RanjiTrophyPlayers = ["Gill", "Shami", "Bumrah", "Ashwin", "Jadeja"];

  // Destructuring: Odd and Even players
  const [odd1, even1, odd2, even2, odd3] = T20players;

  // Merge arrays using ES6 spread operator
  const allPlayers = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div style={{ marginLeft: "40px" }}>
      <h2>Odd Team Players (Destructuring)</h2>
      <p>{odd1}, {odd2}, {odd3}</p>

      <h2>Even Team Players (Destructuring)</h2>
      <p>{even1}, {even2}</p>

      <h2>All Players (Merged Array)</h2>
      <p>{allPlayers.join(", ")}</p>
    </div>
  );
}

export default IndianPlayers;

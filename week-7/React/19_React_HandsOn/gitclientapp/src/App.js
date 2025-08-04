import React, { useEffect, useState } from 'react';
import GitClient from './GitClient';

function App() {
  const [repos, setRepos] = useState([]);

  useEffect(() => {
    const client = new GitClient();
    client.getRepositories('techiesyed').then(setRepos);
  }, []);

  return (
    <div>
      <h1>Repositories:</h1>
      <ul>
        {repos.map((name, i) => <li key={i}>{name}</li>)}
      </ul>
    </div>
  );
}

export default App;

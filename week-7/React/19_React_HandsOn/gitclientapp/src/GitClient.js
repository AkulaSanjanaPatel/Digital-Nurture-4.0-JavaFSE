import axios from 'axios';

class GitClient {
  async getRepositories(user) {
    const res = await axios.get(`https://api.github.com/users/${user}/repos`);
    return res.data.map(repo => repo.name);
  }
}

export default GitClient;

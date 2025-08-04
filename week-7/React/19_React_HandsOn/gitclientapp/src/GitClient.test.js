import GitClient from './GitClient';
import axios from 'axios';

jest.mock('axios');

describe('Git Client Tests', () => {
  test('should return repository names for techiesyed', async () => {
    const dummyRepos = [
      { name: 'Repo1' },
      { name: 'Repo2' }
    ];
    axios.get.mockResolvedValue({ data: dummyRepos });

    const client = new GitClient();
    const result = await client.getRepositories('techiesyed');
    expect(result).toEqual(['Repo1', 'Repo2']);
  });
});

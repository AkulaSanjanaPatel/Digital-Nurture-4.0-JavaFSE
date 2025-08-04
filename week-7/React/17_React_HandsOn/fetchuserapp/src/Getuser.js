import React, { Component } from 'react';

class Getuser extends Component {
  constructor() {
    super();
    this.state = {
      user: null
    };
  }

  async componentDidMount() {
    const res = await fetch('https://api.randomuser.me/');
    const data = await res.json();
    this.setState({ user: data.results[0] });
  }

  render() {
    const { user } = this.state;
    return (
      <div>
        {user ? (
          <div>
            <h1>{user.name.title} {user.name.first}</h1>
            <img src={user.picture.large} alt="user" />
          </div>
        ) : (
          <p>Loading...</p>
        )}
      </div>
    );
  }
}

export default Getuser;

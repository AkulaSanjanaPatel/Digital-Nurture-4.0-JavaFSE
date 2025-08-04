import React from 'react';
import { render, screen } from '@testing-library/react';
import App from './App';

test('renders Cohort Dashboard heading', () => {
  render(<App />);
  const heading = screen.getByText(/Cohort Dashboard/i);
  expect(heading).toBeInTheDocument();
});

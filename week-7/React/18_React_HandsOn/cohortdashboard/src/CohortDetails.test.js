import React from 'react';
import { render, screen } from '@testing-library/react';
import CohortDetails from './CohortDetails';
import { CohortData } from './Cohort';

describe('CohortDetails Component', () => {
  test('should render the component', () => {
    render(<CohortDetails cohort={CohortData[0]} />);
    expect(screen.getByText('COH2025')).toBeInTheDocument();
  });

  test('should display cohort name and status', () => {
    render(<CohortDetails cohort={CohortData[0]} />);
    expect(screen.getByText('Name: Full Stack Development')).toBeInTheDocument();
    expect(screen.getByText('Status: Ongoing')).toBeInTheDocument();
  });

  test('should match snapshot', () => {
    const { asFragment } = render(<CohortDetails cohort={CohortData[0]} />);
    expect(asFragment()).toMatchSnapshot();
  });
});

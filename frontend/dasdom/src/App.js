import './App.css';
import React from 'react';
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import List from './List';
import Home from './Home';
import IndicatorsDaily from './IndicatorsDaily';
import IndicatorsWeekly from './IndicatorsWeekly';
import IndicatorsMonthly from './IndicatorsMonthly';

const App = () => {
    return (
        <Router>
            <div className="app-container">
                <header className="app-header">
                    <h1>Welcome to the Macedonian Stock Market</h1>
                    <nav>
                        <Link to="/">Home</Link>
                        <Link to="/list">Issuers</Link>
                        <Link to="/indicators-daily">Daily Indicators</Link>
                        <Link to="/indicators-weekly">Weekly Indicators</Link>
                        <Link to="/indicators-monthly">Monthly Indicators</Link>
                    </nav>
                </header>
                <Routes>
                    <Route path="/" element={<Home />} />
                    <Route path="/list" element={<List />} />
                    <Route path="/indicators-daily" element={<IndicatorsDaily />} />
                    <Route path="/indicators-weekly" element={<IndicatorsWeekly />} />
                    <Route path="/indicators-monthly" element={<IndicatorsMonthly />} />
                </Routes>
                <footer className="app-footer">
                    <p>&copy; 2024 Macedonian Stock Market</p>
                </footer>
            </div>
        </Router>
    );
};

export default App;

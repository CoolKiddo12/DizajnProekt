import React from 'react';
import { Link } from 'react-router-dom';

const Home = () => {
    return (
        <div className="home-container">
            <header className="home-header">
                <h1>Welcome to the Macedonian Stock Market</h1>
                <p>Explore stock data, indicators, and insights from the Macedonian Stock Exchange</p>
            </header>

            <div className="home-content">
                <section className="intro">
                    <h2>What's Inside</h2>
                    <p>Access detailed historical stock data, technical indicators, and predictions to help you make informed trading decisions.</p>
                </section>

                <section className="features">
                    <div className="feature">
                        <h3>Real-Time Stock Data</h3>
                        <p>Stay updated with real-time data from the Macedonian Stock Exchange, including open, close, high, low, and volume information.</p>
                    </div>
                    <div className="feature">
                        <h3>Technical Indicators</h3>
                        <p>Leverage key technical analysis tools such as moving averages, RSI, and MACD to forecast stock trends.</p>
                    </div>
                    <div className="feature">
                        <h3>Customizable Filters</h3>
                        <p>Filter stock data by various criteria like symbol, date, and signals to get the insights you need quickly.</p>
                    </div>
                </section>

                <section className="images">
                    <h2>Stock Market Insights</h2>
                    <img src="https://www.macedonia2025.com/wp-content/uploads/2023/04/this-has-to-go-as-picture.png.webp" alt="Stock Chart" />
                    <p>Analyze trends, market conditions, and make better investment decisions with our powerful analytics tools.</p>
                </section>
            </div>

            <footer className="home-footer">
                <p>&copy; 2024 Macedonian Stock Market</p>
            </footer>
        </div>
    );
};

export default Home;

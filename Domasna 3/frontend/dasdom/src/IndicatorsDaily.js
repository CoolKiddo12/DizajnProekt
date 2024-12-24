import React, { useState, useEffect } from 'react';

const IndicatorsDaily = () => {
    const [data, setData] = useState([]); // Original data
    const [filteredData, setFilteredData] = useState([]); // Filtered data to display
    const [filterType, setFilterType] = useState("id");   // Default filter type
    const [filter, setFilter] = useState("");             // Filter input value

    // Fetch data from backend
    useEffect(() => {
        fetch('http://localhost:8080/api/indicators/daily')
            .then(response => response.json())
            .then(data => {
                console.log(data);               // Debugging the response
                setData(data);                   // Store all data
                setFilteredData(data);           // Initially show all data
            })
            .catch(err => console.error("Error fetching data:", err));
    }, []);  // Empty dependency array means this runs only once when the component is mounted

    // Filter handler
    const handleFilter = () => {
        if (filterType === "id") {
            fetch(`http://localhost:8080/api/indicators/daily/${filter}`)
                .then(response => response.json())
                .then(data => setFilteredData([data]))  // Update filtered data for ID
                .catch(err => console.error("Error fetching by ID:", err));
        } else if (filterType === "symbol") {
            fetch(`http://localhost:8080/api/indicators/daily/symbol/${filter}`)
                .then(response => response.json())
                .then(data => setFilteredData(data))  // Update filtered data for Symbol
                .catch(err => console.error("Error fetching by Symbol:", err));
        } else if (filterType === "signal") {
            const lowerCaseFilter = filter.toLowerCase();
            const sorted = [...data].sort((a, b) => {
                if (a.signal.toLowerCase() === lowerCaseFilter) return -1; // Matches go to top
                if (b.signal.toLowerCase() === lowerCaseFilter) return 1;  // Non-matches go to bottom
                return 0;
            });
            setFilteredData(sorted); // Update filtered data for Signal
        }
    };

    // Reset handler
    const handleReset = () => {
        setFilter("");                    // Clear filter input
        setFilterType("id");              // Reset to default filter type
        setFilteredData(data);            // Reset data to original
    };

    return (
        <div className="table-container">
            <h2>Daily Indicators</h2>

                {/* Add Filter Section Here */}
                <div className="filter-container">
                    <select value={filterType} onChange={e => setFilterType(e.target.value)}>
                        <option value="id">ID</option>
                        <option value="symbol">Symbol</option>
                        <option value="signal">Signal</option>
                    </select>
                    <input
                        type="text"
                        value={filter}
                        onChange={e => setFilter(e.target.value)}
                        placeholder={`Filter by ${filterType}`}
                    />
                    <button onClick={handleFilter}>Filter</button>
                    <button onClick={handleReset}>Reset</button> {/* Reset button */}
                </div>

                {/* Table Section */}
                <table>
                    <thead>
                    <tr>
                        <th>ID</th>
                        <th>Symbol</th>
                        <th>High Price</th>
                        <th>Low Price</th>
                        <th>SMA 50</th>
                        <th>SMA 200</th>
                        <th>EMA 50</th>
                        <th>EMA 200</th>
                        <th>RSI</th>
                        <th>Signal</th>
                    </tr>
                    </thead>
                    <tbody>
                    {filteredData.length === 0 ? (
                        <tr><td colSpan="10">Loading...</td></tr> // Show loading message if no data
                    ) : (
                        filteredData.map((item) => (
                            <tr key={item.id}>
                                <td>{item.id}</td>
                                <td>{item.issuer.symbol}</td>
                                <td>{item.highPrice}</td>
                                <td>{item.lowPrice}</td>
                                <td>{item.sma50}</td>
                                <td>{item.sma200}</td>
                                <td>{item.ema50}</td>
                                <td>{item.ema200}</td>
                                <td>{item.rsi}</td>
                                <td>{item.signal}</td>
                            </tr>
                        ))
                    )}
                    </tbody>
                </table>
            </div>

    );
};

export default IndicatorsDaily;

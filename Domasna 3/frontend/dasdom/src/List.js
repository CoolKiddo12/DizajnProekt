import React, { useState, useEffect } from 'react';

const List = () => {
    const [state, setState] = useState([]);

    useEffect(() => {
        fetch('http://localhost:8080/api/issuers')
            .then(response => response.json())
            .then(data => {
                console.log(data);
                setState(data);
            });
    }, []);

    return (
        <div className="list-container">
            {state.length === 0 ? (
                <p>Loading data...</p>
            ) : (
                state.map(obj => (
                    <div key={obj.id} className="list-item">
                        <p><strong>Symbol:</strong> {obj.symbol}</p>
                        <p><strong>Date:</strong> {obj.date}</p>
                        <p><strong>Close Price:</strong> {obj.closePrice}</p>
                        <p><strong>Volume:</strong> {obj.volume}</p>
                    </div>
                ))
            )}
        </div>
    );
};

export default List;

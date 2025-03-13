import React, { useState, useEffect } from "react";
import './App.css';
import axios from "axios";  // Import Axios for the API call

// ChildComponent
const ChildComponent = ({ userData, formInput }) => {
  return (
    <div className="mt-5">
      <p>Form Input: {formInput}</p>

      {/* Display data fetched from the API */}
      <h4>API Data:</h4>
      {userData ? (
        <ul className="list-group">
          {userData.map((user) => (
            <li key={user.id} className="list-group-item">
              {user.name} - {user.email}
            </li>
          ))}
        </ul>
      ) : (
        <p>Loading data...</p>
      )}
    </div>
  );
};

// ParentComponent (App)
function App() {
  const [data, setData] = useState(null); // To store fetched data
  const [formInput, setFormInput] = useState(""); // To store form input

  // Fetch data from an API using Axios (GET request)
  useEffect(() => {
    axios
      .get("https://jsonplaceholder.typicode.com/users")  // Using Axios for the API GET request
      .then((response) => setData(response.data))  // Set the fetched data to state
      .catch((error) => console.error("Error fetching data", error));  // Handle errors
  }, []);

  // Handle form input change
  const handleFormChange = (event) => {
    setFormInput(event.target.value);
  };

  // Handle form submission
  const handleSubmit = (event) => {
    event.preventDefault();
    alert(`Form submitted with input: ${formInput}`);
  };

  return (
    <div className="App">
      <header className="App-header">
        <form onSubmit={handleSubmit}>
          <div className="form-group">
            <label>Input Text</label>
            <input
              type="text"
              className="form-control"
              value={formInput}
              onChange={handleFormChange}
            />
          </div>
          <button type="submit" className="btn btn-primary mt-3">
            Submit
          </button>
        </form>

        {/* Pass API data and form input to the child component */}
        <ChildComponent userData={data} formInput={formInput} />
      </header>
    </div>
  );
}

export default App;

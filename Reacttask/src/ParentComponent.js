import React, { useState, useEffect } from "react";
import ChildComponent from "./ChildComponent";
import axios from "axios";

const ParentComponent = () => {
  const [data, setData] = useState(null);
  const [formInput, setFormInput] = useState("");

  // Fetch data from an API using Axios (GET request)
  useEffect(() => {
    axios
      .get("https://jsonplaceholder.typicode.com/users")
      .then((response) => setData(response.data))
      .catch((error) => console.error("Error fetching data", error));
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
    <div className="container mt-5">
      <h2>Parent Component</h2>
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
    </div>
  );
};

export default ParentComponent;

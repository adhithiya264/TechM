import React from "react";

const ChildComponent = ({ userData, formInput }) => {
  return (
    <div className="mt-5">
      <h3>Child Component</h3>
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

export default ChildComponent;

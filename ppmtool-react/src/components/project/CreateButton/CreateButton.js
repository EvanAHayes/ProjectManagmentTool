import React from 'react';
import {Link} from 'react-router-dom';

 const CreateButton = () => {
      return (
        <Link to="/addProject" className="btn btn-lg btn-info">
        Create a Project
    </Link>
      )
 }

export default CreateButton;

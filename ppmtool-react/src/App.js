import React from 'react';
import './App.css';
import Dashboard from './components/DashBoard/Dashboard';
import Header from './components/Layout/Header';
import 'bootstrap/dist/css/bootstrap.min.css';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom'
import addProject from './components/project/addProject';

function App() {
  return (
    <Router>
    <Switch>
    <div>
    <Header />
      <Route exact path="/" component={Dashboard} />
      <Route exact path="/addProject" component={addProject} />
    </div>
    </Switch>
    </Router>

  );
}

export default App;

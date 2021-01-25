import React from 'react';
import './App.css';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom'
import ListTareaComponent from "./component/tarea/ListTareaComponent";
import AddTareaComponent from "./component/tarea/AddTareaComponent";
import EditTareaComponent from "./component/tarea/EditTareaComponent";
import NavBar from "./component/Navbar";
import Container from '@material-ui/core/Container';

function App() {
  return (
      <div className="container">
          <NavBar/>
          <Router>
              <div className="col-md-6">
                  <h1 className="text-center" style={style}>React Tarea Aplicacion</h1>
                  <Switch>
                      <Route path="/" exact component={ListTareaComponent} />
                      <Route path="/tareas" component={ListTareaComponent} />
                      <Route path="/add-tarea" component={AddTareaComponent} />
                      <Route path="/edit-tarea" component={EditTareaComponent} />
                  </Switch>
              </div>
          </Router>
      </div>
  );
}

const style = {
    color: 'red',
    margin: '10px'
}

export default App;
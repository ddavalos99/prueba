import React, { Component } from 'react'
import ApiService from "../../service/ApiService";

class AddTareaComponent extends Component{

    constructor(props){
        super(props);
        this.state ={
            descripcion: '',
            fechaCreacion: '',
            vigente: ''
        }
        this.saveTarea = this.saveTarea.bind(this);
    }

    saveTarea = (e) => {
        e.preventDefault();
        let tarea = {descripcion: this.state.descripcion, fechaCreacion: this.state.fechaCreacion, vigente: this.state.vigente};
        ApiService.addTarea(tarea)
            .then(res => {
                this.setState({message : 'Tarea adherida satisfactoriamente.'});
                this.props.history.push('/tareas');
            });
    }

    onChange = (e) =>
        this.setState({ [e.target.name]: e.target.value });

    render() {
        return(
            <div>
                <h2 className="text-center">Add Tarea</h2>
                <form>
                <div className="form-group">
                    <label>Descripcion:</label>
                    <input type="text" placeholder="descripcion" name="descripcion" className="form-control" value={this.state.descripcion} onChange={this.onChange}/>
                </div>

                <div className="form-group">
                    <label>Fecha Creacion:</label>
                    <input type="date" placeholder="fechaCreacion" name="fechaCreacion" className="form-control" value={this.state.fechaCreacion} onChange={this.onChange}/>
                </div>

                <div className="form-group">
                    <label>Vigencia:</label>
                    <input placeholder="vigente" name="vigente" className="form-control" value={this.state.vigente} onChange={this.onChange}/>
                </div>

                <button className="btn btn-success" onClick={this.saveUser}>Save</button>
            </form>
    </div>
        );
    }
}

export default AddTareaComponent;
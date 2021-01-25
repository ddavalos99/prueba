import React, { Component } from 'react'
import ApiService from "../../service/ApiService";

class EditTareaComponent extends Component {

    constructor(props){
        super(props);
        this.state ={
            id: '',
            descripcion: '',
            fechaCreacion: '',
            vigente: '',
        }
        this.saveTarea = this.saveTarea.bind(this);
        this.loadTarea = this.loadTarea.bind(this);
    }

    componentDidMount() {
        this.loadTarea();
    }

    loadTarea() {
        ApiService.fetchTareaById(window.localStorage.getItem("tareaId"))
            .then((res) => {
                let tarea = res.data.result;
                this.setState({
                id: tarea.id,
                descripcion: tarea.descripcion,
                fechaCreacion: tarea.fechaCreacion,
                vigente: tarea.vigente,
                })
            });
    }

    onChange = (e) =>
        this.setState({ [e.target.name]: e.target.value });

    saveTarea = (e) => {
        e.preventDefault();
        let tarea = {id: this.state.id, descripcion: this.state.descripcion, fechaCreacion: this.state.fechaCreacion, vigente: this.state.vigente};
        ApiService.editTarea(tarea)
            .then(res => {
                this.setState({message : 'Tarea adherida satisfactoriamente.'});
                this.props.history.push('/tareas');
            });
    }

    render() {
        return (
            <div>
                <h2 className="text-center">Edit Tarea</h2>
                <form>

                    <div className="form-group">
                        <label>Descripcion:</label>
                        <input type="text" placeholder="descripcion" name="descripcion" className="form-control" readonly="true" defaultValue={this.state.descripcion}/>
                    </div>

                    <div className="form-group">
                        <label>Fecha Creacion:</label>
                        <input placeholder="fechaCreacion" name="fechaCreacion" className="form-control" value={this.state.fechaCreacion} onChange={this.onChange}/>
                    </div>

                    <div className="form-group">
                        <label>Vigente:</label>
                        <input type="boolean" placeholder="vigente" name="vigente" className="form-control" value={this.state.vigente} onChange={this.onChange}/>
                    </div>

                    <button className="btn btn-success" onClick={this.saveTarea}>Save</button>
                </form>
            </div>
        );
    }
}

export default EditTareaComponent;
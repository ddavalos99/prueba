import React, { Component } from 'react'
import ApiService from "../../service/ApiService";

class ListTareaComponent extends Component {

    constructor(props) {
        super(props)
        this.state = {
            tareas: [],
            message: null
        }
        this.deleteTarea = this.deleteTarea.bind(this);
        this.editTarea = this.editTarea.bind(this);
        this.addTarea = this.addTarea.bind(this);
        this.reloadTareaList = this.reloadTareaList.bind(this);
    }

    componentDidMount() {
        this.reloadTareaList();
    }

    reloadTareaList() {
        ApiService.fetchTareas()
            .then((res) => {
                this.setState({tareas: res.data.result})
            });
    }

    deleteTarea(tareaId) {
        ApiService.deleteTarea(tareaId)
           .then(res => {
               this.setState({message : 'Tarea borrada satisfactoriamente.'});
               this.setState({tareas: this.state.tarea.filter(tarea => tarea.id !== tareaId)});
           })

    }

    editTarea(id) {
        window.localStorage.setItem("tareaId", id);
        this.props.history.push('/edit-tarea');
    }

    addTarea() {
        window.localStorage.removeItem("tareaId");
        this.props.history.push('/add-tarea');
    }

    render() {
        return (
            <div>
                <h2 className="text-center">Tarea Details</h2>
                <button className="btn btn-danger" onClick={() => this.addTarea()}> Add Tarea</button>
                <table className="table table-striped">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Descripcion</th>
                            <th>Fecha Creacion</th>
                            <th>Vigente</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.tareas.map(
                        tarea =>
                                    <tr key={tarea.id}>
                                        <td>{tarea.id}</td>
                                        <td>{tarea.descripcion}</td>
                                        <td>{tarea.fechaCreacion}</td>
                                        <td>{tarea.vigente}</td>
                                        <td>
                                            <button className="btn btn-success" onClick={() => this.deleteTarea(tarea.id)}> Delete</button>
                                            <button className="btn btn-success" onClick={() => this.editTarea(tarea.id)}> Edit</button>
                                        </td>
                                    </tr>
                            )
                        }
                    </tbody>
                </table>

            </div>
        );
    }

}

export default ListTareaComponent;
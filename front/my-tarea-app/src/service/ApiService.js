import axios from 'axios';

const TAREA_API_BASE_URL = 'http://localhost:8080/tareas';

class ApiService {

    fetchTareas() {
        return axios.get(TAREA_API_BASE_URL);
    }

    fetchTareaById(tareaId) {
        return axios.get(TAREA_API_BASE_URL + '/' + tareaId);
    }

    deleteTarea(tareaId) {
        return axios.delete(TAREA_API_BASE_URL + '/' + tareaId);
    }

    addTarea(tarea) {
        return axios.post(""+TAREA_API_BASE_URL, tarea);
    }

    editTarea(tarea) {
        return axios.put(TAREA_API_BASE_URL + '/' + tarea.id, tarea);
    }

}

export default new ApiService();
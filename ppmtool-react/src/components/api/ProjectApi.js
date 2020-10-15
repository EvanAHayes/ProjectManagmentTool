import axios from 'axios'

class ProjectApi {


CreateNewProject(){
axios.post("http://localhost:8080/api/project")
}

}

export default new ProjectApi();
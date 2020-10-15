import React, { Component } from 'react'

 class addProject extends Component {
     constructor(){
         super()
           this.state = {
            projectName: "",
            projectIdentifier: "",
            description: "",
            start_date: "",
            end_date: "",
           }
           this.handleChange = this.handleChange.bind(this); 
           this.onSubmit = this.onSubmit.bind(this);
     }
     handleChange(event) {
        this.setState({ [event.target.name]: event.target.value })
    }

    onSubmit(e){
        e.preventDefault();
        const newProject = {
            projectName: this.state.projectName,
            projectIdentifier: this.state.projectIdentifier,
            description: this.state.description,
            start_date: this.state.start_date,
            end_date: this.state.end_date
        };
        console.log(newProject);
    }

    render() {
        return (
            <div>
            <div className="register">
            <div className="container">
                <div className="row">
                    <div className="col-md-8 m-auto">
                        <h5 className="display-4 text-center">Create Project form</h5>
                        <hr />
                        <form onSubmit={this.onSubmit}>
                            <div className="form-group">
                                <input type="text" name="projectName" className="form-control form-control-lg " placeholder="Project Name" value={this.state.projectName} onChange={this.handleChange}/>
                            </div>
                            <div className="form-group">
                                <input name="projectIdentifier" type="text" className="form-control form-control-lg" placeholder="Unique Project ID" value={this.state.projectIdentifier} onChange={this.handleChange} />
                            </div>
                            
                            <div className="form-group">
                                <textarea name="description" className="form-control form-control-lg" placeholder="Project Description" value={this.state.description} onChange={this.handleChange}></textarea>
                            </div>
                            <h6>Start Date</h6>
                            <div className="form-group">
                                <input type="date" className="form-control form-control-lg" name="start_date" value={this.state.start_date} onChange={this.handleChange} />
                            </div>
                            <h6>Estimated End Date</h6>
                            <div className="form-group">
                                <input type="date" className="form-control form-control-lg" name="end_date" value={this.state.end_date} onChange={this.handleChange} />
                            </div>
    
                            <input type="submit" className="btn btn-primary btn-block mt-4" />
                        </form>
                    </div>
                </div>
            </div>
        </div>
            </div>
        )
    }
}

export default addProject;

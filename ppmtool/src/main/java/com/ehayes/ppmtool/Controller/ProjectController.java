package com.ehayes.ppmtool.Controller;

import com.ehayes.ppmtool.Repository.ProjectRepository;
import com.ehayes.ppmtool.Service.MapValidationErrorService;
import com.ehayes.ppmtool.Service.ProjectService;
import com.ehayes.ppmtool.domain.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping("api/project")
public class ProjectController {

    @Autowired
    ProjectService projectService;
    @Autowired
    MapValidationErrorService mapValidationErrorService;

    @Autowired
    ProjectRepository projectRepository;

    @PostMapping("")
    public ResponseEntity<?> createNewProject(@Valid @RequestBody Project project, BindingResult result){
        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
        if(errorMap != null){
            return errorMap;
        }
        Project project1 = projectService.saveOrUpdateProject(project);
        return new ResponseEntity<Project>(project1, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public List<Project> getAllProjects(){  return projectService.findAll(); }


    @GetMapping("/{projectId}")
    public ResponseEntity<?> getProjectById(@PathVariable String projectId){
        Project project = projectService.findProjectByIdentifier(projectId);
        return new ResponseEntity<Project>(project, HttpStatus.OK);
    }


    @DeleteMapping("/{projectId}")
    public ResponseEntity<?> delete(@PathVariable String projectId){
       projectService.deleteProject(projectId);
        return new ResponseEntity<String>("Project with ID:" + projectId + "was deleted", HttpStatus.OK);
    }
}

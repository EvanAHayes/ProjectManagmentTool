package com.ehayes.ppmtool.Service;

import com.ehayes.ppmtool.Exceptions.ProjectIdException;
import com.ehayes.ppmtool.Repository.ProjectRepository;
import com.ehayes.ppmtool.domain.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){
        try{
            project.getProjectIdentifier().toUpperCase();
            return projectRepository.save(project);
        }catch (Exception ex){
            throw new ProjectIdException("Project ID " +project.getProjectIdentifier().toUpperCase()+ " already exist");
        }
    }

    public Project findProjectByIdentifier(String projectId){

        Project project = projectRepository.findByProjectIdentifier(projectId.toUpperCase());
        if(project == null){
            throw new ProjectIdException("Project ID "+projectId+" Doesn't exist");
        }
        return project;
    }

    public List<Project> findAll(){
        return projectRepository.findAll();
    }

    public void deleteProject(String projectId){
        Project project = projectRepository.findByProjectIdentifier(projectId);
        if(project == null){
            throw new ProjectIdException("Cannot delete project with ID "+projectId+" . Doesn't exist");
        }
        projectRepository.delete(project);
    }

}

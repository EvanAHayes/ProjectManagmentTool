package com.ehayes.ppmtool.Service;

import com.ehayes.ppmtool.Repository.ProjectRepository;
import com.ehayes.ppmtool.domain.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){
        return projectRepository.save(project);

    }
}

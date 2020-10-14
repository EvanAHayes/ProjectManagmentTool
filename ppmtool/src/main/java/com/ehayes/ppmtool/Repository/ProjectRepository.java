package com.ehayes.ppmtool.Repository;

import com.ehayes.ppmtool.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ProjectRepository extends JpaRepository<Project, Long> {

    Project findByProjectIdentifier(String projectId);

}

package com.ehayes.ppmtool.Repository;

import com.ehayes.ppmtool.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {

    @Override
    List<Project> findAllById(Iterable<Long> iterable);
}

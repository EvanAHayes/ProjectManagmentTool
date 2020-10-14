package com.ehayes.ppmtool.Exceptions;

public class ProjectIDExceptionResponse {
    private String ProjectIdentififier;

    public ProjectIDExceptionResponse(String projectIdentififier) {
        ProjectIdentififier = projectIdentififier;
    }

    public String getProjectIdentififier() {
        return ProjectIdentififier;
    }

    public void setProjectIdentififier(String projectIdentififier) {
        ProjectIdentififier = projectIdentififier;
    }
}

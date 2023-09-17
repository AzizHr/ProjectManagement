package employees;

import others.Project;

public class ProjectManager extends Employee {

    private Project[] projects;


    public Project[] getProjects() {
        return projects;
    }

    public void setProjects(Project[] projects) {
        this.projects = projects;
    }
    
    @Override
    public Employee add(Employee employee) {
        return null;
    }

    @Override
    public Employee edit(Employee employee) {
        return null;
    }

    @Override
    public int delete(String number) {
        return 0;
    }

}

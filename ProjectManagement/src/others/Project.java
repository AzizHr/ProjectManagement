package others;

import javax.print.Doc;
import java.sql.Date;

public class Project {

    private String code;
    private String name;
    private String description;
    private Date startDate;
    private Date endDate;
    private float amount;
    private Phase[] phases;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Phase[] getPhases() {
        return phases;
    }

    public void setPhases(Phase[] phases) {
        this.phases = phases;
    }

    public Project add(Project project) {
        return null;
    }

    public Project edit(Project project) {
        return null;
    }

    public Project[] search(String name) {
        return null;
    }
}

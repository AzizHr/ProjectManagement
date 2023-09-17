package others;

import java.sql.Date;

public class Phase {

    private String code;
    private String wording;
    private String description;
    private Date startDate;
    private Date endDate;
    private float amount;
    private boolean completionStatus;
    private boolean invoicingStatus;
    private boolean paymentStatus;
    private Deliverable[] deliverables;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getWording() {
        return wording;
    }

    public void setWording(String wording) {
        this.wording = wording;
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

    public boolean isCompletionStatus() {
        return completionStatus;
    }

    public void setCompletionStatus(boolean completionStatus) {
        this.completionStatus = completionStatus;
    }

    public boolean isInvoicingStatus() {
        return invoicingStatus;
    }

    public void setInvoicingStatus(boolean invoicingStatus) {
        this.invoicingStatus = invoicingStatus;
    }

    public boolean isPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Deliverable[] getDeliverables() {
        return deliverables;
    }

    public void setDeliverables(Deliverable[] deliverables) {
        this.deliverables = deliverables;
    }
}

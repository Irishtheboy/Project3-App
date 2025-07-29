package za.co.admatech.domain;

public class JobAppication {

    private String applicationId;
    private String job;
    private String application;
    private String status;
    private String applydDate;

    public JobAppication() {
    }

    public JobAppication (Builder builder){
        this.applicationId = builder.applicationId;
        this.job = builder.job;
        this.application = builder.application;
        this.status = builder.status;
        this.applydDate = builder.applydDate;

    }

    public String getApplicationId() {
        return applicationId;
    }

    public String getJob() {
        return job;
    }

    public String getApplication() {
        return application;
    }

    public String getStatus() {
        return status;
    }

    public String getApplydDate() {
        return applydDate;
    }

    @Override
    public String toString() {
        return "JobAppication{" +
                "applicationId='" + applicationId + '\'' +
                ", job='" + job + '\'' +
                ", application='" + application + '\'' +
                ", status='" + status + '\'' +
                ", applydDate='" + applydDate + '\'' +
                '}';
    }

    public static class Builder{
        private String applicationId;
        private String job;
        private String application;
        private String status;
        private String applydDate;

        public void setApplicationId(String applicationId) {
            this.applicationId = applicationId;
        }

        public void setJob(String job) {
            this.job = job;
        }

        public void setApplication(String application) {
            this.application = application;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public void setApplydDate(String applydDate) {
            this.applydDate = applydDate;
        }

        public Builder copy(JobAppication jobApplication){
            this.applicationId = jobApplication.applicationId;
            this.job = jobApplication.job;
            this.application = jobApplication.application;
            this.status = jobApplication.status;
            this.applydDate = jobApplication.applydDate;
            return this;
        }

        public JobAppication  build(){return new JobAppication(this);}
    }
}

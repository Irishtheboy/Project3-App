package za.co.admatech.domain;

import za.co.admatech.domain.enums.JobStatus;

import java.time.LocalDate;

public class Job {
    private short jobId;
    private String title;
    private String description;
    private String category;
    private LocalDate postedDate;
    private JobStatus jobStatus;

    public Job() {
    }

    private Job (Builder builder) {
        this.jobId = builder.jobId;
        this.title = builder.title;
        this.description = builder.description;
        this.category = builder.category;
        this.postedDate = builder.postedDate;
        this.jobStatus = builder.jobStatus;
    }

    public short getJodId() {
        return jobId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getPostedDate() {
        return postedDate;
    }

    public JobStatus getJobStatus() {
        return jobStatus;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jodId=" + jobId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", postedDate=" + postedDate +
                ", jobStatus=" + jobStatus +
                '}';
    }

    public static class Builder {
        private short jobId;
        private String title;
        private String description;
        private String category;
        private LocalDate postedDate;
        private JobStatus jobStatus;

        public Builder setJobId(short jobId) {
            this.jobId = jobId;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }

        public Builder setPostedDate(LocalDate postedDate) {
            this.postedDate = postedDate;
            return this;
        }

        public Builder setJobStatus(JobStatus jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }

        public Builder copy (Job job) {
            this.jobId = job.jobId;
            this.title = job.title;
            this.description = job.description;
            this.category = job.category;
            this.postedDate = job.postedDate;
            this.jobStatus = job.jobStatus;
            return this;
        }

        public Job build() {
            return new Job(this);
        }
    }
}





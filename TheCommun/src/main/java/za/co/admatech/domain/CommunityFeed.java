package za.co.admatech.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class CommunityFeed {
    @Id
    private String name;
    private LocalDate time;
    private String location;
    private String jobCategory;
    private String status;
    private String comment;

    public CommunityFeed() {
    }

    private CommunityFeed (Builder builder) {
        this.name = builder.name;
        this.time = builder.time;
        this.location = builder.location;
        this.jobCategory = builder.jobCategory;
        this.status = builder.status;
        this.comment = builder.comment;
    }

    public String getName() {
        return user;
    }

    public LocalDate getTime() {
        return timePosted;
    }

    public String getLocation() {
        return location;
    }

    public String getJobCategory() {
        return jobCategory;
    }

    public String getStatus() {
        return status;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return "CommunityFeedPost{" +
                "name='" + name + '\'' +
                ", time=" + time +
                ", location='" + location + '\'' +
                ", jobCategory='" + jobCategory + '\'' +
                ", status='" + status + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }

    public static class Builder {
        private String name;
        private LocalDate time;
        private String location;
        private String jobCategory;
        private String status;
        private String comment;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setTime(LocalDate time) {
            this.time = time;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder setJobCategory(String jobCategory) {
            this.jobCategory = jobCategory;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder setComment(String comment) {
            this.comment = comment;
            return this;
        }

        public Builder copy(CommunityFeed post) {
            this.name = post.getName();
            this.time = post.getTime();
            this.location = post.getLocation();
            this.jobCategory = post.getJobCategory();
            this.status = post.getStatus();
            this.comment = post.getComment();
            return this;
        }

        public CommunityFeed build() {
            return new CommunityFeed(this);
        }
    }
}

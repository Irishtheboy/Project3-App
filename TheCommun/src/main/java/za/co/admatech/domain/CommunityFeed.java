package za.co.admatech.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class CommunityFeed {
    @Id
    private String communityFeedId;
    private String name;
    private LocalDate time;
    private String location;
    private String jobCategory;
    private String status;
    private String comment;
    private String rating;

    public CommunityFeed() {
    }

    private CommunityFeed (Builder builder) {
        this.communityFeedId = builder.communityFeedId;
        this.name = builder.name;
        this.time = builder.time;
        this.location = builder.location;
        this.jobCategory = builder.jobCategory;
        this.status = builder.status;
        this.comment = builder.comment;
        this.rating = builder.rating;
    }

    public String getCommunityFeedId() {return communityFeedId; }

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

    public String getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "CommunityFeedPost{" +
                "communityFeedId='" + communityFeedId + '\'' +
                ", name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", location='" + location + '\'' +
                ", jobCategory='" + jobCategory + '\'' +
                ", status='" + status + '\'' +
                ", comment='" + comment + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }

    public static class Builder {
        private String communityFeedId;
        private String name;
        private LocalDate time;
        private String location;
        private String jobCategory;
        private String status;
        private String comment;
        private String rating;

        public Builder setCommunityFeedId(String communityFeedId) {
            this.communityFeedId = communityFeedId;
            return this;
        }

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

        public Builder setRating(String rating) {
            this.rating = rating;
            return this;
        }

        public Builder copy(CommunityFeed post) {
            this.communityFeedId = post.getCommunityFeedId();
            this.name = post.getName();
            this.time = post.getTime();
            this.location = post.getLocation();
            this.jobCategory = post.getJobCategory();
            this.status = post.getStatus();
            this.comment = post.getComment();
            this.rating = post.getRating();
            return this;
        }

        public CommunityFeed build() {
            return new CommunityFeed(this);
        }
    }
}

package za.co.admatech.factory;

import za.co.admatech.domain.CommunityFeed;
import java.time.LocalDate;

public class CommunityFeedFactory {

    // Factory method to create a CommunityFeed with default values
    public static CommunityFeed createDefaultPost() {
        return new CommunityFeed.Builder()
                .setName("defaultName")
                .setTime(LocalDate.now())
                .setLocation("Default location")
                .setJobCategory("Petcare")
                .setStatus("Open")
                .setComment("No comments")
                .build();
    }

    public static CommunityFeed createPost(String name, LocalDate time, String location,
                                           String jobCategory, String status, String comment) {
        return new CommunityFeed.Builder()
                .setName(name)
                .setTime(time)
                .setLocation(location)
                .setJobCategory(jobCategory)
                .setStatus(status)
                .setComment(comment)
                .build();
    }

    public static CommunityFeed createCopyOfPost(CommunityFeed existingPost) {
        return new CommunityFeed.Builder()
                .copy(existingPost)
                .build();
    }

    public static CommunityFeed createUrgentJobPost(String name, String location, String jobCategory, String comment) {
        return new CommunityFeed.Builder()
                .setName(name)
                .setTime(LocalDate.now())
                .setLocation(location)
                .setJobCategory("Urgent")
                .setStatus("Open")
                .setComment(comment)
                .build();
    }

    public static CommunityFeed createClosedJobPost(String name, String location, String jobCategory, String comment) {
        return new CommunityFeed.Builder()
                .setName(name)
                .setTime(LocalDate.now())
                .setLocation(location)
                .setJobCategory("Completed")
                .setStatus("Closed")
                .setComment(comment)
                .build();
    }
}

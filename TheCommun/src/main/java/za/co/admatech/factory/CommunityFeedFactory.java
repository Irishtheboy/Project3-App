package za.co.admatech.factory;

import za.co.admatech.domain.CommunityFeed;
import java.time.LocalDate;

public class CommunityFeedFactory {

    // Factory method to create a CommunityFeed with default values
    public static CommunityFeed createDefaultPost() {
        return new CommunityFeed.Builder()
                .setCommunityFeedId("defaultCommunityFeedId")
                .setName("defaultName")
                .setTime(LocalDate.now())
                .setLocation("Default location")
                .setJobCategory("Petcare")
                .setStatus("Open")
                .setComment("No comments")
                .setRating("No ratings")
                .build();
    }

    public static CommunityFeed createPost(String communityFeedId, String name, LocalDate time, String location,
                                           String jobCategory, String status, String comment, String rating) {
        return new CommunityFeed.Builder()
                .setCommunityFeedId(communityFeedId)
                .setName(name)
                .setTime(time)
                .setLocation(location)
                .setJobCategory(jobCategory)
                .setStatus(status)
                .setComment(comment)
                .setRating(rating)
                .build();
    }

    public static CommunityFeed createCopyOfPost(CommunityFeed existingPost) {
        return new CommunityFeed.Builder()
                .copy(existingPost)
                .build();
    }

    public static CommunityFeed createUrgentJobPost(String communityFeedId, String name, String location, String jobCategory, String comment, String rating) {
        return new CommunityFeed.Builder()
                .setCommunityFeedId(communityFeedId)
                .setName(name)
                .setTime(LocalDate.now())
                .setLocation(location)
                .setJobCategory("Urgent")
                .setStatus("Open")
                .setComment(comment)
                .setRating(rating)
                .build();
    }

    public static CommunityFeed createClosedJobPost(String communityFeedId, String name, String location, String jobCategory, String comment, String rating) {
        return new CommunityFeed.Builder()
                .setCommunityFeedId(communityFeedId)
                .setName(name)
                .setTime(LocalDate.now())
                .setLocation(location)
                .setJobCategory("Completed")
                .setStatus("Closed")
                .setComment(comment)
                .setRating(rating)
                .build();
    }
}

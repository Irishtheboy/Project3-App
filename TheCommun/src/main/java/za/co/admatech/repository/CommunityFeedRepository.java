package za.co.admatech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.admatech.domain.CommunityFeed;

import java.time.LocalDate;

@Repository
public interface CommunityFeedRepository extends JpaRepository<CommunityFeed, String> {

    CommunityFeed findByCommunityFeedId(String communityFeedId);

    CommunityFeed findByName(String name);

    CommunityFeed findByTime(LocalDate time);

    CommunityFeed findByLocation(String location);

    CommunityFeed findByJobCategory(String jobCategory);

    CommunityFeed findByStatus(String status);

    CommunityFeed findByComment(String comment);

    CommunityFeed findByRating(String rating);

    void deleteByCommunityFeedId(String communityFeedId);
}

package za.co.admatech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.admatech.domain.JobProvider;

@Repository
public interface JobProviderRepository extends JpaRepository<JobProvider,Long> {
    JobProvider findByEmail(String email);
    JobProvider findByPhoneNumber(String phoneNumber);
    JobProvider findByUserId(String userId);
    void deleteByUserId(String userId);
}

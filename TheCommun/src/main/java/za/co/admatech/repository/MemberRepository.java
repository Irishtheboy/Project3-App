package za.co.admatech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.admatech.domain.Member;
import za.co.admatech.domain.User;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member,Long> {
    Member findByEmail(String email);
    Member findByPhoneNumber(String phoneNumber);
    Member findByUserId(String userId);
    List<Member> findAll();
    void deleteByUserId(String userId);
}

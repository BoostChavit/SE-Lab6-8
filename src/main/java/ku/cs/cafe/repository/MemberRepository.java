package ku.cs.cafe.repository;

import ku.cs.cafe.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MemberRepository extends JpaRepository<Member, UUID> {
    //select * from Member where username like 'username'
    Member findByUsername(String username);
}

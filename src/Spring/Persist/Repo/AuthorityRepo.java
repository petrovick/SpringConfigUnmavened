package Spring.Persist.Repo;
import org.springframework.data.jpa.repository.JpaRepository;

import Spring.Persist.Entity.Authority;


public interface AuthorityRepo extends JpaRepository<Authority, Long> {

}
package Spring.Persist.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import Spring.Model.User;


public interface UserRepo extends JpaRepository<User, Long> {

}

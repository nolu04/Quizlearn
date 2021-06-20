package nolu04.quizlearn.repository;

import nolu04.quizlearn.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}

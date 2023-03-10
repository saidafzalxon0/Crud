package uz.java.Crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.java.Crud.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {

    Optional<User> findFirstByGmail(String gmail);

    Optional<User> findFirstById(Integer id);

    Optional<User> getFirstById(Integer id);

    void deleteById(Integer id);




}

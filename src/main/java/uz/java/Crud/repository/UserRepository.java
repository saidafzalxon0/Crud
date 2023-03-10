package uz.java.Crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.java.Crud.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}

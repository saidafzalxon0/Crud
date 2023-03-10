package uz.java.Crud.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@Entity
@Table(name = "Users")
public class User {


    @Id
    @GeneratedValue(generator = "user_id")
    @SequenceGenerator(name = "user_id",sequenceName = "user_id_seq",allocationSize = 1)
    private Integer id;

    @Column(name = "first_name", nullable = false)
    private String first_name;

    @Column(name = "last_name", nullable = false)
    private String last_name;

    @Column(name = "gmail", nullable = false)
    private String gmail;

}

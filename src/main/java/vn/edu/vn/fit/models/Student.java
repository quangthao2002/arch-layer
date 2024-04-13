package vn.edu.vn.fit.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vn.edu.vn.fit.untils.StudentStatus;

import java.util.List;

@Entity
@Getter @Setter @NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String email;

    private String phone;



    public Student(String name, String email, String phone){
        this.name = name;
        this.email = email;
        this.phone = phone;
    }


}


package id.ac.uinsgd.studentapp.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@Table(name = "student")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty(message = "first name is required")
    @Column(name = "first_name")
    private String firstName;

    @NotEmpty(message = "last name is required")
    @Column(name = "last_name")
    private String lastName;

    @NotEmpty(message = "email is required")
    @Column(name = "email", unique = true)
    private String email;

    @NotEmpty(message = "phone number is required")
    @Column(name = "phone_number", unique = true)
    private String phoneNumber;

    @NotEmpty(message = "jurusan is required")
    @Column(name = "jurusan", unique = true)
    private String jurusan;
}
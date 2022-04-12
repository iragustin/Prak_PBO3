package id.ac.uinsgd.studentapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import id.ac.uinsgd.studentapp.entity.Student;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findByEmail(String email);
}
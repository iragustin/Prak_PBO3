package id.ac.uinsgd.studentapp.service;

import id.ac.uinsgd.studentapp.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    public List<Student> getAllStudents();

    public Optional<Student> findById(Long id);

    Optional<Student> findByEmail(String email);

    public Student save(Student std);

    public void deleteById(Long id);
}

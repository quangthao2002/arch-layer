package vn.edu.vn.fit.services;

import vn.edu.vn.fit.models.Student;

import java.util.List;

public interface StudentService {
    // crud operations
    public List<Student> getAllStudents();

    public void saveStudent(Student student);

    public Student getStudentById(Long id);

    public void deleteStudentById(Long id);
}

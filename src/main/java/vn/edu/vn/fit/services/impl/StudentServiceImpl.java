package vn.edu.vn.fit.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.vn.fit.models.Student;
import vn.edu.vn.fit.repositorys.StudentRepository;
import vn.edu.vn.fit.services.StudentService;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
   // crud operations
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }
}

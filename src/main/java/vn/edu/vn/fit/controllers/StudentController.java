package vn.edu.vn.fit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.edu.vn.fit.models.Student;
import vn.edu.vn.fit.repositorys.StudentRepository;
import vn.edu.vn.fit.services.StudentService;

import java.util.List;

@Controller
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    private String getAllStudents(Model model) {

        List<Student>       students = studentService.getAllStudents();
        model.addAttribute("students",students);
        return  "students";

    }


}

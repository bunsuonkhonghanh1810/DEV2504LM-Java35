package com.devmaster.lesson06.controller;

import com.devmaster.lesson06.dto.StudentDTO;
import com.devmaster.lesson06.entity.Student;
import org.springframework.ui.Model;
import com.devmaster.lesson06.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public String getStudents(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "students/student-list";
    }

    @GetMapping("/add-new")
    public String addNewStudent(Model model) {
        model.addAttribute("student", new Student());
        return "students/student-add";
    }

    @GetMapping("/edit/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") Long id, Model model) {
        StudentDTO studentDTO = studentService
                .findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid id: " + id));
        model.addAttribute("student", studentDTO);
        return "students/student-edit";
    }

    @PostMapping
    public String saveStudent(@ModelAttribute("student") StudentDTO studentDTO) {
        studentService.save(studentDTO);
        return "redirect:/students";
    }

    @PostMapping("/update/{id}")
    public String updateStudent(@PathVariable(value = "id") Long id, @ModelAttribute("student") StudentDTO studentDTO) {
        studentService.updateStudentById(id, studentDTO);
        return "redirect:/students";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable(value = "id") Long id) {
        studentService.deleteStudent(id);
        return "redirect:/students";
    }
}

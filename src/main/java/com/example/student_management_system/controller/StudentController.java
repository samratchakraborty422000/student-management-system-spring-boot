package com.example.student_management_system.controller;

import com.example.student_management_system.entity.Student;
import com.example.student_management_system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    @Autowired
    private StudentService service;


    //=============Get all students=====================

    @GetMapping("/students")
    public String listStudents(Model model){
        model.addAttribute("students",service.getAllStudents());
        return "students";
    }

    //=============Create a student =====================

    @GetMapping("/students/new")
    public String createStudentForm(Model model){
        Student student= new Student();
        model.addAttribute("student",student);
        return "create_student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student){
        service.saveStudent(student);
        return "redirect:/students";
    }

    //=============Update a student =====================

    @GetMapping("students/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model){
        model.addAttribute("student",service.getStudentById(id));
        return "edit_student";
    }
    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student){

        Student s = service.getStudentById(id);

        s.setId(student.getId());
        s.setFirstName(student.getFirstName());
        s.setLastName(student.getLastName());
        s.setEmail(student.getEmail());

        service.updateStudent(s);
        return "redirect:/students";
    }
    //=============Delete a student =====================

    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id){
        service.deleteStudentById(id);
        return "redirect:/students";
    }

}

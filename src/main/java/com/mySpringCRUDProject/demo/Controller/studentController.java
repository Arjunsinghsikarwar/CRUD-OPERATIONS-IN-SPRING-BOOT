package com.mySpringCRUDProject.demo.Controller;

import com.mySpringCRUDProject.demo.Service.studentService;
import com.mySpringCRUDProject.demo.model.StudentInfo;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class studentController {

    @Autowired
    studentService service;

    @GetMapping("/student")
    public String StudentInfo(){

        return "Hey User You Can Do Login Here";

    }

    @PostMapping("/student/newStudent")
    public void addNewStudent(@RequestBody StudentInfo studentInfo){
            service.addnewStudent(studentInfo);
    }

    @GetMapping("/students")
    public List<StudentInfo> getAllStudent(){
        return service.getAllStudent();
    }

    @DeleteMapping("/student/deleteStudent")
    public String removeStudent(@RequestBody StudentInfo studentInfo){
        service.removeStudent(studentInfo);
        return "Successfully deleted";
    }

    @GetMapping("/student/{rollNumber}")
    public StudentInfo getStudentById(@PathVariable int rollNumber){
        return service.getStudentById(rollNumber);

    }

   @DeleteMapping("/student/deleteStudent/{rollNumber}")
    public String  deleteStudentById(@PathVariable int rollNumber) {
       try {
           service.deleteById(rollNumber);
           return "Student got Deleted successfully";
       } catch (Exception e) {
           return "This rollNUmber Is Not Exist";
       }
   }





}

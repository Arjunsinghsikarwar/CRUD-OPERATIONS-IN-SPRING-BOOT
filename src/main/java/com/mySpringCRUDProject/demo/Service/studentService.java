package com.mySpringCRUDProject.demo.Service;

import com.mySpringCRUDProject.demo.Repo.StudentRepo;
import com.mySpringCRUDProject.demo.model.StudentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class studentService {

    @Autowired
    StudentRepo repo;

   public void addnewStudent(StudentInfo stud){
       repo.save(stud);
   }
    public List<StudentInfo> getAllStudent() {
      return  repo.findAll();
    }

    public void removeStudent(StudentInfo studentInfo) {
        repo.delete(studentInfo);
    }


    public StudentInfo getStudentById(int rollNumber) {

        return repo.findById(rollNumber).
                orElseThrow(() -> new RuntimeException("Student is Not Even available"));
           // to throw an error if there is not even an student of this name.

    }

    public void deleteById(int rollNUmber){

        repo.findById(rollNUmber).orElseThrow(() -> new RuntimeException("This rollNumber Student did'nt Even Exist"));

        repo.deleteById(rollNUmber);
    }
}

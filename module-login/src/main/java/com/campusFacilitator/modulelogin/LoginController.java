package com.campusFacilitator.modulelogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class LoginController {
    @Autowired
    JPARepoStudent stuRepo;
    @Autowired
    JPARepoProfessor profRepo;

    Student stu;

   // @Autowired
  // Professor prof;


    @GetMapping("/loginStudent/idstudents/{sapid}/{password}")
    public String loginStudent(@PathVariable int sapid, @PathVariable String password){
        //List<Student> listAllStudents = stuRepo.findAll();
        Optional<Student> StudentById = stuRepo.findById(sapid);
        if(StudentById.isPresent()==true)
        {
             stu=StudentById.get();
            if (password.equals(stu.assword))
            {
                return "logged in succesfully";
            }
            else{
                return "wrong credentials";
            }
        }

       return "enter valid sapid";
    }

    @PostMapping("/signup/students")
    public ResponseEntity<String> signUpStudent(@RequestBody Student savestu)
    {
        Student savedStu = stuRepo.save(savestu);
        return new ResponseEntity<>("signup student", HttpStatus.OK);
    }

    @PostMapping("/signup/professors")
    public ResponseEntity<String> signUpProfessors(@RequestBody Professor saveprof)
    {
          profRepo.save(saveprof);
        return new ResponseEntity<>("signup teacher", HttpStatus.OK);
    }








}

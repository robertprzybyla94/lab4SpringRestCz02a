package com.exampleapp.app;


import com.exampleapp.app.NewStudent;
import com.exampleapp.app.Student;
import com.exampleapp.app.StudentService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


import org.springframework.web.bind.annotation.*;

@RestController
public class PunktyController

{
   private static CopyOnWriteArrayList
            <String> students = new CopyOnWriteArrayList<>(new String[]{
           "Student 1",
           "Student 2",
           "Student 3"
    });

   @RequestMapping("/students/users")
    public List<String> getStudents()
   {
        return students;
   }

   @PostMapping(path = "/students/users", consumes = "application/json", produces = "application/json")

  public boolean addStudent(@RequestBody String name){
       return students.add(name);
    }

   @PutMapping(path = "/students/users/{id}", consumes = "application/json", produces = "application/json")

   public boolean modifyStudent(@RequestBody String name, @PathVariable int id){

       return !students.set(id, name).equals(name);
    }
    @DeleteMapping(path = "/students/users/{id}")

    public String modifyStudent(@PathVariable int id)
    {
        return students.remove(id);
    }
}


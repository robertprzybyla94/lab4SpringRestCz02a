package com.exampleapp.app;

import  io.vavr.collection.List;
public class StudentService {

   private List<Student> getStudents= List.empty() ;
    public List<Student> getStudents()
        {
        //test
       // return List.empty();
       // throw new UnsupportedOperationException();
        //test 3
       return this.students;
    }

    private List<Student> students = List.empty();


    public Student addStudent(final NewStudent newStudent) {
        //Test 2
        //return  new Student(1,"aa","aa","aa");
        //Test 3
        Student created = new Student( getStudents().size() + 1, newStudent.name, newStudent.number, newStudent.group);
        students = students.prepend(created);
        return created;
    }
}
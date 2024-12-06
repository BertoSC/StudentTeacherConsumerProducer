package org.example;

public class Main {
    public static void main(String[] args) {
        Greeting greet = new Greeting();
        Person teacher = new Person("teacher", greet, -1);

        Thread thTeacher = new Thread(teacher);
        thTeacher.start();

        for (int i=1; i<=20; i++){
            Person student = new Person("student", greet, i);
            Thread est = new Thread(student);
            est.start();
        }
    }
}
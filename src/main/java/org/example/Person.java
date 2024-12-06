package org.example;

import javax.swing.*;
import java.util.Random;

public class Person implements Runnable{
    String personType;
    Greeting greet;
    int studentNum=0;

    public Person (String personType, Greeting greet, int num){
        this.personType=personType;
        this.greet=greet;
        this.studentNum=num;
    }

    public synchronized String getPersonType() {
        return personType;
    }

    public synchronized int getStudentNum() {
        return studentNum;
    }

    @Override
    public void run() {
        Random rm = new Random();
        int delay = rm.nextInt(0, 8000);
        try {
            Thread.sleep(delay);
            if (this.personType.equals("student")){
                greet.estudentGreet(this);
            } else {
                greet.teacherGreet(this);
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

package org.example;

import java.util.ArrayList;
import java.util.List;

public class Greeting {
    Boolean teacherInClass=false;
    List<Person> classOrder= new ArrayList<>();

    public synchronized void teacherGreet(Person p){
        classOrder.add(p);
        System.out.println("The teacher says good mourning class!");
        teacherInClass=true;
        notifyAll();
    }

    public synchronized void estudentGreet(Person p) throws InterruptedException {
        classOrder.add(p);
        while (!teacherInClass){
            wait();
        }

        int teacherIndex = -1;
        int studentIndex=-1;
        for (Person pers: classOrder){
            if (pers.getPersonType().equals("teacher")){
                teacherIndex=classOrder.indexOf(pers);
            }
            if (pers.getStudentNum()==p.studentNum){
                studentIndex=classOrder.indexOf(pers);
            }
        }

        if (teacherIndex<studentIndex) {
            System.out.println("The estudent "+p.getStudentNum()+" says : Excuse me teacher, I'm late, good morning");
        } else {
            System.out.println("The estudent "+p.getStudentNum()+" says :Good morning teacher");
        }
    }
}
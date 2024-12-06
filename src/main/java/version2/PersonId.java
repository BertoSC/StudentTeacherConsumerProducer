package version2;

import java.util.Random;

public class PersonId implements Runnable{
    String personType;
    GreetingId greet;
    int id=0;

    public PersonId (String personType, GreetingId greet, int num){
        this.personType=personType;
        this.greet=greet;
        this.id=num;
    }

    public synchronized String getPersonType() {
        return personType;
    }

    public synchronized int getStudentNum() {
        return id;
    }

    @Override
    public void run() {
        Random rm = new Random();
        int delay = rm.nextInt(0, 8000);
        try {
            Thread.sleep(delay);
            if (this.personType.equals("student")){
                greet.studentGreetId(this);
            } else {
                greet.teacherGreetId(this);
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
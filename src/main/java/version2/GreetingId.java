package version2;

public class GreetingId {
    boolean teacherInClass=false;

    public synchronized void teacherGreetId(PersonId p){
        teacherInClass=true;
        System.out.println("The teacher says : Good mourning class!");
        notifyAll();

    }

    public synchronized void studentGreetId(PersonId p) throws InterruptedException {
        int check = checkInClass();

        while(!teacherInClass){
            wait();
        }

        switch (check){
            case 1:
                System.out.println("The estudent "+p.getStudentNum()+" says : Excuse me teacher, I'm late, good morning");
                break;
            case 0:
                System.out.println("The estudent "+p.getStudentNum()+" says : Good morning, teacher");
                break;
        }
    }

    public synchronized int checkInClass(){
        if (teacherInClass){
            return 1;
        } else {
            return 0;
        }

    }
}

package version2;

public class MainLauncher {
    public static void main(String[] args) {
        GreetingId greet = new GreetingId();
        PersonId teacher = new PersonId("teacher", greet, -1);

        Thread thTeacher = new Thread(teacher);
        thTeacher.start();

        for (int i = 1; i <= 20; i++) {
            PersonId student = new PersonId("student", greet, i);
            Thread est = new Thread(student);
            est.start();
        }
    }
}

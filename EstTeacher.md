## DU2 - Exercise 9b - Students and teachers - wait() and notify()

We want to create a multithreaded application.

In the application we want to consider two types of people: students and teachers. We will use a Person class for both students and teachers.

The task to be performed by both students and teachers is to greet each other.  To perform this task, both students and teachers will share an object of the Greeting class.

When a teacher arrives in a classroom they greet.

When a student arrives in a classroom, if the teacher has not arrived, waits for the teacher to arrive. In case the teacher has arrived before the student, the student should greet the teacher and apologise for the delay.

We want to perform a simulation with 20 students and one teacher.

--

## DU2 - Ejercicio 9b - Estudiantes y profesores - wait() y notify()

Queremos crear una aplicación multihilo.

En la aplicación queremos considerar dos tipos de personas: alumnos y profesores. Utilizaremos una clase Persona tanto para los alumnos como para los profesores.

La tarea a realizar tanto por los estudiantes como por los profesores es saludarse.  Para realizar esta tarea, tanto alumnos como profesores compartirán un objeto de la clase Saludo.

Cuando un profesor llega a una clase saluda.

Cuando un alumno llega a un aula, si el profesor no ha llegado, espera a que llegue el profesor. En caso de que el profesor haya llegado antes que el alumno, el alumno debe saludar al profesor y disculparse por el retraso.

Queremos realizar una simulación con 20 alumnos y un profesor.

Traducción realizada con la versión gratuita del traductor DeepL.com
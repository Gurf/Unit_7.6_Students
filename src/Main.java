import java.util.Arrays;
import java.util.Random;

public class Main {
    //создаем массив с заданиями (Task)
    public static void main(String[] args) {
        Task[] listOfTasks = new Task[45];
        for (int i = 1; i < 46; i++) {
            if (i % 3 == 0) {
                listOfTasks[i - 1] = new Test(i, "Решите тест № " + i + ", опираясь на изученный материал");
            } else if (i % 2 == 0) {
                listOfTasks[i - 1] = new DragAndDrop(i, "Решите задание № " + i + ", опираясь на изученный материал");
            } else
                listOfTasks[i - 1] = new Code(i, "Напишите код по заданию № " + i + ", опираясь на изученный материал");
        }
        /*System.out.println(Arrays.toString(listOfTasks));
        for (Task task:listOfTasks
             ) {
            if (task instanceof Test) {
                System.out.println("Задание "+task.getNumber()+" это тест!");
            }
        }*/
        //Создаем массив с менторами
        Mentor[] listOfMentors = {
                new Mentor("Виталий Недотепов", 35),
                new Mentor("Виктор Астахов", 43),
                new Mentor("Серенада Мартельевна", 29)
        };

        //Создаем массив со студентами
        Student[] listOfStudents = {
                new Student("Семен Ерошенко", 25, listOfMentors[0]),
                new Student("Иля Ершова", 21, listOfMentors[1]),
                new Student("Прохор Илатовский", 24, listOfMentors[2]),
                new Student("Зося Антрекотова", 23, listOfMentors[0]),
                new Student("Платон Онищенко", 22, listOfMentors[1]),
                new Student("Иван Терентьев", 25, listOfMentors[2]),
                new Student("Алеся Карнаухова", 22, listOfMentors[0]),
                new Student("Дмитрий Яковлев", 24, listOfMentors[1]),
                new Student("Анна Егорова", 25, listOfMentors[2]),
        };
        listOfMentors[0].helpToStudent(listOfStudents[0]);
        System.out.println(listOfMentors[2].getName());
        Student.setSumOfTasks(Student.getSumOfTasks()+1);
        System.out.println(Student.getSumOfTasks());
       if (listOfMentors[1].checkCode(listOfTasks[0],Mentor.getConstantRandom()));

        Random random = new Random();

//    random.nextInt(5); //случайное число не больше 5
//Ниже показано, как сгенерировать случайное число в интервале от 100 до 200
        /*int min = 100;
        int max = 3500;
        int diff = max - min;*/
        int i = random.nextInt(3500 + 1);
//        i += min;

        System.out.println(i);
        System.out.println(i > 1000);

    }
}

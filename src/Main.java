import java.util.Random;

public class Main {
    //создаем массив с заданиями (Task)
    public static void main(String[] args) {
        Task[] listOfTasks = new Task[45];
        for (int i = 1; i < 46; i++) {
            if (i % 3 == 0) {
                listOfTasks[i - 1] = new Test(i, "\"Решите тест № " + i + ", опираясь на изученный материал\"");
            } else if (i % 2 == 0) {
                listOfTasks[i - 1] = new DragAndDrop(i, "\"Решите задание № " + i + "(Drag and drop), опираясь на изученный материал\"");
            } else
                listOfTasks[i - 1] = new Code(i, "\"Напишите код по заданию № " + i + ", опираясь на изученный материал\"");
        }
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
        System.out.println("Всего задач, которые должены решить все студенты: " + listOfStudents.length * listOfTasks.length);
        System.out.println("Всего задач, которые должен решить каждый студент: " + listOfTasks.length);
        //Все в цикле пока все студенты не решат все задачи
        // (т.е. пока Student.sumOfTasks<=listOfStudents.length*listOfTasks.length)
        while (Student.getSumOfTasks() < listOfStudents.length * listOfTasks.length) {
            for (Student student: listOfStudents) {
                if (student.isAll_welldone()) continue;
                int tempTasks = genRendom(1, listOfTasks.length - student.getTaskQuantity());
                System.out.println("Студент " + student.getName() + " получил блок из " + tempTasks + " заданий!");
                student.tasksToSolve(tempTasks, listOfTasks);
            }
        }
        System.out.println("Ура! Студенты решили все задачи!!");


    }
//Метод рендома от минимума до максимума
    public static int genRendom(int a_min, int a_max) {
        Random random = new Random();
        int diff = a_max -a_min;
        int out = random.nextInt(diff + 1);
        out += a_min;
        return out;
    }

}

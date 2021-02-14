//Student (наследник Person)
/*класс описывает студента и логику для работы с ним*/


public class Student extends Person {

    private int taskQuantity;//Количество решенных задач
    private static int sumOfTasks;//Количество решенных задач всеми студентами
    private Mentor mentor;//Ментор
    private boolean all_welldone;//Флаг, что студент решил все задания
    private Discipline course;


    /*Конструктор для всех полей, кроме количества решенных задач
    (оно для каждого нового студента равно 0)*/
    public Student(String name, int age, Mentor mentor) {
        this(name, age, 0, mentor, false, Discipline.JAVA);
    }

    public Student(String name, int age, int taskQuantity, Mentor mentor, boolean all_welldone, Discipline course) {
        super(name, age);
        this.taskQuantity = taskQuantity;
        this.mentor = mentor;
        this.all_welldone = all_welldone;
        this.course = course;

    }


    public int getTaskQuantity() {
        return taskQuantity;
    }

    public void setTaskQuantity(int taskQuantity) {
        this.taskQuantity = taskQuantity;
    }

    public static int getSumOfTasks() {
        return sumOfTasks;
    }

    public static void setSumOfTasks(int summ) {
        Student.sumOfTasks = summ;
    }


    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public boolean isAll_welldone() {
        return all_welldone;
    }

    public void setAll_welldone(boolean all_welldone) {
        this.all_welldone = all_welldone;
    }

    public Discipline getCourse() {
        return course;
    }

    public void setCourse(Discipline course) {
        this.course = course;
    }


    //    Решить задачи
    /*Аргументы: Число задач типа int
    и массив с заданиями типа Task*/
    public void tasksToSolve(int tasksNumber, Task[] tasks) {
        /*Студенту передаётся число задач, которые он должен решить и ссылка на массив с заданиями
➜ У студента есть количество задач, которые он уже решил, а значит вы можете вычислить, с какой задачи начинать решение.*/
        int nom = getTaskQuantity();
//➜ Для решения задач студент вызывает метод Решить задачу (в цикле).
        for (int i = nom; i < nom + tasksNumber; i++) {
            taskToSolve(tasks[i]);
//➜ Если студент решил все задачи из массива, то напечатать об этом сообщение и выставить true в соответствующее поле
            if (getTaskQuantity() == tasks.length) {
                System.out.println("Студент " + getName() + " решил все задачи!");
                setAll_welldone(true);
            }
//➜ Иначе напечатать сообщение о том, что не все задачи решены и вернуть false
            else {
                System.out.println("У студента " + getName() + " остались нерешенные задачи!");
            }
        }


    }

    //    Решить задачу
    private void taskToSolve(Task task) {
        /*Если задание проверяется автоматически, то напечатать сообщение о том, что задание выполнено и закончить работу метода
        Иначе у текущего отправлять ментору задание на проверку до тех пор, пока оно не будет зачтено
        Не забудьте увеличить число решенных студентом и всеми студентами задач*/
        System.out.println("Очередное задание студента "+getName()+": "+task.getZadaniye());
        task.someTask(this);
        if (!(task instanceof Autochecked)) {
            boolean notComplete;
            do {
                notComplete = !(mentor.checkCode(task, Mentor.getConstantRandom(), this));
            } while (notComplete);
        }


        setTaskQuantity(getTaskQuantity() + 1);
        Student.sumOfTasks++;
        System.out.println("Студент " + getName() + " решил задач: " + getTaskQuantity());
        System.out.println("Всеми студентами решено задач: " + sumOfTasks);
    }

}

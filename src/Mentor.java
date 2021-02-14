import java.util.Random;

//наследник Person, реализует Staff
/*Этот класс описывает ментора, который проверяет задания студента,
отвечает на вопросы и делится дополнительными материалами.*/
public class Mentor extends Person implements Staff {
    private boolean mood;//настроение ментора
    private static final int CONSTANT_RANDOM = 3500;//Константа рандома

    /*По умолчанию вызывает родительский конструктор
    и присваивает ментору хорошее настроение*/
    public Mentor(String name, int age) {
        super(name, age);
        this.mood = true;//конструктор по умолчанию присваивает ментору хорошее настроение
    }

    public static int getConstantRandom() {
        return CONSTANT_RANDOM;
    }


    public boolean isMood() {
        return mood;
    }

    public void setMood(boolean mood) {
        this.mood = mood;
    }

    //Помочь студенту (переопределяет метод из интерфейса)
//Напечатать приободряющее сообщение, в сообщении должно быть имя студента
    @Override
    public void helpToStudent(Student student) {
        System.out.println(student.getName() + ", cконцентрируйтесь,у Вас все получится!");
    }
    //    Проверить код
   /* Логика работы
➜ В начале метода рандомно генерируется какое-то число, если это число больше 1000, то настроение у ментора хорошее,
 иначе плохое.
            ➜ Если у ментора плохое настроение, то он задачу не принимает.
            Должно быть напечатано сообщение о том, что задача (в сообщении указать номер задачи) не принято
            и вернуть false.
            ➜ Иначе напечатать сообщение о том, что задача принята и вернуть true.*/

    private static boolean randomMood(int constan) {
        return (Main.genRendom(0, constan) > 1000);
    }


    public boolean checkCode(Task zadanie, int forMoodCreation, Student student) {
//Random используется для генерации случайных чисел
        System.out.println("Meнтор " + this.getName() + " проверяет код который написал(а) " + student.getName());
        setMood(randomMood(forMoodCreation));
        if (!isMood()) {
            System.out.println("Задание № " + zadanie.getNumber() + " не принято!");
            helpToStudent(student);
            giveAddInforfation();
        } else {
            System.out.println("Задание № " + zadanie.getNumber() + "  принято ментором " + this.getName() + "!");
        }
        return isMood();
    }
}

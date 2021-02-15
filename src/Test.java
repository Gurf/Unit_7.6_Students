import java.util.Arrays;

// Наследник Task, реализует интерфейс Autochecked
public class Test extends Task implements Autochecked {
    private String[] answers /*= new String[]{"a", "b", "c"}*/;

    /*Конструктор по умолчанию вызывает конструктор родителя
     и массиву присваивает ссылку на массив {“a”, “b”, “c”}*/
    public Test(int number, String zadaniye) {
        super(number, zadaniye);
        this.answers = new String[]{"a", "b", "c"};
    }

    /*public Test(int number, String zadaniye, String[] answers) {
        super(number, zadaniye);
        this.answers = answers;
    }*/

    @Override
    public void someTask(Student student) {
        System.out.println("Задание № " + this.getNumber() + " (Test) выполняется студентом "+student.getName());
        checkTaskAutomatically();
    }

    /*@Override
    public void doTask() {

    }*/

       /* @Override
public String toString() {
        return "Test{" +
                "answers=" + Arrays.toString(answers) +
                '}';
    }*/
}

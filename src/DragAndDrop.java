import java.util.Arrays;

//
public class DragAndDrop extends Task implements Autochecked {
    String[][] variants;

    /*Конструктор по умолчанию вызывает конструктор родителя и массиву присваивает ссылку на новый двумерный массив,
    заполненный значениями по вашему усмотрению*/
    public DragAndDrop(int number, String zadaniye) {
        super(number, zadaniye);
        variants = new String[3][4];
    }


    @Override
    public void someTask(Student student) {
        System.out.println("Задание № " + this.getNumber() + " (DragAndDrop) выполняется студентом "+student.getName());
        checkTaskAutomatically();
    }

    @Override
    public String toString() {
        return "DragAndDrop{" +
                "variants=" + Arrays.toString(variants) +
                '}';
    }
}

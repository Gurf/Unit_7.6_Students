import java.util.Arrays;

//
public class DragAndDrop extends Task implements Autochecked {
    String[][] variants;

    public DragAndDrop(int number, String zadaniye) {
        super(number, zadaniye);
        variants = new String[3][4];
    }

    /*Конструктор по умолчанию вызывает конструктор родителя и массиву присваивает ссылку на новый двумерный массив,
    заполненный значениями по вашему усмотрению*/


    @Override
    public void someTask() {
        System.out.println("Задание № " + this.getNumber() + " (DragAndDrop) выполняется");
        checkTaskAutomatically();
    }

    @Override
    public String toString() {
        return "DragAndDrop{" +
                "variants=" + Arrays.toString(variants) +
                '}';
    }
}

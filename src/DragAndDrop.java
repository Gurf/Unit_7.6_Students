//
public class DragAndDrop extends Task implements Autochecked {
    String[][] variants;

    /*Конструктор по умолчанию вызывает конструктор родителя и массиву присваивает ссылку на новый двумерный массив,
    заполненный значениями по вашему усмотрению*/
    public DragAndDrop(int number, String zadaniye, String[][] variants) {
        super(number, zadaniye);
        this.variants = variants;
    }
}

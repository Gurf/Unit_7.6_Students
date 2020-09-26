// Наследник Task, реализует интерфейс Autochecked
public class Test extends Task implements Autochecked {
    private String[] answers = new String[]{"a", "b", "c"};

    /*Конструктор по умолчанию вызывает конструктор родителя
     и массиву присваивает ссылку на массив {“a”, “b”, “c”}*/
    public Test(int number, String zadaniye) {
        super(number, zadaniye);
    }
}

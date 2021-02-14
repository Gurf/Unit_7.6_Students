public class Code extends Task {
    String textOfCode;

    /*Конструктор по умолчанию вызывает конструктор
     родителя и присваивает полю строку на ваше усмотрение*/
    public Code(int number, String zadaniye) {
        super(number, zadaniye);
        this.textOfCode = "int a = new int";
    }

    public Code(int number, String zadaniye, String textOfCode) {
        super(number, zadaniye);
        this.textOfCode = textOfCode;
    }

    /*public Code(int number, String zadaniye, String textOfCode) {
        super(number, zadaniye);
        this.textOfCode = textOfCode;
    }*/

    @Override
    public void someTask() {
        System.out.println("Задание № " + this.getNumber() + " написать код выполняется");
    }


}

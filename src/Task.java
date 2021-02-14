/*Абстрактный Класс описывает задачу, которая даётся студенту для решения.
Во всех заданиях по желанию вы можете реализовать свой собственный конструктор
и инициализировать задание с его помощью.*/
abstract class Task {
    private int number;
    private String zadaniye;

    /*Конструктор по умолчанию присваивает полям значение 0 и любой текст*/
    /*public Task() {
        this.number = 0;
        this.zadaniye = "Решите задачу, опираясь на изученный материал";
    }*/

    public Task(int number, String zadaniye) {
        this.number = number;
        this.zadaniye = zadaniye;
    }

    public abstract void someTask();

    @Override
    public String toString() {
        return "Task{" +
                "number=" + number +
                ", zadaniye='" + zadaniye + '\'' +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getZadaniye() {
        return zadaniye;
    }

    public void setZadaniye(String zadaniye) {
        this.zadaniye = zadaniye;
    }
}

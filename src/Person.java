import lombok.Data;

//Этот класс описывает человека и содержит его основные свойства.
@Data
public class Person {
    private String name;
    private String surname;
    private int age;

    /*Этот класс описывает человека и содержит его
    основные свойства.*/
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

//Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}




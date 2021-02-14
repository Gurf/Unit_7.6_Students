import lombok.Data;

//Этот класс описывает человека и содержит его основные свойства.
@Data
public class Person {
    private String name;//имя и фамилия
    private int age;

    /*Этот класс описывает человека и содержит его
    основные свойства.*/
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}




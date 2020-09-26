public interface Staff {

    void helpToStudent(/*ссылка на студента??*/);

    default void giveAddInforfation() {
        System.out.println("Ознакомьтесь с метериалом по ссылке: https://habr.com/ru/company/golovachcourses/blog/215275/");
    }


}

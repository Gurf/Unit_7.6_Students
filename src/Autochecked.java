public interface Autochecked {
    default void checkTaskAutomatically() {//Используются, чтобы отметить задания, которые проверяются автоматически
        System.out.println("Задание выполнено");
    }
}

public interface Autochecked {
    default void doTask() {
        System.out.println("Задание выполнено");
    }
}

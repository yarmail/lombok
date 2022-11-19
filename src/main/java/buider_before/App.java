package buider_before;

import java.util.List;

/**
 * Создаем Person через PersonBuilder
 */
public class App {
    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .setName("Name1")
                .setSurname("Surname1")
                .setAge(1)
                .setWeight(1)
                .setComments(List.of("comment1", "comment2", "comment3"))
                .build();
        System.out.println(person);
    }
}
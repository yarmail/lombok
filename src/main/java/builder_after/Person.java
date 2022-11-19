package builder_after;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;
import java.util.List;

@Builder
@ToString
public class Person {
    private String name;
    private String surname;
    private int age;
    private int weight;
    @Singular private List<String> comments;

    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .name("name")
                .surname("Surename")
                .age(1)
                .weight(1)
                .comment("comment1")
                .comment("comment2")
                .comment("comment3")
                .build();
        System.out.println(person);
    }
}
/* Примечание
Аннотация @Singular позволяет при создании объекта
использовать удобный способ заполнения списков
т.е. вместо
.setComments(List.of("comment1", "comment2", "comment3"))

мы можем сделать
.comment("comment1")
.comment("comment2")
.comment("comment3")
 */
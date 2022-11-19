package buider_before;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.List;

@ToString
@Getter
@Setter
public class Person {
    private String name;
    private String surname;
    private int age;
    private int weight;
    private List<String> comments;
}
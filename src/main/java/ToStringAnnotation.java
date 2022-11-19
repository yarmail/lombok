import lombok.ToString;

/**
 * @ToString используется для класса
 * генерирует метод toString
 */
@ToString
public class ToStringAnnotation {
    private int id;
    private String name;


    public static void main(String[] args) {
        System.out.println(new ToStringAnnotation());
    }
}
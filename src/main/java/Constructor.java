import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * Аннотации для создания конструкторов.
 * Используются для класса.
 *
 * @NoArgsConstructor - создается конструтор без параметров.
 * @RequiredArgsConstructor - создает конструктор по полям отмеченным @NonNull
 * @AllArgsConstructor создает конструктор со вмести полями.
 */
@RequiredArgsConstructor
public class Constructor {
    @NonNull private int id;
    @NonNull  private String name;
    private String age;
}

/* Смотрим, что получилось после компилляции
в файле target/classes/Constructor.class

     public Constructor(@NonNull int id, @NonNull String name) {
        if (name == null) {
            throw new NullPointerException("name is marked non-null but is null");
        } else {
            this.id = id;
            this.name = name;
        }
    }



 */
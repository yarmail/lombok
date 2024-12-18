import lombok.Getter;
import lombok.Setter;

/**
 * @Getter @Setter
 * применяются к полю, создают геттер и сеттер
 *
 */
public class GetterSetter {
    @Getter
    @Setter
    private int id;
    private String name;
}
/* Другие варианты использования

так - для всего класса,

@Getter
@Setter
public class GetterSetter {
    private int id;
    private String name;
}

---

и так, для большего удобства

public class GetterSetter {
    @Getter @Setter private int id;
    @Getter private String name;
}
*/


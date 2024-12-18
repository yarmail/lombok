import lombok.EqualsAndHashCode;

/**
 * @EqualsAndHashCode - создаёт методы equals() и @hashCode().
 * Эта аннотация имеет параметры, в которых можно указать
 * какие поля использовать для вычисления hashCode, equals
 * По умолчанию используются все не статические поля.
 * Чтобы явно указать, какие поля использовать в equals и hashCode
 * нужно включить параметр onlyExplicitlyIncuded и
 * отметить нужные поля аннотацией @EqualsAndHashCode.Include.
 * Вычисление методов equals и hashCode сделаем на основании поля name.
 */
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class EqualsHash {
    private int id;
    @EqualsAndHashCode.Include
    private String name;
}

/* Сгенерированный метод hashCode
    public int hashCode() {
        int PRIME = true;
        int result = 1;
        Object $name = this.name;
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        return result;
    }
*/
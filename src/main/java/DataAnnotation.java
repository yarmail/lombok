import lombok.Data;


/**
Аннотация Data заменяет все вспомогательные методы:
геттеры, сеттеры, иквалс, хешкод, тустринг

Вывод можно посмотреть в
target/classes/DataAnnotation.class
или использовать main метод для проверки
*/
@Data
public class DataAnnotation {
    int id;
    String name;
}

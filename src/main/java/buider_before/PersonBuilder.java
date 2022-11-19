package buider_before;

import java.util.List;

/**
 * return this
 * как я понимаю такая форма возврата позволяет
 * использовать механизм последовательного вызова
 * нескольких методов
 * .method1
 * .method2
 * .method3
 *
 */
public class PersonBuilder {
    private Person person;

    public PersonBuilder() {
        person = new Person();
    }

    public PersonBuilder setName(String name) {
        person.setName(name);
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        person.setSurname(surname);
        return this;
    }

    public PersonBuilder setAge(int age) {
        person.setAge(age);
        return this;
    }

    public PersonBuilder setWeight(int weight) {
        person.setWeight(weight);
        return this;
    }

    public PersonBuilder setComments(List<String> comments) {
        person.setComments(comments);
        return this;
    }

    public Person build() {
        return person;
    }
}
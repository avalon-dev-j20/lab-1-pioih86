package ru.avalon.java.j20.labs.models;

/**
 * Представление о человеке.
 */
public class Person {
    /**
     * Имя.
     */
    private final String name;
    /**
     * Фамилия.
     */
    private final String surname;

    /**
     * Создаёт экземпляр класса на основании имени и даты
     * рождения.
     *
     * @param name    имя человека
     * @param surname дата рождения человека
     */
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    /**
     * возвращает имя человека.
     *
     * @return имя человека
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает фамилию человека.
     *
     * @return фамилия человека
     */
    public String getSurname() {
        return surname;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + surname.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Person person = (Person) obj;
        return getName().equals(person.getName()) && getSurname().equals(person.getSurname());
    }
}

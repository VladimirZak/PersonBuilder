public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    public PersonBuilder() {
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age >= 0) {
            this.age = age;
            return this;
        } else {
            throw new IllegalArgumentException("Возраст не может быть отрицательным!");
        }
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if ((this.name != null && !this.name.isEmpty()) && (this.surname != null && !this.surname.isEmpty())) {
            return new Person(this);
        } else {
            throw new IllegalStateException("Поля с именем и фамилией обязательны к заполнению!");
        }
    }
}
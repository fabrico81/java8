package java8.cpt_6;

public class Person {

    private String name;
    private String surname;

    public String toString(){
        return getName() + " " + getSurname();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

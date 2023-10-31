package Tablas;

public class Student {

    private String nif;
    private String name;
    private String surname;
    private int age;

    public Student(){};
    public Student(String nif, String name, String surname, int age) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

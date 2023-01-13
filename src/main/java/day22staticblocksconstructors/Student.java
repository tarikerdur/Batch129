package day22staticblocksconstructors;

public class Student {

    String name;
    int age;
    int grade;
    String stdId;
    String address;

    public Student(String name, int age, int grade, String stdId, String address) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.stdId = stdId;
        this.address = address;
    }

    public Student(String name, int age, String stdId) {
        this.name = name;
        this.age = age;
        this.stdId = stdId;
    }

    @Override
    public String toString() { // Genelde "toString()" en sona konur ama nereye koysaniz da calisir, dedi.
        return "{" + // bu formati degistirebilirsiniz, dedi.
                "nAme='" + name + '\'' +
                ", AgE=" + age +
                ", gRaDe=" + grade +
                ", stdID='" + stdId + '\'' +
                ", aDDreSs='" + address + '\'' +
                '}';
    }
}

package ds;

public class Person {
	String fname;

    int age;

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public Person(String fname,  int age) {
        this.fname = fname;

        this.age = age;
    }

    public Person(String fname) {
        this.fname = fname;
    }

    @Override
    public String toString() {
        return fname  + age;
    }
}
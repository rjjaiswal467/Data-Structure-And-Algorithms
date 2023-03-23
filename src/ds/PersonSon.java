package ds;

import newpackage.Employee;

import java.util.ArrayList;
import java.util.List;

public class PersonSon {
    public static void main(String[] args) {
        Person person1 = new Person("Raj",20);
        Person person2 = new Person("Raj1",21);
        Person person3 = new Person("Raj2",22);
        Person person4 = new Person("Raj3",23);
        List<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);

        for(Person employee: list){

            if(employee.fname.equals("Raj2")){
                System.out.println(employee.getFname()+ " " +employee.getAge());
            }
        }
    }
}

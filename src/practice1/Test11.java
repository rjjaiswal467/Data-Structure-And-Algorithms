package practice1;

import java.util.*;

public class Test11 {

    String name;

    int id;

    public Test11(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Test11{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

}

class Employee{

    public static void main(String[] args) {

        List<Test11> list = new ArrayList<>();

        Test11 test11 = new Test11("Raj",1);
        Test11 test12 = new Test11("Abhi",2);
        Test11 test13 = new Test11("Zaid",3);

        list.add(test11);
        list.add(test12);
        list.add(test13);

        Collections.sort(list,((o1, o2) -> {

            return o1.name.compareTo(o2.name);
        }
                ));

        for(Test11 employee: list){
            System.out.println(employee);
        }

        Map<Integer,String> map = new HashMap<>();
        for(Test11 employee: list){
            map.put(employee.id, employee.name);
        }
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("Id:-"+ entry.getKey() + " Name: "+ entry.getValue());
        }
    }

}

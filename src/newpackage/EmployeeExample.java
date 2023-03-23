package newpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeExample {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        Employee e1 = new Employee("RAJ",200,27,"SSE");
        Employee e2 = new Employee("AB",210,21,"SSE");
        Employee e3 = new Employee("BH",290,22,"SSE");
        Employee e4 = new Employee("HG",303,27,"SSE");
        Employee e5 = new Employee("RAJ",303,29,"SSE");
        Employee e6 = new Employee("AP",200,25,"SSE");
        list.add((e1));
        list.add((e2));
        list.add((e3));
        list.add((e4));
        list.add((e5));
        list.add((e6));

        System.out.println("-----------------------------------------------------------------METHOD REFERENCE---------------------------------------------------------------");
        list.forEach(System.out::println);
        for(Employee emp:list){
            System.out.println(emp);
        }

        System.out.println("-----------------------------------------------------------------SORT ON SALARY USING COMPARABLE---------------------------------------------------------------");
        Collections.sort(list,(o1, o2) -> {
            return o1.salary<o2.salary?1:-1;
        });
        for (Employee employee1 :list){
            System.out.println(employee1);
        }

        System.out.println("-----------------------------------------------------------------SORT ON SALARY AND NAME USING COMPARATOR---------------------------------------------------------------");
        Collections.sort(list,(o1,o2)->{
            return o1.salary<o2.salary? o1.salary - o2.salary : o1.name.compareTo(o2.name);
        });
        for(Employee employee1 : list){
            System.out.println(employee1);
        }
        System.out.println("-----------------------------------------------------------------GET MAX SALARY---------------------------------------------------------------");

        int maxSalary = list.stream().map(Employee::getSalary).max(Integer::compare).get();
        System.out.println("max salary-> "+ maxSalary);

//        list.stream().filter(x->x.getSalary()==maxSalary).forEach(e->System.out.println(e));
//        OR
        list.stream().filter(x->x.getSalary()==maxSalary).forEach(System.out::println);
        System.out.println("get all name which starts wth A");
        list.stream().filter(x->x.getName().startsWith("A")).forEach(System.out::println);

        System.out.println("-----------------------------------------------------------------GET AVERAGE SALARY---------------------------------------------------------------");
        IntSummaryStatistics statistics = list.stream().mapToInt(x->x.getSalary()).summaryStatistics();
        System.out.println("Highest number in List : " + statistics.getMax());
        System.out.println("Lowest number in List : " + statistics.getMin());
        System.out.println("Sum of all numbers : " + statistics.getSum());
        System.out.println("Average salary of all employee is: " +statistics.getAverage());
        System.out.println("Number of employee: " +statistics.getCount());

        System.out.println("-----------------------------------------------------------------USE OF PREDICATE---------------------------------------------------------------");

        Predicate<Integer> p1 = x->x%2==0;
        System.out.println(p1.test(10));
        System.out.println(p1.negate().test(15));
    }
}

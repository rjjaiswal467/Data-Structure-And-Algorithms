package stream1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);
        list.add(66);
        list.add(77);
        list.add(88);

//        List l1 = list.stream().filter(x->x%2==0).collect(Collectors.toList());
//        System.out.println("Print even number: "+l1);

        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        Predicate<Integer> p1 = x-> x%2==0;
        List l2 = list.stream().filter(p1.negate()).collect(Collectors.toList());
        System.out.println("Print odd no: "+l2);

        List l3 = list.stream().filter(p1).collect(Collectors.toList());
        System.out.println("Print even no: " +l3);


        List l4 = list.stream().map(x->x*2).collect(Collectors.toList());
        System.out.println("Double up: "+l4);

        int reduce = list.stream().reduce(0,(ans,i)->ans+i);//sum of all number in the list.
        System.out.println("Reduce: "+reduce);

    }
}

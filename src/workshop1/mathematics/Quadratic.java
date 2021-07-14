package workshop1.mathematics;

import java.util.ArrayList;
import java.util.Scanner;

public class Quadratic {

    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        int r1,r2;
        double check;
        ArrayList<Integer> list = new ArrayList<>();
        check = ((b*b)-4*a*c);
        if(check<0){
            System.out.println("Imaginary");
        }
        else{
            r1 = (int) Math.floor((-b+Math.sqrt(check))/(2*a));
            list.add(r1);
            r2 =(int) Math.floor((-b-Math.sqrt(check))/(2*a));
            list.add(r2);
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
        Quadratic obj = new Quadratic();
            ArrayList<Integer> ans = obj.quadraticRoots(a, b, c);
            if (ans.size() == 1 && ans.get(0) == -1)
                System.out.print("Imaginary");
            else
                for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }

package newpackage;

import java.util.ArrayList;

public class FirstNonRepeatingCharacter {

    static Character nonRepeating(String S){

        ArrayList<Character> arrayList = new ArrayList<>();

        for(int i =0; i<S.length(); i++){

            if(arrayList.contains(S.charAt(i))){
                arrayList.remove(Character.valueOf(S.charAt(i)));
            }else{
                arrayList.add(S.charAt(i));
            }
        }
        return arrayList.get(0);
    }
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(FirstNonRepeatingCharacter.nonRepeating(s));

    }
}

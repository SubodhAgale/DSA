package Stack;
import java.util.*;
import java.util.Arrays;
public class Stackinfix {
    Node top;


    public static void main(String[] args) {
        StackUsingLL s = new StackUsingLL();

        String str = "a+b*(c-d)/e+f";
        int num = -1;
        int ind = 0;
        boolean flag = false;
        char arr[] = new char[str.length()];
        char operator[]=new char[arr.length];
        int ind1=0;
        for (int i = 0; i < str.length(); i++) {
            flag = false;
            char c = str.charAt(i);
            if (Character.compare(c, '+') == 0 || Character.compare(c, '-') == 0) {
                num = 1;
                flag = true;
            } else if (Character.compare(c, '*') == 0 || Character.compare(c, '/') == 0) {
                num = 2;
                flag = true;
            } else if (Character.compare(c, '(') == 0 || Character.compare(c, ')') == 0) {
                num = 3;
                flag = true;
            }


          System.out.println(flag);
            if (flag) {
                if(num>s.pop())
              System.out.print("stack"+num);
            s.push(num);
                operator[ind1]=c;
                ind1++;
            } else {
                arr[ind] = c;
                ind++;
                //System.out.print("character"+c);
            }
        }
        s.display();
       System.out.print("arr"+ Arrays.toString(arr));
        System.out.println((Arrays.toString(operator)));
    }
}


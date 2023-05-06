import javax.swing.*;

public class main {
    public static String signOfSubtraction(int a, int b){
        int sub = a-b;

        if (sub>0){
            return "POSITIVE";
        } else if (sub<0) {
            return "NEGATIVE";
        } else {
            return "EQUAL";
        }
    }


    public static void main(String args[]) {
        String sign = signOfSubtraction(10, 5);
        System.out.println(sign);

    }
}
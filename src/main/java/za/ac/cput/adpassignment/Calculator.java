package za.ac.cput.adpassignment;
/*
 * Name: Nolusindiso Makosa
 * Student Number: 219023557
 * File : Calculator Class
 */
import java.util.concurrent.TimeUnit;

public class Calculator {
    public String concatenation(String x, String y,String z){
        return x+y+z;
    }
    public int stringLength(String str1) {
        try {
            TimeUnit.MILLISECONDS.sleep(200);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return str1.length();
    }

    public String strings(String string1, String string2){
        String tr="";
        return tr;
    }

    public int calculate (int x1, int x2) {
        return x1+x2;
    }

}

import java.util.HashMap;
import java.util.Scanner;
public class IntegerToRoman {
    public static String inttorom(int number) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "I");
        hm.put(2, "II");
        hm.put(3, "III");
        hm.put(4, "IV");
        hm.put(5, "V");
        hm.put(6, "VI");
        hm.put(7, "VII");
        hm.put(8, "VIII");
        hm.put(9, "IX");
        hm.put(10, "X");
    }
}

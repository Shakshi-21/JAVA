import java.util.HashMap;
import java.util.Scanner;;
public class RomanToInteger {
   public static int romtoint(String roman) {
    HashMap<String, Integer> hm = new HashMap<>();
    hm.put("I", 1);
    hm.put("II", 2);
    hm.put("III", 3);
    hm.put("IV", 4);
    hm.put("V", 5);
    hm.put("VI", 6);
    hm.put("VII", 7);
    hm.put("VIII", 8);
    hm.put("IX", 9);
    hm.put("X", 10);
    
    if(hm.containsKey(roman)) {
        return hm.get(roman);
    } else {
        throw new IllegalArgumentException("Invalid roman numerical");
    }
   }
   public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Roman Numerical: ");
        String roman = sc.nextLine().trim().toUpperCase();

        try {
            int result = romtoint(roman);
            System.out.println("Integer Value: "+result);
        } catch(IllegalArgumentException e) {
           System.out.println(e.getMessage()); 
        }
   }    
}

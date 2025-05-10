import java.util.HashMap;
import java.util.Scanner;

public class revised {

    // Method to convert Roman numeral to integer
    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();

        // Mapping Roman characters to their values
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        // Loop through characters from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            int currValue = romanMap.get(ch);

            // If current value is less than the previous, subtract
            if (currValue < prevValue) {
                result -= currValue;
            } else {
                result += currValue;
            }

            prevValue = currValue;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String roman = scanner.nextLine().toUpperCase().trim();

        try {
            int value = romanToInt(roman);
            System.out.println("Integer value: " + value);
        } catch (Exception e) {
            System.out.println("Invalid Roman numeral.");
        }

        scanner.close();
    }
}


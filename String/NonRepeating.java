public class NonRepeating {
    public static char repeat(String s) {
        for(int i=0;i<s.length();i++) {
            boolean isUnique=true;
            for(int j=0;j<s.length();j++) {
                if(i != j && s.charAt(i)==s.charAt(j)) {
                    isUnique=false;
                    break;
                }
            }
            if(isUnique) {
                return s.charAt(i);
            }
        }
        return '$';
    }
    public static void main(String args[]) {
        String s ="ShakshiBhattacharya";
        System.out.println(repeat(s));
    }
}

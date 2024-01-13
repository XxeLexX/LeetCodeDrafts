public class RomanToIntMain {
    public static void main(String[] args) throws Exception {
        RomanToInt romanToInt = new RomanToInt();
        
        String s1 = "III";
        String s2 = "XXXIV";
        String s3 = "MCMXCIV";

        int res1 = romanToInt.romanToInt(s1);
        int res2 = romanToInt.romanToInt(s2);
        int res3 = romanToInt.romanToInt(s3);

        System.out.println(res1 + ", " + res2 + ", " + res3);
    }
}

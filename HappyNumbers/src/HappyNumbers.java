public class HappyNumbers {
    public boolean isHappy(int n) {
        // Recursiv
        if (n == 1) {
            return true;
        } else {
            // convert int to string, so that can get the digits
            String tempNumber = String.valueOf(n);
            int res = 0;
            // traverse each digits
            for (int i = 0; i < tempNumber.length(); i++) {
                int d = Integer.valueOf(tempNumber.substring(i, i + 1));
                res += d * d;
                n = res;
            System.out.println("n = " + n);
            }
            return isHappy(n);
        }
    }
}
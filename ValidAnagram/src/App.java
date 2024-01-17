public class App {
    public static void main(String[] args) throws Exception {
        String s = "anagram";
        String t = "nagaram";
        Solution solution = new Solution();
        System.out.println(solution.isAnagram(s, t));
        System.out.println(solution.isAnagram2(s, t));

    }
}

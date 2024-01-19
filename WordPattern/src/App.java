public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        String pattern = "abba";
        String input = "dog dad dad dog";
        String input2 = "dog dog dog dog";
        boolean res = solution.wordPattern(pattern, input);
        System.out.println(res);
    }
}

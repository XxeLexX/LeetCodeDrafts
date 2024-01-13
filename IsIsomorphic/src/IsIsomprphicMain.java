public class IsIsomprphicMain {
    public static void main(String[] args) throws Exception {
        IsIsomorphic isIsomorphic = new IsIsomorphic();
        String a = "paper";
        String b = "bdber";
        boolean res = isIsomorphic.isIsomorphic(a, b);
        System.out.println(res);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        ContainsNearbyDuplicate containsNearbyDuplicate = new ContainsNearbyDuplicate();
        int[] t1 = {1,2,3,4,5,6,7,8,9,9};
        int k = 2;
        boolean res = containsNearbyDuplicate.way2(t1, k);
        System.out.println(res);
    }
}

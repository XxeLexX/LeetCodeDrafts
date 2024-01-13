public class App {
    public static void main(String[] args) throws Exception {
        int[] test1 = {1,2,3,4};
        int[] test2 = {1,1,1,3,3,4,3,2,4,2};

        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        boolean res1 = containsDuplicate.wayTwo(test1);
        boolean res2 = containsDuplicate.wayTwo(test2);
    
        System.out.println("res1 = " + res1 + ", res2 = " + res2);

    }
}

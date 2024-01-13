public class MajorityElementsMain {
    public static void main(String[] args) throws Exception {
        MajorityElements mj = new MajorityElements();
        int[] nums = {1,5,6,6,6,6,6,3,2,3,3,4};

        System.out.println(mj.majorityElement(nums));
    }
}
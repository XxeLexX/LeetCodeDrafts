import java.util.ArrayList;
import java.util.List;

public class PhoneNumberCombinationsMain {
    public static void main(String[] args) throws Exception {
        PhoneNumberCombinations phone = new PhoneNumberCombinations();
        String input = "2";
        List<String> res = new ArrayList<>();
        res = phone.letterCombinations(input);
        System.out.println(res);
    }
}

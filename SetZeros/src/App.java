public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        int[][] input = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        solution.setZeroes(input);

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                System.out.print(input[i][j]);
            }
        }
    }
}

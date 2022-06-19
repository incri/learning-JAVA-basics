import java.util.Arrays;

public class Store {
    public static void array () {
        int[] oneD = new int [5];
        oneD [0] = 1;
        oneD [1] = 5;
        oneD [2] = 3;
        oneD [3] = 0;
        System.out.println(Arrays.toString(oneD));
    }
    public static void metrix() {
        int[][] twoD = new int [2][3];
        twoD [0][0] = 1;
        twoD [0][1] = 3;
        twoD [1][0] = 5;
        twoD [1][1] = 7;
        System.out.println(Arrays.deepToString(twoD));
    }
    public static void main(String[] args) {
        Store.array();
        Store.metrix();
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class hashMapPractice {
    public static void main(String[] args) {
//        System.out.println(kidsWithCandies(new int[]{4, 2, 1, 1, 2},1));
        int[] x = new int[]{4, 2, 9, 27, 1, 1, 2};
        System.out.println(solve(x));
        Arrays.sort(x);
        System.out.println(x[x.length - 2] % x[x.length - 1]);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int len = candies.length;
        List<Boolean> x = new ArrayList<>(len);

        for (int i = 0; i < len; i++) {
            int temp = candies[i] + extraCandies;
            boolean flag = true;
            for (int j = 0; j < len; j++) {
                if (temp < candies[j]) {
                    flag = false;
                    x.add(i, flag);
                    break;
                }
            }
            x.add(i, flag);

        }

        return x;


    }


    public static int solve(int[] A) {

        int max = 0;
        int i = 0;
        int j = 1;

        int k = 0;
        int l = 0;

        while (i < A.length) {
            if (i != j) {
                int newMax = A[j] == 0 ? 0 : A[i] % A[j];
                if (newMax > max || max == 0) {
                    max = newMax;
                    k = i;
                    l = j;
                }

            }
            j++;
            if (j == A.length) {
                j = 0;
                i++;
            }


        }
        return max;
    }


    public static boolean increasingSubset(int[] inp, int k) {
        int i = 0;
        int j = 1;
        int count = 1;


        while (i < inp.length) {
            if (inp[i] < inp[j]) {
                count++;
                i = j;
            }
            j++;
            if (count == k) {
                return true;
            }
            if (j >= inp.length) {
                j = i + 1;
            }
        }
        return false;
    }

}


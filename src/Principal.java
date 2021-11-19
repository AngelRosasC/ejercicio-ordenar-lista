import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        int[] nums = new int[]{
                1, 2, 8, 44, 9, 26, 3, 7, 33, 1, 93, 417, 19, 27, 14, 11, 30, 4
        };

        System.out.println(Arrays.toString(burbuja(nums)));
    }

    public static int[] burbuja(int[] nums) {
        int aux;
        for (int i = 2; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    aux = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = aux;
                }
            }
        }
        return nums;
    }
}

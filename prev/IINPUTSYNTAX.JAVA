import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input size
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        // Call the function (modify based on the problem)
        int result = majorityElement(nums);
        
        // Print the output
        System.out.println(result);
        
        sc.close();
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}

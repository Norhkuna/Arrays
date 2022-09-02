public class Example2
{
    public static void main(String[] args)
    {
        int[] nums = {6, -2, 5, 7, 36};
        int[] diffs = new int [nums.length-1];

        for (int i = 1; i < nums.length; i++)
        {
            diffs[i - 1] = nums[i] - nums[i - 1];
            System.out.println(diffs[i - 1]);
        }

    }
}

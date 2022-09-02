public class Example3
{
    public static void main(String[] args) {
        int[] arr = {4,1,-2,-5-8};
        boolean arithmetic = true;

        for (int i = 2; i < arr.length && arithmetic;  i++)
            if(arr [i-1]-arr[i-2] != arr[i]-arr[i-1])
                arithmetic = false;

        System.out.println(arithmetic);
    }
}

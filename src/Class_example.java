public class Class_example
{
    public static void main(String[] args)
    {
     double[] numbers = {6, 13, 63, 4, 2, 5};

     double smallest = numbers [0];

     for (double n : numbers)
     {
         if (n < smallest)
             smallest = n;
     }
        System.out.println(smallest);
    }
}

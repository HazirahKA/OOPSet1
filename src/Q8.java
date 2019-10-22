import java.util.*;

public class Q8 {
    public static void main(String[] args)
    {
        int[] number = new int[10];

        Scanner input = new Scanner(System.in);

        for(int i=0; i< number.length; i++)
        {
            System.out.print("Please enter an integer: ");
            number[i] = input.nextInt();
        }

        System.out.println("\n\nThe first value in the array is " + number[0] +
                "\nThe 5th number in the array is " + number[4]);
    }
}


package test.logics;

public class SecondHighestNumberInArray {
public static void main(String[] args)
    {
        int arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
        int largest = 0;
        int secondLargest = 0;
        System.out.println("The given array is:");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + "\t");
            // this is beta branch changes 
        }
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > largest)
            {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest)
            {
                secondLargest = arr[i];
            }
        }
        System.out.println("\nSecond largest number is:" + secondLargest);
        // here also beta branch changes pls note that
        System.out.println("Largest Number is: "  +largest);
    }
}

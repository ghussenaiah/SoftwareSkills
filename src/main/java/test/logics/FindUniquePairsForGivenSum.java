package test.logics;




import java.util.Arrays;

class FindUniquePairsForGivenSum
{
    // Function to find a pair in an array with a given sum using sorting
    public static void findPair(int[] arr, int s)
    {
       
        Arrays.sort(arr);
        int l = 0;
        int r = arr.length - 1;
 
        while (l < r)
        {
          
            if (arr[l] + arr[r] == s)
            {
                System.out.println("Pair found (" + arr[l] + "," +
                                arr[r] + ")");
                 l++; // or r--
            }
 
            if (arr[l] + arr[r] < s) {
                l++;
            }
            else if (arr[l] + arr[r] > s) {
                r--;
            }
        }

    }
 
    public static void main (String[] args)
    {
        int[] arr = { 8 ,7, 2, 5, 3, 1};
        int s = 10;
 
        findPair(arr, s);
    }
}
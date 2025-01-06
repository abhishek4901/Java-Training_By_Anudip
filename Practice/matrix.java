
import java.util.*;
class matrix { 
     public static void main(String args[])
{
    int matrix[][] = { { 1, 3, 5 },
                    { 7, 10 ,11},
                    { 12, 14, 16 } };
int arr[] [] = null;
int tem=0;
int n = arr.length;
    {
        // Loop for each
        for (int[] row : matrix)
            System.out.println(Arrays.toString(row));

    }
    for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
    int[] temp = arr[j];
    arr[j] = arr[j + 1];
    arr[j + 1] = temp;
    }
}
}
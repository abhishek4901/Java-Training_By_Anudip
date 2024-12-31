
public class LargestArr {
    public static void main(String[] args) {
        int arr[] = new int[] { 7, 9, 2, 4, 1,666 };
        int lagestno = arr[0];
        int smallestno = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > lagestno)
                lagestno = arr[i];

            else if (arr[i] < smallestno)
                smallestno = arr[i];
        }
        System.out.println("largest no of array:" + lagestno);
        System.out.println("smallest no of Array:" + smallestno);
    }
}
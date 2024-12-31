
public class maximumValue {

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 12, 4};
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
                
            }

        }
        System.out.println("the maximum value of array" + ans);
    }
}

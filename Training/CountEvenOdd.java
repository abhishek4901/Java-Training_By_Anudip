
public class CountEvenOdd {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,3,4,5,67,7,6,5,42,63,2};
        int n=arr.length;
        int odd=0,even=0;
        for(int i=0;i<n;i++){
            if((arr[i]%2)==0)
            even +=1;
            else
            odd+=1;
        }
        System.out.println("Total Even No is:"+ even);
        System.out.println("Total Odd No is:"+ odd);
    }
}
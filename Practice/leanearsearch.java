

public class leanearsearch {
    public static void main(String[] args) {
        int arr[] = {2,3,4,55,6,8};
        int x=55;//search this  element have in array in or not if have then print their index
        int ans=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                ans=i;
            
            }
            
        }
        if(ans==-1){
            System.out.println("not found");}
        else {
        System.out.println("found "+x+" at index" +ans);}
    }
}

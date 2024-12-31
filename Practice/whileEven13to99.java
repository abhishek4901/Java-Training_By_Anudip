
public class whileEven13to99 {
// find easy way
// 

    public static void main(String[] args) {
        int i = 13, sum = 0;
        while (i <= 99) { //i  ki value even se start kre to hme if condition nhu se krna hoga
            if (i % 2 == 0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println(sum);

    }

}

public class nestededloop {


    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.println(k);
                    //count++;
                    if (k == 2) {
                        break;
                    }
                }

            }
            count++;

        }
        System.out.println(count);
    }


}
   


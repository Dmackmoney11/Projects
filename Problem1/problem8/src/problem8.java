public class problem8 {
    public static void main(String[] args){
        for(int a = 1;a<6;a++){
            for(int c = 5-a;c>0;c--){
                System.out.print(" ");
            }
            for(int b = 0;b<a;b++)
            {
                if(b==a-1){
                    System.out.println(a);
                }
                else {
                    System.out.print(a);
                }
            }

        }
    }

}

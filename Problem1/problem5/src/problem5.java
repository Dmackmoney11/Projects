public class problem5 {
    public static void main(String[] args ){
        for(int a = 0;a<6;a++) {
            for(int c = 0;c<a;c++){
                if(c==a-1){
                    System.out.println("*");

                }
                else{
                    System.out.print("*");
                }
            }
        }

    }
}
public class problem3 {
    public static void main(String[] args){
        int[] StupidArray = new int[12];
        StupidArray[0] = 1;
        StupidArray[1] = 1;
        int notArray;
        for(int a = 0;a<12;a++){
            if(a>=2){
                notArray = StupidArray[a-1]+StupidArray[a-2];
                StupidArray[a] = notArray;

            }
            System.out.print(" "+StupidArray[a]);

        }
    }
}

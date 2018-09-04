public class Problem2 {
    public static void main(String[] args){


        int output = 1;
        int numToAdd = 3;
        for(int a = 0;a<10;a++)
        {
            System.out.print(output);
            System.out.print(" ");
            output = numToAdd + output;
            numToAdd = numToAdd + 2;


        }
}
}
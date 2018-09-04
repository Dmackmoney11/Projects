public class problem9 {
    public static void main(String[] args){
        String dash = "-";
        String Name = "_-^";
        String numbers = "1122334455667788990";
        String[] thing = new String[4];
        char[] car = new char[4];

        //Makes an array that stores the last characters of all the strings.

        car[0]= '-';
        car[1]= '-';
        car[2]= '0';
        car[3]= '-';

        //Makes an array that stores the four strings that needs to be printed.

        thing[0]= dash;
        thing[1]= Name;
        thing[2]= numbers;
        thing[3]= dash;

        // First for loop loops four times.
        //Each time it loops, the variable a increases by 1.

        for(int a = 0;a<4;a++){
            //Tell it how many times to print the string that we're on.

            for(int b =0;b<40/(thing[a].length()+1);b++){
                //Prints the string.
                System.out.print(thing[a]);

                //If the value isn't the last character on the line.
                if (!(b==40/(thing[a].length()+1)-1)) {
                    System.out.print(car[a]);
                }
            }

            //Prints the last character on a new line.
            System.out.println(car[a]);

        }
    }
}

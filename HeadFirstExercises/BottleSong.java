public class BottleSong{

    public static void main(String[] args){
        int initialBottle = 10;
        int increment = 0;

        String[] bottles = {"Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One"};

        while(initialBottle > 0){
            System.out.println(bottles[increment] + " green bottles sitting on the wall,");
            System.out.println(bottles[increment] + " green bottles sitting on the wall,");
            System.out.println("And if one green bottle should accidentally fall,");
            increment += 1;
            if(increment == 10){
                System.out.println("There'll be no green bottles sitting on the wall");
                break;
            }else{
                System.out.println("There'll be " + bottles[increment] + " green bottles sitting on the wall");
            }

            System.out.println("\n\n");


        }

    }
}

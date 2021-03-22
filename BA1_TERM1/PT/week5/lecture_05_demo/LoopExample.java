public class LoopExample {
    // int i = 0;
    public void run() {

        System.out.println("_____________________");
        System.out.println("REPEATING CODE IS BAD");
        System.out.println(10);
        System.out.println(9);
        System.out.println(8);
        System.out.println(7);
        System.out.println(6);
        System.out.println(5);
        System.out.println(4);
        System.out.println(3);
        System.out.println(2);
        System.out.println(1);

        System.out.println("Blastoff!");
        System.out.println("_____________________");
        System.out.println("WHILE LOOP");
        int counter = 10;
       
        while (counter > 0) 
        {
            System.out.println(counter);
            counter = counter - 1;
            counter--;
        }
        System.out.println("Blastoff!");

        System.out.println("_____________________");
        System.out.println("DO WHILE LOOP");
        counter = 10;
        do {
            System.out.println(counter);
            counter = counter - 1;
        } while (counter > 0);
        System.out.println("Blastoff!");

        System.out.println("_____________________");
        System.out.println("FOR LOOP");
        for(int i = 10; i > 0; i--){
            System.out.println(i);
        }
        System.out.println("Blastoff!");

        System.out.println("_____________________");
        System.out.println("BAD FOR LOOP");
        for(int i = 10; i > 0; i--)
        {
            System.out.println(i);
        }
        System.out.println("Blastoff!");

        System.out.println("_____________________");
        System.out.println("ANOTHER BAD LOOP");
        counter = 3;
        while(counter <=3){
            System.out.println(counter);
        }
        System.out.println("Blastoff!");
        /**
         * For Each Loop (Enhanced For Loop)
         * We will look at later in the semester
         */

    }
}
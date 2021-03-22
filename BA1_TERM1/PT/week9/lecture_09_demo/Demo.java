

public class Demo {

    public void run()
    {

        /** Option 1
        */
        String characterName = "Simba";
        String firstName = "Matthew";
        String lastName = "Broderick";
        // System.out.println(characterName + ":" + firstName + " " + lastName);

        /** Option 2 - Create an object
         */

        LKCharacter lkCharacter = new LKCharacter("Matthew", "Broderick", "Simba");
        // System.out.println(lkCharacter);

        /**
         * Option 3 - Object Oriented thinking
         */

        Actor matthewBroderick = new Actor("Matthew", "Broderick");
        // System.out.println(matthewBroderick);

        Lion simba = new Lion("Simba");
        // System.out.println("\n" + simba);

        Character simbaTheLionKing = new Character(simba, matthewBroderick);
        System.out.println("\n" + simbaTheLionKing);


        // Array is an object
        int[] firstRow = {1,2};
        int[] secondRow = {2,4,6,8,10,12};
        int[] thirdRow = {3,6,9,12,15,18};
        int[] fourthRow = {4,8,12,16,20,24};
        int[] fifthRow = {5,10,15,20,25,30};
        int[] sixthRow = {6,12,18,24,30,36};

        Lion[] lion = new Lion[3];
        lion[0] = simba;

        // Why can't I have an array that holds another array
        // I CAN!!!

        int[][] sixTimesTable = new int[6][6];
        sixTimesTable[0] = firstRow;
        sixTimesTable[1] = secondRow;
        sixTimesTable[2] = thirdRow;
        sixTimesTable[3] = fourthRow;
        sixTimesTable[4] = fifthRow;
        sixTimesTable[5] = sixthRow;

        for(int i = 0; i < sixTimesTable.length;i++){
            int[] temp = sixTimesTable[i];
            for(int j = 0; j < temp.length; j++){
                System.out.print(temp[j] + " ");
            }
            System.out.println();
        }

        String result = "";
        for(int i = 0; i < sixTimesTable.length;i++){
            int[] temp = sixTimesTable[i];
            for(int j = 0; j < temp.length; j++){
                result += String.format("%4d", temp[j]);
            }
            result += "\n";
        }

        result = "";
        System.out.println(result);
        int targetNumber = 6;
        System.out.println("Coordinates of the number: " + targetNumber);

        for(int i = 0; i < sixTimesTable.length;i++){
            int[] temp = sixTimesTable[i];
            for(int j = 0; j < temp.length; j++){
                if(temp[j] == targetNumber){
                    result += "(" + i + ", " + j + ")";
                    result += "\n";
                }
            }
        }

        System.out.println(result);



    }
    
}

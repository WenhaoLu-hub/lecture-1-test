import java.util.Random;

public class Characters {
    int iterations = 0;
    private Character[] characters;

    public Characters(){
        seedData();
    }

    private void seedData(){
        characters = new Character[5];
        
        Actor matthewBroderick = new Actor("Matthew", "Broderick");
        Lion simba = new Lion("Simba", 3);
        characters[0] = new Character(simba, matthewBroderick);

        Actor jamesJones = new Actor("James", "Earl Jones");
        Lion mufasa = new Lion("Mufasa", 8);
        characters[1] = new Character(mufasa, jamesJones);

        Actor jeremyIrons = new Actor("Jeremy", "Irons");
        Lion scar = new Lion("Scar", 7);
        characters[2] = new Character(scar, jeremyIrons);

        Actor moiraKelly = new Actor("Moira", "Kelly");
        Lion nala = new Lion("Nala", 3);
        characters[3] = new Character(nala, moiraKelly);

        Actor madgeSinclair = new Actor("Madge", "Sinclair");
        Lion sarabi = new Lion("Sarabi", 8);
        characters[4] = new Character(sarabi, madgeSinclair);
    }

    /**
     * Sequential Search
     * ALGORITHM
     * STEP 1:  ASSUME character does not exist
     * STEP 2:  START at begginning of collection
     * STEP 3:  IF character equals first character
     *              return true
     * STEP 4:  MOVE to next character
     * STEP 5:  REPEAT 3 - 4 UNTIL end of collection
     * STEP 6:  RETURN false
     * 
     * NOTE: What if you have a collection of 10 million 
     * items and the one you are looking for is the last
     * one?          
     */
    public int search(Character character){
        int count = 0;
        // STEP 2:  START at begginning of collection
        // STEP 5:  REPEAT UNTIL end of collection
        for(int i=0; i < characters.length; i++){
            if(characters[i].equals(character)){
                // STEP 3:  IF character equals first character
                //          return true
                return i;
            }
            count++;
            // STEP 4:  MOVE to next character
        }

        // STEP 1:  ASSUME character does not exist
        // STEP 6:  RETURN false
        return -1;
    }

    /**
     * Sequential Search
     * ALGORITHM
     * STEP 1:  ASSUME character does not exist
     *          AND ASSUME collection is sorted.
     * STEP 2:  START at middle of collection
     * STEP 3:  IF character equals first character
     *              return index
     * STEP 4:  ELSE IF character is smaller than target
     *              MOVE to mid point to end of collection
     *          ELSE character is greater than target
     *              MOVE to mid point to start of collection
     * STEP 5:  GOTO STEP 3
     * STEP 6:  RETURN -1
     * 
     * NOTE: What if you have a collection of 10 million 
     * items and the one you are looking for is the last
     * one?          
     */
    public int binarySearch(Character target) {
        int count = 0;
        int low = 0;
        int high = characters.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;                 // step 1
            int comp = characters[mid].compareTo(target);
    
            if (comp == 0) {                            // step 2
                return mid;
            } else if (comp < 0) {                      // step 3
                low = mid + 1;
            } else {                                    // step 4
                high = mid - 1;
            }
            count++;
        }
        return -1;
    }

    /**
     * ALGORITHM
     * Assumption: The array is already sorted
     * STEP 1: ITERATE over collection of character
     * STEP 2: SET current character to the character in the middle
     * STEP 3: COMPARE current character to target character.
     *           STEP 3a: IF found set index to index of current character
     *           STEP 3b: If current character is prior to target character
     *                    SET start postion to midpoint  +1
     *           STEP 3c: If current character is after the target character
     *                    SET end postion to midpoint  -1
     * STEP 4: RETURN index
     * @param target
     * @return
     */
    public int binarySearchWithSort(Character target) {
        int index = -1;
        selectionSort();
        iterations = 0;
        int startPosition = 0;
        int endPosition = characters.length - 1;
        // STEP 1: ITERATE over collection of characters
        while (startPosition <= endPosition) {
            iterations++;
            // STEP 2: SET current character to the character in the middle
            int mid = (startPosition + endPosition) / 2;
            Character character = characters[mid];

            // STEP 3: COMPARE current character to target character.
            int relativePosition = character.compareTo(target);

            // STEP 3a: IF found set index to index of current character
            if (relativePosition == 0) { 
                System.out.print(iterations + " Iterations to find character: ");
                return mid;
            } // STEP 3b: If current character is prior to target character
            else if (relativePosition < 0) { 
                // SET start postion to midpoint  +1
                startPosition = mid + 1;
            } else { // STEP 3c: If current character is after the target character
                // SET end postion to midpoint  -1
                endPosition = mid - 1;
            }
        }
        return index;
    }

    public void shuffle() {
        for(int i = 0; i < characters.length;i++) {
            int num1 = randomInt(0, characters.length -1);
            int num2 = randomInt(0, characters.length -1);
            swapCharacters(num1, num2);
            // choose a random number between i and length - 1
            // swap the ith character and the randomly-chosen character
        }
        System.out.println();
    }

    private int randomInt(int low, int high) {
        Random random = new Random();
        int result = random.nextInt(high-low) + low;
        return result;
    }
    
    private void swapCharacters(int i, int j) {
        Character temp = characters[i];
        characters[i] = characters[j];
        characters[j] = temp;
    }

    public void selectionSort() {
        for(int i = 0; i < characters.length;i++) {
            // find the lowest character at or to the right of i
            int index = indexLowest(i, characters.length - 1);

            // swap the ith character and the lowest character found
            swapCharacters(i, index);
        }
    }

    /**
     * ALGORITHM
     * Given a start position in an array, return the index 
     * of the smallest item in the array.
     * 
     * STEP 1: SET index of smallest item as the start position in the array
     * STEP 2: SET index of next item as the second item from the start position
     * STEP 3: ITERATE over collection
     *            MOVE to next item
     *            COMPARE nextItem with the smallest item
     *                If nextItem is less than the smallest item
     *                   SET index of smallest item to index of next item
     *          END ITERATION
     * STEP 3: RETURN index of smallest item
     * @param low - start position in the array
     * @param high - size of the array
     * @return index of the smallest item in the array.
     */
    private int indexLowest(int low, int high) {
        int indexOfSmallest = low;
        int startPos = low;
        int endPos = high - 1;
        for (int indexNextItem = startPos + 1; indexNextItem <= endPos; indexNextItem++) {
            if (characters[indexNextItem].compareTo(characters[indexOfSmallest]) < 0) {
                indexOfSmallest = indexNextItem;//searching for lowest index  
            }
        }
        return indexOfSmallest;
    }

    public int recursiveBinarySearch(Character target, int low, int high) {
        
        if (high < low) {
            System.out.print(iterations + " Iterations to find character: ");
            return -1;
        }
        int mid = (low + high) / 2; // step 1
        int comp = characters[mid].compareTo(target);

        if (comp == 0) { // step 2
            System.out.print(iterations + " Iterations to find character: ");
            return mid;
        } else if (comp < 0) { // step 3
            iterations++;
            return recursiveBinarySearch(target, mid + 1, high);
        } else { // step 4
            iterations++;
            return recursiveBinarySearch(target, low, mid - 1);
        }
    }
}
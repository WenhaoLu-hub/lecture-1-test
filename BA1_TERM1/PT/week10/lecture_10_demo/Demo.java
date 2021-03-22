

public class Demo {

    public void run() {

       

        Actor matthewBroderick1 = new Actor("Matthew", "Broderick");
        Lion simba1 = new Lion("Simba", 3);
        Character character1 = new Character(simba1, matthewBroderick1);

        Actor matthewBroderick2 = new Actor("Matthew", "Broderick");
        Lion simba2 = new Lion("Simba", 3);
        Character character2 = new Character(simba2, matthewBroderick2);

        System.out.println(character1.equals(character1));

        System.out.println(character1.equals(character2));

        Actor jeremyIrons = new Actor("Jeremy", "Irons");
        Lion scar = new Lion("Scar", 7);
        Character character3 = new Character(scar, jeremyIrons);

        Characters lionKingCharacters = new Characters();

        System.out.println(lionKingCharacters.search(character1));
        System.out.println(lionKingCharacters.search(character2));
        System.out.println(lionKingCharacters.search(character3));
        
/**
         * Shuffle
         */
        lionKingCharacters.shuffle();
        System.out.println();
        
        lionKingCharacters.selectionSort();
        System.out.println();
        
        /**
         * NOTE: You should comment out the calls to so that only the binarySearch
         * OR the binarySearchWithSort are called to test.
         * They are not designed to both be called and therefore you may get an 
         * infinite loop.
         */
        System.out.println(lionKingCharacters.binarySearch(character1));
        System.out.println(lionKingCharacters.binarySearch(character2));
        System.out.println(lionKingCharacters.binarySearch(character3));

        System.out.println(lionKingCharacters.search(character1));
        System.out.println(lionKingCharacters.binarySearchWithSort(character1));

        System.out.println(lionKingCharacters.search(character2));
        System.out.println(lionKingCharacters.binarySearchWithSort(character2));
        
        System.out.println(lionKingCharacters.search(character3));
        System.out.println(lionKingCharacters.binarySearchWithSort(character3));
      
      
        
    }
}

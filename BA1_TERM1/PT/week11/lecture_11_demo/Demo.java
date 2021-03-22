

public class Demo {

    public void run() {

        Actor matthewBroderick1 = new Actor("Matthew", "Broderick");
        Lion simba = new Lion("Simba", 3);
        Character character1 = new Character(simba, matthewBroderick1);

        Actor whoopiGoldberg = new Actor("Whoopi", "Goldberg");
        Hyena shenzi = new Hyena("Shenzi", 5);
        Character character2 = new Character(shenzi, whoopiGoldberg);

        System.out.println(character1);
        System.out.println(character2);
    }
}

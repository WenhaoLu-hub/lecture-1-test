public class Character {

    /** IMPORTANT:
     * Objects can have references to other objects
     */ 
    private Animal animal;
    private Actor actor;

    public Character(Animal animal, Actor actor){
        this.animal = animal;
        this.actor = actor;
    }

    public String toString(){
        String result = "\n_________________________\nCHARACTER DETAILS\n";
        result += animal.toString();
        result += "\n" + actor.toString();
        return result;
    }

    public boolean equals(Character that){
        boolean result = false;
        if(animal.equals(that.animal) && actor.equals(that.actor))
        {
            result = true;
        }
        return result;
    }

    public int compareTo(Character that) {
        if (this.animal.getAge() < that.animal.getAge()) {
            return -1;
        }
        if (this.animal.getAge() > that.animal.getAge()) {
            return 1;
        }
        return 0;
    }
}

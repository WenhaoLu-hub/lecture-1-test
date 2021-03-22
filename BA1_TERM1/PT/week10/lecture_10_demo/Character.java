public class Character {

    /** IMPORTANT:
     * Objects can have references to other objects
     */ 
    private Lion lion;
    private Actor actor;

    public Character(Lion lion, Actor actor){
        this.lion = lion;
        this.actor = actor;
    }

    public String toString(){
        String result = "CHARACTER DETAILS\n";
        result += lion.toString();
        result += "\n" + actor.toString();
        return result;
    }

    public boolean equals(Character that){
        boolean result = false;
        if(lion.equals(that.lion) && actor.equals(that.actor))
        {
            result = true;
        }
        return result;
    }

    public int compareTo(Character that) {
        if (this.lion.getAge() < that.lion.getAge()) {
            return -1;
        }
        if (this.lion.getAge() > that.lion.getAge()) {
            return 1;
        }
        return 0;
    }
}

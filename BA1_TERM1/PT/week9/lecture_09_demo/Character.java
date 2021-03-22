public class Character {

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
    
}

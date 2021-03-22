public class LKCharacter 
{
    // Instance variables
    // Objects not primitives.
    private String actorFirstName;
    private String actorLastName;
    private String characterName;

    public LKCharacter(String actorFirstName, String actorLastName, 
                            String characterName)
    {
        this.actorFirstName = actorFirstName;
        this.actorLastName = actorLastName;
        this.characterName = characterName;
    }

    public String toString(){
        String result = "";
        result += "ROLE";
        result += String.format("%n%-20s%s", "Name:", characterName);
        result += "\n\nACTOR";
        result += String.format("%n%-20s%s%n%-20s%s", "First Name:", actorFirstName, "Last Name:", actorLastName);
        return result;
    }

    
}

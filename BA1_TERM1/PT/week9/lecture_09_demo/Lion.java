public class Lion 
{
    private String name;

    public Lion(String name){
        this.name = name;
    }

    public String toString(){
        String result = "ROLE";
        result += String.format("%n%-20s%s", "Name:", name);
        return result;
    }

    
}

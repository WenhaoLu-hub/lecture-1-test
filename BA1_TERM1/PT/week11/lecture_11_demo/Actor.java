public class Actor {
  
    private String firstName;
    private String lastName;

    public Actor(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString(){
        String result = "\nVOICE ACTOR";
        result += String.format("%n%-20s%s%n%-20s%s", "First Name:", firstName, "Last Name:", lastName);
        return result;
    }

    public boolean equals(Actor that) {
        return this.firstName.equals(that.firstName)
            && this.lastName.equals(that.lastName);
    }
}

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        String result = "ROLE";
        result += String.format("%n%-20s%-20s", "Name:" , name, "Age:", age);
        return result;
    }

    public boolean equals(Animal that) {
        return this.name.equals(that.name)
            && this.age == that.age;
    }

    public int compareTo(Animal that){
        if(this.age < that.age){
            return -1;
        }
        if(this.age > that.age){
            return 1;
        }
        return 0;
    }
}

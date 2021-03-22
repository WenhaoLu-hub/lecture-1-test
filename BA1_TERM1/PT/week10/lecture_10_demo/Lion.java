public class Lion {
    private String name;
    private int age;

    public Lion(String name, int age){
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
        result += String.format("%n%-20s%n%-20s", "Name:" , name, "Age:", age);
        return result;
    }

    public boolean equals(Lion that) {
        return this.name.equals(that.name)
            && this.age == that.age;
    }

    public int compareTo(Lion that){
        /** Two approaches
         * Multiple returns or a single return?
         */
        
        if(this.age < that.age){
            return -1;
        }
        if(this.age > that.age){
            return 1;
        }
        return 0;

        // int result = 0;
        // if(this.age < that.age){
        //     result = -1;
        // }
        // if(this.age > that.age){
        //     result = 1;
        // }
        // return result;
    }
}

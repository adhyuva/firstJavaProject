public class Person{
    String name;
    String about;
    String species;
    int age;

    public Person(String name, String about, String species, int age){
        this.name = name;
        this.about = about;
        this.species = species;
        this.age = age;
    }

    public void info(){
        System.out.println(name + " is the " + about + ".");
    }

    public void speciesType(){
        System.out.println("This species is a " + species);
    }

    public void ageFinder(){
        if(age < 13){
            System.out.println("Young one");
        } else if(age < 18){
            System.out.println("Teenager");
        } else if(age < 30){
            System.out.println("In your 20's");
        } else if(age < 40){
            System.out.println("In your 30's");
        } else if (age < 60){
            System.out.println("Middle aged");
        } else {
            System.out.println("Old person");
        }
    }



}
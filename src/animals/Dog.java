package animals;

public class Dog {
    private String name;
    private String size;
    private int age;
    private String breed;
//this assigns attributes to the class? (parameters required?)
    public Dog(String name, String size, int age, String breed) {
        this.name = name;
        this.size = size;
        this.age = age;
        this.breed = breed;

    }

    private String bark(String size) {
        String bark = "";
        if (size.equalsIgnoreCase("small")) {
            bark = "Yap yap yap";
        } else if (size.equalsIgnoreCase("medium")) {
            bark = "woof woof woof";
        } else if(size.equalsIgnoreCase("large")){
            bark = "WOOF WOOF";
        }
        return bark;
    }

    private String play(String breed){
        String playing = "";
        if(breed.equalsIgnoreCase("poodle")){
            playing = "flap flap";
        }
        else if (breed.equalsIgnoreCase("Labrador")){
            playing = "Yeah Yeah, Throw stick";
        }
        else if (breed.equalsIgnoreCase("border collie")){
            playing = "Round up the sheep, round up the sheep!";
        }
        return playing;
    }
    private String beHuman(String name, int age, String breed){
        return "Hello human, I'm" + name + " and I am a " + age + " year old " + breed + ", What breed are you?";
    }

}

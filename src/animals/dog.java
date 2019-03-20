package animals;

public class dog {
    private String name;
    private String size;
    private int age;
    private String breed;

    public dog(String name, String size, int age, String breed) {
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
        } else {
            bark = "WOOF WOOF";
        }
        return bark;
    }

}

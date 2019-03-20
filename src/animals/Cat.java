package animals;

public class Cat {
    private String breed;
    private byte numberOfPaws;
    private boolean female;
    private String size;

    public Cat(String breed, byte numberOfPaws, boolean female) {
        this.breed = breed;
        this.numberOfPaws = numberOfPaws;
        this.female = female;
    }

    private String catCall(String breed) {
        String catCall = "";
        if (breed.equalsIgnoreCase("Tabby")) {
            catCall = "meow =_=";
        } else if (breed.equalsIgnoreCase("Egyptian Mao")) {
            catCall = "Miaoo ^.^ ";
        } else if (breed.equalsIgnoreCase("Scottish Fold")) {
            catCall = "meww meww =^-^=";
        }
        return catCall;
    }

    private String prowlAbility(byte numberOfPaws) {
        switch (numberOfPaws) {
            case 0:
                System.out.println("By cat did you mean potato");
                break;
            case 1:
                System.out.println("A hi-five cat!");
                break;
            case 2:
                System.out.println("A Hot-wheels cat, now we're rolling!");
            case 3:
                System.out.println("Still can run");
            case 4:
                System.out.println("Happy Nappy catty");
            default:
                System.out.println("we've never seen a paw power prowler like this before!?");
                break;

        }

    }

    private boolean isPregnant(boolean female) {
        if (female == true) {
            System.out.println("Your cat can get pregnant!");
        } else {
            System.out.println("Your cat is \"Tomcat\"");
        }
    }

    private String isDangerous(String size) {
        String isDangerous = "";
        if (size.equalsIgnoreCase("small")) {
            isDangerous = "nyao";
        } else (size.equalsIgnoreCase("large")) {
            isDangerous = "RAWR!!!";
        }
        return isDangerous;

    }
}


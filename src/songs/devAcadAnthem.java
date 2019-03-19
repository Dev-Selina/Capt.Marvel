//package songs;
//
//import java.util.Scanner;
//
//public class devAcadAnthem {
//    //All methods belong in a class
//    // ...main (Defines the construct in here)
//    public static void main(String[] args) {
//        //Need to create an instance, where a REFERENCE VARIABLE is used - which
//        //If no defined construct is provided then a default construct is given, that does nothing.
//        //Below is declaring a variable "singing" to identify & is an accessor
//        //where devAcadAnthem is the "data type"
//        // "=" assignment
//                devAcadAnthem singing = new devAcadAnthem();
//        singing.sing();
//    }
//
//    private void sing() {
//        Scanner songScanner = new Scanner(System.in);
//        System.out.println("How many chilly students are in the room?");
//        int students = songScanner.nextInt();
//
//        String word = "chilly students";
//        //can increment or decrement
//        for (int i = students; i > 0; i--) {
//            System.out.println(i);
//            System.out.println(i + " " + word + " in the room.");
//            System.out.println(i + " " + word + " in the room.");
//            System.out.println(" \"Grab their hands. ");
//            System.out.println("And dance them around.");
//            if (i == 1) {
//                System.out.println("Only one warm Dean in the room.");
//            } else {
//                int newNum = i - 1;
//                if (newNum == 1) {
//                    word = "chilly student";
//                }
//                System.out.println(newNum + " " + word + " in the room.");
//                System.out.println();
//            }
//
//        }
//
//    }
//}

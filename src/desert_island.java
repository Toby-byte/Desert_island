import java.util.Scanner;

public class desert_island {
// metode til at printe en given array
    public static void printArray(int[] a) {
        System.out.print("{" + a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(", " + a[i]);
        }
        System.out.println("}");
    }
// returnere index af det største tal i den givne array
    public static int greatestNumber(int[] testArray) {
        // highestNumber, starter på 0
        int highestNumber = 0;
        int indexOfNumber = 0;
        for (int i = 0; i < testArray.length; i++) {
            // highestNumber, bliver givet ny værdi hvis den er højere end den nuværende
            if (highestNumber < testArray[i]) {
                highestNumber = testArray[i];
                // tager index-tallet af highestNumber
                indexOfNumber = i;
            }
        }
        return indexOfNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ObejctsToChoseFrom[] = {"Pet","Coffeemaker","Computer","Food","Girl/Boyfriend","Netflix","Beer","Book","Candy","Guitar"};

        System.out.println("Of these, would you like to have with you on a deserted island?");
        // printer valg der kan vælges i mellem
        System.out.println("1 "+ObejctsToChoseFrom[0]);
        System.out.println("2 "+ObejctsToChoseFrom[1]);
        System.out.println("3 "+ObejctsToChoseFrom[2]);
        System.out.println("4 "+ObejctsToChoseFrom[3]);
        System.out.println("5 "+ObejctsToChoseFrom[4]);
        System.out.println("6 "+ObejctsToChoseFrom[5]);
        System.out.println("7 "+ObejctsToChoseFrom[6]);
        System.out.println("8 "+ObejctsToChoseFrom[7]);
        System.out.println("9 "+ObejctsToChoseFrom[8]);
        System.out.println("10 "+ObejctsToChoseFrom[9]);
// laver userAnswers array
        int[] userAnswers = {0,0,0,0,0,0,0,0,0,0};
        // tager bruger input og lægger det til det korrekte index
        for (int i = 1; i <= 10; i++) {

            System.out.println("\nplease choose a number");

            int getUserAnswer = scanner.nextInt()-1;

            userAnswers[getUserAnswer] = userAnswers[getUserAnswer]+1;
            System.out.println(ObejctsToChoseFrom[getUserAnswer]);
        }
        printArray(userAnswers);
        // fortæller bruger hvilket valg der er det mest populære
        System.out.println("the most popular choice is "+ObejctsToChoseFrom[greatestNumber(userAnswers)]);
    }
}

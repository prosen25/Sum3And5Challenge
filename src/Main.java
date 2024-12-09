//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int counter = 0;
        int sum = 0;
        for (int number = 1; number <= 1000; number++) {

            if ((number % 3 == 0) && (number % 5 == 0)) {
                sum += number;
                counter++;
                System.out.println("Found a match: " + number);

                if (counter == 5) {
                    break;
                }
            }
        }

        System.out.println("Sum of first five number divisible by both 3 and 5 is " + sum);
    }
}
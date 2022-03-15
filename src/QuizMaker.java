import java.util.*;

public class QuizMaker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int startChpts = 0;
        int endChpts = 0;
        int qs = -1;

        System.out.println("Please enter in the first number of chapter:");
        startChpts = input.nextInt();

        System.out.println("Please enter last chapter");
        endChpts = input.nextInt();

        int[] numQs = new int[endChpts - startChpts + 1];
        for (int i = 0; i < numQs.length; i++) {
            System.out.println("Enter number of questions in chapter " + (i + startChpts) + ":");
            numQs[i] = input.nextInt();
        }
        System.out.println("Enter a number of questions:");
        qs = input.nextInt();

        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());
        int chpt = 0;
        int prob = 0;

        boolean loop = true;
        String in = "";
        while(loop) {
            for (int i = 0; i < qs; i++) {
                chpt = (rand.nextInt(endChpts - startChpts + 1)) + startChpts;
                prob = (rand.nextInt(numQs[(chpt - startChpts)])) + 1;
                System.out.println((i + 1) + ". Chapter: " + chpt + " Problem: " + prob);
            }
            System.out.println("Generate another? (y) Type anything to quit.");
            if (input.next().equals("y"))
                continue;
            else
                loop = false;
        }

    }
}

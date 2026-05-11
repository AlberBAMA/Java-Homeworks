public class DiceGameHomework {
    public static void main(String[] args) {

        final int MAX_ROLLS = 10;
        int computerW = 0;
        int userW = 0;

        // Creating two die instances
        Die computerDie = new Die(6);
        Die userDie = new Die(6);
        System.out.println("The game start until the round 10!");
        System.out.println("---------------------------------------------------");

        // Cycle that repeats 10 times
        for (int i = 1; i <= MAX_ROLLS; i++) {
            // Roll both dies
            computerDie.roll();
            userDie.roll();
            //Save both dies value
            int compValue = computerDie.getValue();
            int userValue = userDie.getValue();

            System.out.print("Round " + i + " = Computer: " + compValue + " | User: " + userValue);

            // Conditions to determine the winner
            if (compValue > userValue) {
                computerW++;
                System.out.println(" == The computer wins");
            } else if (userValue > compValue) {
                userW++;
                System.out.println(" == The user wins");
            } else {
                System.out.println(" == Draw");
            }
        }

        // Show final score
        System.out.println("\n-----------------------------------------------------");
        System.out.println("Final score - Computer: " + computerW + " | User: " + userW);

        // Conditions to determine who is the winner
        if (computerW > userW) {
            System.out.println("The computer is the winner!");
        } else if (userW > computerW) {
            System.out.println("The user is the winner!");
        } else {
            System.out.println("It is a draw");
        }
    }}

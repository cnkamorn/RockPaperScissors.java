import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

        String startGame = scan.nextLine();
       
  
        if (startGame.equals("yes")) {
            System.out.println("Great");
            System.out.println("rock - paper - scissors, shoot!");
            String userChose = scan.nextLine();
        //            computerChoice();
            String computerChose = computerChoice();
            String Result = checkWin(userChose, computerChose);
            printResult(userChose,computerChose,Result);
            //comeputer chose :
            //Whowin?
        } else {
            System.out.println("Darn, some other time.");
            System.exit(0);
        }     

            scan.close();
    }

        public static String computerChoice() {
            double randomNumber = (int) (Math.random() * 3);
            String result_com; 
            if (randomNumber == 0) {
                result_com = "rock";
            } else if (randomNumber == 1) {
                result_com = "paper";
            } else {
                result_com = "scissors";
            };
            return result_com;
    }



        public static String checkWin (String userChoice, String computerChoice) {
             String result = "";
             if (userChoice.equals("rock") && computerChoice.equals("scissors") || 
             (userChoice.equals("paper") && computerChoice.equals("rock")) || 
             (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                result = "You Win!";
             } 
             else if (userChoice.equals("scissors") && computerChoice.equals("rock") || 
             (userChoice.equals("paper") && computerChoice.equals("scissors")) || 
             (userChoice.equals("rock") && computerChoice.equals("paper"))) {
                result = "You lose";
             } 
             else if (userChoice.equals(computerChoice)) {
                result = "Draw!";
             }
             else {
                result = "Invalid choice";
                System.exit(0);
             }
             return result;

            
        }
    

     public static void printResult (String userChose, String computerChose, String Result) {
        System.out.println("You chose " + userChose);
        System.out.println("Computer chose " + computerChose);
        System.out.println(Result);
     }
 
    
}

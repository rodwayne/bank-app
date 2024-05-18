import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "Tony Stark";
        String accountType = "standard";
        double availableBalance = 1599.99;
        int option = 0;

        System.out.println("********************");
        System.out.println("Client name: " + name);
        System.out.println("Account type: " + accountType);
        System.out.println("Available balance: $" + availableBalance);
        System.out.println("********************");

        String menu = """
                *** Enter a number to select an option ***
                1. Consult balance
                2. Withdraw
                3. Deposit
                9. Exit
                """;

        Scanner userInput = new Scanner(System.in);

        while (option != 9) {
            System.out.println(menu);
            option = userInput.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Current balance: $" + availableBalance);
                    break;
                case 2:
                    System.out.println("How much do you wish to withdraw?");
                    double withdraw = userInput.nextDouble();

                    if (availableBalance > withdraw) {
                        availableBalance -= withdraw;
                        System.out.println("Your new balance is $" + availableBalance);
                    } else {
                        System.out.println("You don't have enough funds to withdraw that quantity");
                    }
                    break;
                case 3:
                    System.out.println("How much do you wish to deposit?");
                    double deposit = userInput.nextDouble();
                    availableBalance += deposit;
                    System.out.println("Your new balance is $" + availableBalance);
                    break;
                case 9:
                    System.out.println("Thanks for using our services!");
                    break;
                default:
                    System.out.println("Not valid option. Please, enter a valid option from the menu shown above");
                    break;
            }
        }
    }
}

import vendingmachine.VendingMachine;
import java.util.ArrayList;
import vendingmachine.Snack;
import vendingmachine.Drink;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.setName("My Interesting Machine");
        vendingMachine.setMoney(1000);
        vendingMachine.setDrinkList(new ArrayList<>());

        vendingMachine.setSnacksList(new ArrayList<>());
        Snack hershey = new Snack();
        hershey.setName("Hershey's Chocolate Bar");
        hershey.setPrice(3.00);
        hershey.setQuantity(5);


        Drink pepsi = new Drink();
        pepsi.setName("Pepsi");
        pepsi.setPrice(1.50);
        pepsi.setQuantity(10);

        Drink fanta = new Drink();
        fanta.setName("Fanta");
        fanta.setPrice(2.00);
        fanta.setQuantity(20);

        Snack lays = new Snack();
        lays.setName("Lays Original Chips");
        lays.setPrice(3.50);
        lays.setQuantity(15);

        Snack cookie = new Snack();
        cookie.setName("Chips Ahoy Original Chocolate Chip Cookies");
        cookie.setPrice(2.00);
        cookie.setQuantity(10);

        vendingMachine.getDrinkList().add(pepsi);
        vendingMachine.getSnacksList().add(hershey);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("What would you like to buy?");
            System.out.println("1. Hershey");
            System.out.println("2. Pepsi");
            System.out.println("3. Fanta");
            System.out.println("4. Lays");
            System.out.println("5. Chips Ahoy");
            int managerPin = 909088292;
            int choice = scanner.nextInt();
            if(choice == 1) {
                System.out.println("The number of Hershey left is " + hershey.getQuantity());
                int quantity = hershey.getQuantity();
                if(quantity <= 0) {
                    System.out.println("Sorry! We're out of Hershey!");
                } else {
                    System.out.println("You chose Hershey. Delicious Option!");
                    vendingMachine.setMoney(vendingMachine.getMoney() + hershey.getPrice());
                    hershey.setQuantity(quantity-1);
                }

            } else if(choice == 2) {
                System.out.println("The number of Pepsi left is " + pepsi.getQuantity());
                int quantity = pepsi.getQuantity();
                if(quantity <= 0) {
                    System.out.println("Sorry! We're out of Pepsi!");
                }  else {
                    System.out.println("You chose Pepsi. Poppy Option!");
                    vendingMachine.setMoney(vendingMachine.getMoney() + pepsi.getPrice());
                    pepsi.setQuantity(quantity-1);
                }

            } else if(choice == 3) {
                System.out.println("The number of Fanta left is " + fanta.getQuantity());
                int quantity = fanta.getQuantity();
                if(quantity <= 0) {
                    System.out.println("Sorry! We're out of Fanta!");
                }  else {
                    System.out.println("You chose Fanta. Fantastical!");
                    vendingMachine.setMoney(vendingMachine.getMoney() + fanta.getPrice());
                    fanta.setQuantity(quantity-1);
                }
            } else if(choice == 4) {
                System.out.println("The number of Lays left is " + lays.getQuantity());
                int quantity = lays.getQuantity();
                if(quantity <= 0) {
                    System.out.println("Sorry! We're out of Lays!");
                } else {
                    System.out.println("You chose Lays. How original!");
                    vendingMachine.setMoney(vendingMachine.getMoney() + lays.getPrice());
                    lays.setQuantity(quantity-1);
                }
            } else if(choice == 5) {
                System.out.println("The number of Chips Ahoy left is " + cookie.getQuantity());
                int quantity = cookie.getQuantity();
                if(quantity <= 0) {
                    System.out.println("Sorry! We're out of Chips Ahoy!");
                } else {
                    System.out.println("You chose Chips Ahoy. Sweet Choice!");
                    vendingMachine.setMoney(vendingMachine.getMoney() + cookie.getPrice());
                    cookie.setQuantity(quantity-1);
                }
                else if(choice == managerPin) {
                    String password = "Iamthebest";
                    System.out.println("Manager mode activated");
                    System.out.println("Please enter the password");

                    String checkPw = scanner.nextLine();
                    if(checkPw.equals(password)) {
                        System.out.println("Manager authenticated successfully");

                    } else {
                        System.out.println("Incorrect password. Are you sure you're the manager?");
                    }
                }
            } else {
                System.out.println("I couldn't understand. Please try again.");
            }
            System.out.println("The amount of money in the machine is " + vendingMachine.getMoney());
        }

    }

    }

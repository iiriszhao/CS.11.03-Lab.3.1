import java.util.Scanner;
public class TextBasedGame {
    static int playerHealth = 10;
    static String playerName = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Hogwarts Trial! I will be giving you a tour around our majestic campus, during which, obstacles have been placed to test your level of intelligence.");
        System.out.println("\nEnter your name:");
        playerName = scanner.nextLine();
        System.out.println("Hi " + playerName + " you will begin with a total of 10 points.");
        System.out.println("+1 point if: you answer any question asked correctly.");
        System.out.println("-2 points if: you answer any question incorrectly.");
        System.out.println("-3 points if: you encounter a portkey at any stage of your tour.");
        System.out.println("\nIn order to successfully pass the Hogwarts Trial, you must complete this adventure with a resulting 8 or more points.");
        System.out.println("Any player who fails to do so will be marked as failed.");
        System.out.println("Have fun and good luck!");
        beginning();
    }
    public static void beginning() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please select one of the following options!");
        System.out.println("\n-- Main Menu --\n");
        System.out.println("1. Explore");
        System.out.println("2. Quiz");
        System.out.println("Enter your choice:");
        int choice = scn.nextInt();

        while (choice<0) {
            try {
                choice = Integer.parseInt(scn.nextLine());
            }
            catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }

        if (choice == 1) {
            explore();
        } else if (choice == 2) {
            System.out.println("Welcome to the Hogwarts quiz, you'll be tested on your knowledge and understanding across a variety of disciplines including but not limiting to: Potions, History of Magic, Charms and Defense Against the Dark Arts.");
            quiz1();
        }
    }
     public static void explore() {
        Scanner scanner1 = new Scanner(System.in);
         System.out.println("I'll start off by showing you around the towers of each house. Where would you like to venture to first?");

         while (playerHealth > 0) {
            System.out.println("\n-- Basic Menu --\n");
            System.out.println("1. Gryffindor Tower");
            System.out.println("2. Ravenclaw Tower");
            System.out.println("3. Slytherin Common Room");
            System.out.println("4. Hufflepuff Common Room");
            System.out.println("Enter your choice:");
            int choice1 = scanner1.nextInt();

            if (choice1 == 1) {
                gryffindorTower();
            } else if (choice1 == 2) {
                ravenclawTower();
            } else if (choice1 == 3) {
                slytherinCommon();
            } else if (choice1 == 4) {
                hufflepuffCommon();
            }
        }

    }
    public static void gryffindorTower() {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("We have reached the Portrait of the Fat Lady, every Hogwarts common room has their unique password. Which is the right one for Gryffindor? This is your one and only chance to get it right!");
        System.out.println("\n1. Caput Draconis");
        System.out.println("2. GryffindorHouse");
        System.out.println("Enter your choice:");
        int choice2 = scanner2.nextInt();

        if (choice2 == 1) {
            System.out.println("Bingo! You may enter.");
            System.out.println("Where would you like to go next?");
            System.out.println("\n-- Menu --\n");
            System.out.println("1. Harry and Ron's room");
            System.out.println("2. Hermione's room");
            System.out.println("Enter your choice:");
            choice2 = scanner2.nextInt();
            playerHealth = playerHealth +1;

            if (choice2 == 1) {
                invisibilityCloak();
            } else if (choice2 == 2) {
                invisibilityCloak();
            }
        } else if(choice2 == 2) {
            System.out.println("Uh oh, you've used up your chances, looks like the Gryffindor spirit just isn't in your heart...");
            System.out.println("You will be redirected to the Menu page.");
            playerHealth = playerHealth -2;
            beginning();
        }
    }
    public static void slytherinCommon() {
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("You've reached the Slytherin Dungeon. Looks like we need a password to enter, what do you think it is? You only have one chance!");
        System.out.println("\n1. SlytherinHouse");
        System.out.println("2. Pure-blood");
        System.out.println("Enter your choice:");
        int choice4 = scanner4.nextInt();

        if (choice4 == 2) {
            System.out.println("Bingo! You must be a family of true pure bloods yourself.");
            System.out.println("Choose where you would like to go next:");
            System.out.println("\n-- Menu --\n");
            System.out.println("1. Visit Draco Malfoy's dorm");
            System.out.println("2. Head over to Professor Snape's potions room");
            System.out.println("Enter your choice:");
            choice4 = scanner4.nextInt();
            playerHealth = playerHealth +1;

            if (choice4 == 1) {
                malfoysDorm();
            } else if (choice4 == 2) {
                potionsRoom();
            }
        } else if (choice4 == 1) {
            System.out.println("Uh oh, you've used up your chances, looks like the Slytherin spirit just isn't in your heart...");
            System.out.println("You will be redirected to the Menu page.");
            playerHealth = playerHealth -2;
            beginning();
        }
    }
    public static void ravenclawTower() {
        Scanner scanner11 = new Scanner(System.in);
        System.out.println("You've reached the Ravenclaw Tower. Since the key virtues of Ravenclaw are intelligience, learning, and wisdom, you will be teleported to take the Hogwarts quiz!");
        System.out.println("\n-- teleporting --\n");
        System.out.println("Welcome to the Hogwarts quiz, you'll be tested on your knowledge and understanding across a variety of disciplines including but not limiting to: Potions, History of Magic, Charms and Defense Against the Dark Arts.");
        quiz1();
    }
    public static void hufflepuffCommon() {
        Scanner scanner12 = new Scanner(System.in);
        System.out.println("Welcome to the Hufflepuff Common Room! What do you think the entry password for Hufflepuff is?");
        System.out.println("\n1. HufflepuffCommon");
        System.out.println("2. no password.");
        System.out.println("Enter your choice:");
        int choice12 = scanner12.nextInt();

        if (choice12 == 1) {
          System.out.println("Nope, Hufflepuff house doesn't have a password! You have been teleported to the Hogwarts Quiz room!");
          System.out.println("\n-- teleporting --\n");
          System.out.println("Welcome to the Hogwarts quiz, you'll be tested on your knowledge and understanding across a variety of disciplines including but not limiting to: Potions, History of Magic, Charms and Defense Against the Dark Arts.");
          quiz1();
        } else if (choice12 == 2) {
            System.out.print("Bingo! You may enter. You see a suspicious-looking notebook lying on the floor. Do you want to pick it up?");
            System.out.print("\n1. Yes!");
            System.out.println("2. No, I'm okay");
            choice12 = scanner12.nextInt();

            if (choice12 == 1) {
                System.out.println("Oh no, turns out it was a portkey! You have been teleported to Professor Snape's potions room.");
                playerHealth = playerHealth -3;
                potionsRoom();
            } else if (choice12 == 2) {
                System.out.println("Oh no, a portkey suddenly falls on your head. You have been teleported to the Hogwarts Quiz room!");
                quiz1();
            }
        }

    }
    public static void invisibilityCloak() {
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("You've entered the dorm. You see the cloak of invisibility lying on the floor. Do you want to take a look?");
        System.out.println("\n1. Yes!");
        System.out.println("2. No, I'm okay.");
        int choice3 = scanner3.nextInt();

        if (choice3 == 1) {
            System.out.println("Oh no, looks like this is actually a portkey! You've been teleported to the Slytherin common room!");
            playerHealth = playerHealth - 3;
            slytherinCommon();
        } else if (choice3 == 2) {
            System.out.println("No problem, let's move to the Slytherin common room then!");
            slytherinCommon();
        }
    }
    public static void malfoysDorm() {
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("You have entered Draco's dorm, you notice a weird looking notebook lying on the floor. Will you pick it up?");
        System.out.println("\n1. Yes!");
        System.out.println("2. No I'm okay");
        int choice5 = scanner5.nextInt();

        if (choice5 == 1) {
            System.out.println("Turns out it was a portkey! You have been teleported to Professor Snape's potions room.");
            playerHealth = playerHealth -3;
            potionsRoom();
        } else if (choice5 == 2) {
            System.out.println("No problem, let's head over to Professor Snape's potions room then!");
            potionsRoom();
        }
    }
    public static void potionsRoom() {
        Scanner scanner6 = new Scanner(System.in);
        System.out.println("Once you arrive, suddenly - Professor Snape appears out of no where. He says  sternly, 'I do not tolerate students entering my office without permission. Your punishment for doing so is to go take the Hogwarts Quiz, now leave.'");
        System.out.println("\nOops. Did not see that coming, well now looks like you have to take the quiz...");
        System.out.println("Welcome to the Hogwarts quiz, you'll be tested on your knowledge and understanding across a variety of disciplines including but not limiting to: Potions, History of Magic, Charms and Defense Against the Dark Arts.");
        quiz1();

    }
    public static void quiz1() {
        int quizPoints = 0;
        Scanner scanner7 = new Scanner(System.in);
        System.out.println("\nQuestion 1: What is the Polyjuice potion?\n");
        System.out.println("1. a love potion");
        System.out.println("2. a potion that allows the taker to assume the physical appearance of another person");
        System.out.println("3. a sleeping draught");
        System.out.println("Enter your choice:");
        int choice7 = scanner7.nextInt();

        if (choice7 == 2) {
            System.out.println("Bingo! You may move on to the next question");
            playerHealth = playerHealth + 1;
            quiz2();
        } else if (choice7 == 1 || choice7 == 3) {
            System.out.println("Uh oh that's incorrect, -1 point!");
            System.out.println("The correct answer was Number 2");
            playerHealth = playerHealth -2;
            quiz2();
        }
    }
    public static void quiz2() {
       Scanner scanner8 = new Scanner(System.in);
       System.out.println("\nQuestion 2: What is the last name of the headmaster of Hogwarts? (capitalization is important!)\n");
       System.out.println("Enter your answer:");
       String choice8 = scanner8.nextLine();

       if (choice8.equals("Dumbeldore")) {
           System.out.println("Awesome! You may move on to the next question");
           quiz3();
       } else {
           System.out.println("Uh oh that's incorrect, -1 point!");
           playerHealth = playerHealth -1;
           System.out.println("The correct answer was 'Dumbeldore'");
           quiz3();
       }

    }
    public static void quiz3() {
        Scanner scanner9 = new Scanner(System.in);
        System.out.println("\nQuestion 3: Select all unforgivable curses. Note: this is more than one correct answer.\n");
        System.out.println("1. Imperius Curse");
        System.out.println("2. Cruciatus Curse");
        System.out.println("3. Killing Curse");
        System.out.println("Enter your choice:");
        String choice9 = scanner9.nextLine();

        if (choice9.equals("1, 2, 3") || choice9.equals("all 3") || choice9.equals("all three") || choice9.equals("all correct")) {
            System.out.println("Bingo! You may move on to the next question!");
            playerHealth = playerHealth + 1;
            quiz4();
        } else {
            System.out.println("Uh oh, you weren't able to select ALL correct answers, -1 point!");
            System.out.println("ALL were correct!");
            playerHealth = playerHealth -2;
            quiz4();
        }
    }
    public static void quiz4() {
        Scanner scanner10 = new Scanner(System.in);
        System.out.println("\nQuestion 4: What is 7x-2=19?");
        System.out.println("Type your answer here:");
        int choice10 = scanner10.nextInt();

        if (choice10  == 3) {
            System.out.println("Bingo! Congrats on finishing the quiz. Here are your results:");
            playerHealth = playerHealth +1;
            results();
        } else {
            System.out.println("Uh oh that's incorrect, -1 point!");
            playerHealth = playerHealth -2;
            System.out.println("The correct answer is 3!");
            System.out.println("\nNevertheless, congrats on finishing the quiz! Here are you results:");
            results();
        }
    }
    public static void results() {
        System.out.println("\nYour overall score: " + playerHealth);

        if (playerHealth >= 8) {
            System.out.println("Congrats, you have passed the Hogwarts Trial!");
        } else if(playerHealth < 10 && playerHealth > 0) {
            System.out.println("\nUnfortunately, you have not met the requirements of 10+ points. This signifies a fail :(");
            System.out.println("Thank you for completing the Hogwarts Trial, please come back for more!");

        } else if(playerHealth < 0) {
            System.out.println("\nUnfortunately, you have not met the requirements of 10+ points. This signifies a fail :(");
            System.out.println("Thank you for completing the Hogwarts Trial, please come back for more!");
        }
    }

}

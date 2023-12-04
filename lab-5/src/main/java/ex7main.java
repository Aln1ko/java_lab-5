import java.util.Scanner;

/*
Побудувати програму для роботи з класом Час. Програма повинна забезпечувати функції
збільшення/зменшення на 1 годину, хвилину, секунду, введення/виведення значень.
 */
public class ex7main {
    public static void main(String[] args) {
        ex7 time = new ex7();
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("1 Enter time");
            System.out.println("2 Change time");
            System.out.println("3 Show time");
            System.out.println("4 Exit");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("4")) {
                System.out.print("Quiting the program\n");
                break;
            }

            if(input.equalsIgnoreCase("1")) {
                while (true) {

                    System.out.println("Enter time");
                    input = scanner.nextLine();

                    String[] words = input.split(" ");
                    if (words.length != 3) {
                        System.out.println("Invalid input.Try again");
                        continue;
                    }
                    int hour;
                    int minute;
                    int second;

                    try {
                        hour = Integer.parseInt(words[0]);
                        minute = Integer.parseInt(words[1]);
                        second = Integer.parseInt(words[2]);
                    } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                        System.out.println("Invalid input format. Please try again.");
                        continue;
                    }

                    if (hour < 0 || hour > 23) {
                        System.out.println("Only 24 hours in day. Choose numbmer beetwen 0 and 23");
                        continue;
                    }
                    if (minute < 0 || minute > 59) {
                        System.out.println("Only 60 minutes in hour. Choose numbmer beetwen 0 and 59");
                        continue;
                    }
                    if (second < 0 || second > 59) {
                        System.out.println("Only 60 seconds in minute. Choose numbmer beetwen 0 and 59");
                        continue;
                    }

                    time.setTime(hour, minute, second);
                    time.displayTime();
                    break;
                }
            }

            else if(input.equalsIgnoreCase("2")){
                while(true){
                    System.out.println("1 Increase hour");
                    System.out.println("2 Decrease hour");
                    System.out.println("3 Increase minute");
                    System.out.println("4 Decrease minute");
                    System.out.println("5 Increase second");
                    System.out.println("6 Decrease second");

                    input = scanner.nextLine();
                    int choise;
                    try {
                         choise = Integer.parseInt(input);
                    } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                        System.out.println("Invalid input format. Please try again.");
                        continue;
                    }
                    if(choise<1||choise>6){
                        System.out.println("Invalid input format");
                        continue;
                    }

                    if(input.equalsIgnoreCase("1")){time.increaseHour(); time.displayTime();}
                    else if(input.equalsIgnoreCase("2")){time.decreaseHour();time.displayTime();}
                    else if(input.equalsIgnoreCase("3")){time.increaseMinute();time.displayTime();}
                    else if(input.equalsIgnoreCase("4")){time.decreaseMinute();time.displayTime();}
                    else if(input.equalsIgnoreCase("5")){time.increaseSecond();time.displayTime();}
                    else if(input.equalsIgnoreCase("6")){time.decreaseSecond();time.displayTime();}
                    break;
                }
            }

            else if(input.equalsIgnoreCase("3")){
                time.displayTime();
            }
            else{
                System.out.println("Incorrect input");
            }
        }
        scanner.close();
    }
}

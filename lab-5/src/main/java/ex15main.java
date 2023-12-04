import java.util.Scanner;

/*
Створити клас Лінія. Поля - координати початку і кінця.
Функції-члени обчислюють довжину лінії, переміщують її,
встановлюють і повертають значення полів.
 */
public class ex15main {
    public static void main(String[] args) {
        ex15 line = new ex15();
        ex15 userLine = null;
        Scanner scanner = new Scanner(System.in);
        String input;

        while(true){
            System.out.println("1 Create line");
            System.out.println("2 Move line");
            System.out.println("3 Length of line");
            System.out.println("4 Show coordinates");
            System.out.println("5 Quit");
            input = scanner.nextLine();

            try {
                int choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            if (input.equals("1")) {
                while (true) {
                    System.out.println("Enter start point coordinates (x y):");
                    String[] startCoords = scanner.nextLine().split(" ");
                    double startX ;
                    double startY;
                    try {
                         startX = Double.parseDouble(startCoords[0]);
                         startY = Double.parseDouble(startCoords[1]);
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a number.");
                        continue;
                    }

                    System.out.println("Enter end point coordinates (x y):");
                    String[] endCoords = scanner.nextLine().split(" ");
                    double endX ;
                    double endY ;
                    try {
                         endX = Double.parseDouble(endCoords[0]);
                         endY = Double.parseDouble(endCoords[1]);
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a number.");
                        continue;
                    }

                    userLine = new ex15(startX, startY, endX, endY);
                    System.out.println("Line created.");
                    break;
                }
            }

            else if (input.equals("2")) {
                if (userLine != null) {
                    while (true) {
                        System.out.println("Enter x and y offset for line movement:");
                        String[] moveCoords = scanner.nextLine().split(" ");
                        double xOffset ;
                        double yOffset;
                        try {
                             xOffset = Double.parseDouble(moveCoords[0]);
                             yOffset = Double.parseDouble(moveCoords[1]);
                        }catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please enter a number.");
                            continue;
                        }
                        userLine.moveLine(xOffset, yOffset);
                        System.out.println("Line moved.");
                        break;
                    }
                }
                else {
                    System.out.println("Line has not been created yet.");
                }
            }
            else if (input.equals("3")) {
                if (userLine != null) {
                    double length = userLine.calculateLength();
                    System.out.println("Length of line: " + length);
                }
                else {
                    System.out.println("Line has not been created yet.");
                }
            }
            else if(input.equals("4")) {
                if (userLine != null) {
                    double[] startPoint = userLine.getStartPoint();
                    double[] endPoint = userLine.getEndPoint();

                    String startPointStr = String.format("(%.2f, %.2f)", startPoint[0], startPoint[1]);
                    String endPointStr = String.format("(%.2f, %.2f)", endPoint[0], endPoint[1]);

                    System.out.println("Start point: " + startPointStr);
                    System.out.println("End point: " + endPointStr);
                }
                else {
                    System.out.println("Line has not been created yet.");
                }
            }
            else if (input.equals("5")) {
                System.out.println("Quitting the program.");
                break;
            }
            else{
                System.out.println("Invalid input");
                continue;
            }

        }
    }
}

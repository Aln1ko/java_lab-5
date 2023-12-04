import java.util.Scanner;

/*
Створити клас записної книжки (поля: ПІБ, мобільний телефон,
 адреса електронної пошти, юзернейм в Телеграм).
 */
public class ex17main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        ex17 contact = new ex17();

        while(true){
            System.out.println("1 Set info");
            System.out.println("2 Show info");
            System.out.println("3 Quit");
            input = scanner.nextLine();

            if (input.equals("1")){
                System.out.println("Enter name,phone,email,telegramUsername");
                input = scanner.nextLine();
                String [] words = input.split(" ");
                if(words.length<4){
                    System.out.println("Not enought arguments");
                }
                contact.setContact(words[0],words[1],words[2],words[3]);
            }
            else if(input.equals("2")){
                contact.displayContactInfo();
            }
            else if(input.equals("3")){
                System.out.println("Quiting the programm");
                break;
            }
            else{
                System.out.println("Invalid input");
                continue;
            }

        }
    }
}

import java.util.Scanner;

//importando classes. java.util é um pacote e scanner é a classe pra pedir user input

public class Scaneando {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine(); //read the user input
        System.out.println("Username is: " + userName);

    }
}


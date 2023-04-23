// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

//Enum são constantes publicas, estaticas e final - nao pode ser overridden
//usa-se pra constantes que estamos acostumados: dias, meses, cores, planetas etc
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
enum CoresPrimarias {
    azul,
    amarelo,
    vermelho
}

public class Main {
    int x = 5;
    String fname = "Luke";
    String lname = "Skywalker";

    static void myStaticMethod() {
        System.out.println("I'm static");
    }

    public void myPublicMethod() {
        System.out.println("You successfully created the object");
    }

    public static void main(String[] args) {

        //creating an obj
        Main myObj1 = new Main(),
                myObj2 = new Main();

        System.out.println(myObj1.x + " " + myObj2.x);

        //os atributos de uma classe são as suas variáveis
        myObj2.x = 37;

        System.out.println(myObj1.x + " " + myObj2.x);
        System.out.println("Name: " + myObj1.fname + " " + myObj2.lname);
        System.out.println("Age: " + myObj2.x); //37 pq eu fiz override

        //static methods are called without the need of an object
        myStaticMethod(); //chamei o metodo e executou

        //public methods need an obj declaration

        Main objPublicMethod = new Main();
        objPublicMethod.myPublicMethod(); //criei o obj pra chamar o método

        //vale a pena lembrar que o . é usado pra acessar os atributos e métodos dos objs


        //testando get and set com a class Person

        Person myObj = new Person();
        myObj.setName("John"); // Set the value of the name variable to "John"
        System.out.println(myObj.getName());

        //testando a classe abstrata e sua subclasse
        Tristana myTris = new Tristana();
        myTris.ultimate();
        myTris.championUltimate();

      //chamar o enum

        CoresPrimarias myColour = CoresPrimarias.amarelo;

        switch(myColour) {
            case azul:
                System.out.println("a cor é AZUL");
                break;
            case amarelo:
                System.out.println("a cor é AMARELO");
                break;
            case vermelho:
                System.out.println("a cor é VERMELHO");
                break;
        }

        //para datas usamos o import de java.time
        LocalDate myDate = LocalDate.now(); //criamos um objeto date
        System.out.println(myDate); //yyyy-mm-dd

        //array e array list; O array built-in nao pode ser modificado. então criamos um array list
        ArrayList<String> leagueChampions = new ArrayList<String>();
        leagueChampions.add("Talon");
        leagueChampions.add("Tristana");
        leagueChampions.add("Brand");
        leagueChampions.add("Bard");
        leagueChampions.add("Neeko");
        leagueChampions.add("Kaisa");
        leagueChampions.add("Teemo");
        System.out.println(leagueChampions);

        leagueChampions.set(5,"Kai'Sa");
        System.out.println(leagueChampions);

        for(int i = 0; i<leagueChampions.size(); i++) {
            System.out.println(leagueChampions.get(i));
        }

        System.out.println();
        //listar alfabeticamente? no problem
        Collections.sort(leagueChampions);
        for (String i: leagueChampions) {
            System.out.println(i);
        }

        //ao inves de criar arraylist a gente pode criar LinkedList
        //Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.
        //LinkedList usa containers que chamam os proximos containers

    }
}








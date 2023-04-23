public class Main2 {
    int releaseDate;
    String championName;

    public Main2(int year, String name) {
        releaseDate = year;
        championName = name;
    }

    public static void main(String[] args) {
        Main2 myLeagueChampion = new Main2(2009, "Tristana");
        System.out.println("O meu champion favorito é: "
                + myLeagueChampion.championName +
                "\ne sua release date é: " + myLeagueChampion.releaseDate);
    }

}



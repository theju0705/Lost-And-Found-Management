package connection;

public class MainApp {

    public static void main(String[] args) {

        AddLostItem.addLostItem("Wallet", "Accessories", "2026-01-20", "Library");
        AddFoundItem.addFoundItem("Wallet", "Accessories", "2026-01-21", "Library");

        MatchItem.findMatches();
    }
}

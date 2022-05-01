public class Main {
    public static void main(String[] args) {
        Fighter tysonFury = new Fighter("Tyson", 10, 80, 112, 60);
        Fighter mikeTyson = new Fighter("Mike", 14, 70, 100, 55);
        Ring londonArea = new Ring(tysonFury, mikeTyson, 80, 120);

        londonArea.run();
    }
}

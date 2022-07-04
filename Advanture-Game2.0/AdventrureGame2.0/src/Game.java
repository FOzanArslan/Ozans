import java.util.Scanner;

public class Game {
    Scanner input = new Scanner(System.in);
    public void start(){

        System.out.println("Welcome to the Adventure Game");
        System.out.print("Please enter a name : ");
        String playerName = input.next();
        Player player = new Player(playerName);
        System.out.println("Dear "+player.getName()+ " welcome");
        player.selectChar();

        while (true){
            if(player.isPassCave() && player.isPassForest() && player.isPassRiver() && player.isPassMine()){
                System.out.println("=====================================");
                System.out.println("You win the game Congratulations!!!");
                System.out.println("=====================================");
                System.exit(0);
            }
            player.playerStats();
            Location location = null;
            System.out.println("# Areas : ");
            System.out.println("0 - Quit  - > End the game ");
            System.out.println("1 - Safehouse - > This is a safehouse, your health will be fulled.");
            System.out.println("2 - Store - > You can buy new items");
            System.out.println("3 - Cave - > Level 1 fight area (Zombie)");
            System.out.println("4 - Forest - > Level 2 fight area (Vampire)");
            System.out.println("5 - River - > Level 3 fight area (Bear)");
            System.out.println("6 - Mine - > Level 4 fight area (Snake)");
            System.out.println("Please enter the are you want to go : ");
            int selectLoc = input.nextInt();
            switch (selectLoc){
                case 0 :
                    location = null;
                    break;
                case 1 :
                    location = new Safehouse(player);
                    break;
                case 2 :
                    location = new ToolStore(player);
                    break;
                case 3:
                    if(player.isPassCave()){
                        System.out.println("You passed cave section");
                        location = new Safehouse(player);
                    }
                    else{
                    location = new Cave(player);}
                    break;
                case 4:
                    if(player.isPassForest()){
                        System.out.println("You passed forest section");
                        location = new Safehouse(player);
                    }else{
                    location = new Forest(player);
                    }
                    break;
                case 5:
                    if (player.isPassRiver()){
                        System.out.println("You passed River section");
                        location = new Safehouse(player);
                    }else {
                        location = new River(player);
                    }
                    break;
                case 6:
                    if (player.isPassMine()) {
                        System.out.println("You passed Mine section");
                        location = new Safehouse(player);

                    }else {
                        location = new Mine(player);
                    }
                default:
                    System.out.println("Please enter a valid area");
            }
            if (location == null){
                System.out.println("Loser.");
                break;
            }
            if(!location.onLocation()){
                System.out.println("GAME OVER !!!");
                break;
            }
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;
public class battleship{
    static String start;
    static Ship hit_ship;
    static Pin current_pin;
    static Scanner input = new Scanner(System.in);
    static stringtoArray str = new stringtoArray();
    static createGame game = new createGame();
    static pinBoard pb1 = new pinBoard(null, null);
    static pinBoard pb2 = new pinBoard(null, null);
    static ArrayList<Ship> ships_player1 = new ArrayList<>();
    static ArrayList<Pin> pins_player1 = new ArrayList<>();
    static ArrayList<Ship> ships_player2 = new ArrayList<>();
    static ArrayList<Pin> pins_player2 = new ArrayList<>();
    public static void main(String[] args) {

        boolean p1 = false;
        boolean p2 = false;
        boolean construct = true;
        System.out.println("The game is on !!!");
        System.out.println("PLAYER 1");
        ships_player1 = game.CreateShips();
        System.out.println("PLAYER 2");
        ships_player2 = game.CreateShips();
        Board b1 = new Board(ships_player1);
        Board b2 = new Board(ships_player2);

        while (!(b1.GameOver() || b2.GameOver())){
            System.out.println("Player 1 ");
            if (p1){
                pb1.constructPinBoard(ships_player2);
            }
            System.out.print("Player 1 , fire when ready: ");
            start = input.nextLine();
            current_pin = new Pin(str.convert(start));
            pins_player1.add(current_pin);
            hit_ship = b2.fire(current_pin);
            if (!(hit_ship == null)){
                b2.isSunk(hit_ship);
            }
            System.out.print("Player 1  your turn is over ! ");
            if (p2){
                pb2.constructPinBoard(ships_player1);
            }
            System.out.print("Player 2 , fire when ready: ");
            start = input.nextLine();
            current_pin = new Pin(str.convert(start));
            pins_player2.add(current_pin);
            hit_ship = b1.fire(current_pin);
            if (!(hit_ship == null)){
                b1.isSunk(hit_ship);
            }
           

            if (construct){
                pb1 = new pinBoard(b2,pins_player1);
                pb2 = new pinBoard(b1, pins_player2);
                p1 = true;
                p2 = true;
                construct = false;
            }
        }
        if (b1.GameOver()){
            System.out.println("Player 2 won !!!");
        }else{
            System.out.println("Player 1 won !!!");
        }

    }
}
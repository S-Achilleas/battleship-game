import java.util.ArrayList;
import java.util.Scanner;
public class createGame{
    Scanner input = new Scanner(System.in);
    GameBoard brd = new GameBoard();
    stringtoArray str = new stringtoArray();
    String start;
    String end;
    public ArrayList<Ship> CreateShips(){
        ArrayList<Ship> ships = new ArrayList<>();
        Board b = new Board(ships);
        System.out.println("Remeber that all the coordinates must be given in a form such as this 2,3  ");
        System.out.println("Available Ships:");
        System.out.println("1. Carrier     - Size: 5 cells");
        System.out.println("2. Battleship  - Size: 4 cells");
        System.out.println("3. Cruiser     - Size: 3 cells");
        System.out.println("4. Submarine   - Size: 3 cells");
        System.out.println("5. Destroyer   - Size: 2 cells");
        brd.displayBoard();
        System.out.print("Enter the starting coordinates of your Carrier : ");
        start = input.nextLine();
        System.out.print("Enter the ending coordinates of your Carrier, remember the carrier must occupy exactly 5 spots! : ");
        end = input.nextLine();
        Ship s1 = new Ship(str.convert(start),str.convert(end),5);
        ships.add(s1);
        b.constructBoard();
        System.out.print("Enter the starting coordinates of your battleship : ");
        start = input.nextLine();
        System.out.print("Enter the ending coordinates of your battleship, remember the battleship must occupy exactly 4 spots! : ");
        end = input.nextLine();
        Ship s2 = new Ship(str.convert(start),str.convert(end),4);
        ships.add(s2);
        b.constructBoard();
        System.out.print("Enter the starting coordinates of your cruiser : ");
        start = input.nextLine();
        System.out.print("Enter the ending coordinates of your cruiser, remember the cruiser must occupy exactly 3 spots! : ");
        end = input.nextLine();
        Ship s3 = new Ship(str.convert(start),str.convert(end),3);
        ships.add(s3);
        b.constructBoard();
        System.out.print("Enter the starting coordinates of your submarine : ");
        start = input.nextLine();
        System.out.print("Enter the ending coordinates of your submarine, remember the submarine must occupy exactly 3 spots! : ");
        end = input.nextLine();
        Ship s4 = new Ship(str.convert(start),str.convert(end),3);
        ships.add(s4);
        b.constructBoard();
        System.out.print("Enter the starting coordinates of your destoryer : ");
        start = input.nextLine();
        System.out.print("Enter the ending coordinates of your destroyer, remember the destroyer must occupy exactly 3 spots! : ");
        end = input.nextLine();
        Ship s5 = new Ship(str.convert(start),str.convert(end),2);
        ships.add(s5);
        b.constructBoard();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        return ships;
    }
}
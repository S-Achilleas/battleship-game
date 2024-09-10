import java.util.ArrayList;

public class pinBoard{
    Board b1;
    ArrayList<Pin> pins = new ArrayList<>();
    String[][] pinB = new String[10][10];
    pinBoard(Board b1,ArrayList<Pin> pins){
        this.b1 = b1;
        this.pins = pins;
    }
    public void constructPinBoard(ArrayList<Ship> listofShips){
        String output = "initialized";
        boolean temp;
        int line = 1;
        int column = 1;
        int [] position = new int[2];
        while (line <= 8){
            position[0] = line;
            column = 1;
            position[1] = column;
            System.out.print("\n");
            while (column <=8){
                temp = false;
                position[1] = column;
                for (Pin p : pins){
                    if (p.getX() == position[0] && p.getY() == position[1]){
                        for (Ship s : listofShips){
                            if (b1.checkPosition(s, p.getPosition())){
                                output = " X ";
                                temp = true;
                                break;
                            }
                            output = " L ";
                            temp = true;
                        }
                    }
                    if(temp){
                        break;
                    }
                    output = " . ";
                }
                System.out.print(output);
                column++;
            }
            line++;
        }
        System.out.println("\n");
    }

}
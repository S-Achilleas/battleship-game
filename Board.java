import java.util.ArrayList;
public class Board{
    ArrayList<Ship> list_ofShips = new ArrayList<>();
    int [] position;
    Board(ArrayList<Ship>list_ofShips ){
        this.list_ofShips = list_ofShips;
        
    }
    public boolean checkPosition(Ship ship ,int[] position){
        if (ship.getStart(0) == ship.getEnd(0)){
            if (position[0] == ship.getStart(0)){
                if (position[1] >= ship.getStart(1) && position[1] <=ship.getEnd(1)){
                    return true;
                }
            }
        }
        else{
            if (position[1] == ship.getStart(1)){
                if (position[0] >= ship.getStart(0) && position[0] <=ship.getEnd(0)){
                    return true;
                }
            }
        }
        return false;
    }
    public void constructBoard(){
        String output = "initialized";
        position = new int[2];
        int line = 1;
        int column = 1;
        while (line <= 8){
            position[0] = line;
            column = 1;
            System.out.print("\n");
            while (column <=8){
                position[1] = column;
                for (Ship s : this.list_ofShips){
                    if (this.checkPosition(s, position)){
                        output = " & ";
                        break;
                    }
                    else{
                        output = " - ";
                    }

                }
                System.out.print(output);
                column++;
            }
            line++;
        }
        System.out.println("\n");
    }
    public Ship fire(Pin p){
        Ship sunk = null ;
        for (Ship s : this.list_ofShips ){
            if (this.checkPosition(s, p.getPosition())){
                System.out.println("You nailed it !");
                s.length = s.length - 1;
                sunk = s;
            }
        }
        return sunk;
    }
    public boolean isSunk(Ship s){
        if (s.length == 0){
            list_ofShips.remove(s);
            System.out.println("Ship is sunk!!!");
            return true;
        }
        return false;
    }

    public boolean GameOver(){
        if (this.list_ofShips.isEmpty()){
            return true;
        }
        return false;  
    }
}

public class Ship{
    int [] start = new int[2];
    int [] end = new int[2];
    int length;
    Ship(int[] start , int[] end , int length){
        if (start[0] > end[0] || start[1] > end[1] ){
            throw new IllegalArgumentException("The beginning of the ship can not be after the end of the ship! Try again");
        }
        else if (!(start[0] == end[0] || start[1] == end[1])){
            throw new IllegalArgumentException("Invalid input, try again");
        }
        else{
            this.start = start;
            this.end = end;
            this.length = length;
        }
    }
    public int  getStart(int x){
        return this.start[x];
    }
    public int  getEnd(int x){
        return this.end[x];
    }
    public String toString(){
        return "The ship starts at: " + end.toString() + " and it ends at: " + start.toString();
    }


}
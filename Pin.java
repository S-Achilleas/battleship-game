public class Pin{
    int [] position = new int[2];
    Pin(int [] position){
        this.position = position;
    }
    public int [] getPosition(){
        return this.position;
    }
    public int getX(){
        return this.position[0];
    }
    public int getY(){
        return this.position[1];
    }
}
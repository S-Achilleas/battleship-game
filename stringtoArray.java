public class stringtoArray{
    public int [] convert(String s){
        int [] output = new int[2];
        String [] array = s.split(",",2);
        output[0] = Integer.parseInt(array[0]);
        output[1] = Integer.parseInt(array[1]);
        return output;
    }
}
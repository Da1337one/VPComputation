/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vpcomputations;

/**
 *
 * @author Bruce
 */
public class Coordinate {
    

    public final int  x, y;  
    public final int width, height;
 
    public Coordinate (int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width; //size
        this.height = height; //size     
    }
 
    @Override
    public String toString(){
        return x + "," + y + "," + width + "," + height;
    }

    public static Coordinate fromString( String s ) throws Exception{
    
        if (s == null){
            throw new Exception("The coordinate string is null");
        }
        
        String[] sArr = s.split( "_" );
        int[] integers = new int[4];
        if (sArr.length == 4){
            for (int i = 0; i < 4; i++){
                try{
                    integers[i] = Integer.parseInt(sArr[i]);
                }
                catch (java.lang.NumberFormatException e){
                    throw new Exception("Could not parse coordinate from string \""+
                                 s+"\", because \""+sArr[i]+"\" is not an integer.", e);
                }
            }
            
            int x       = integers[0];
            int y       = integers[1];
            int width   = integers[2];
            int height  = integers[3];
            
            return new Coordinate( x, y, width, height );
        }
        else{
            throw new Exception("Could not parse coordinate from string \""+
                                 s+"\", because it has "+sArr.length+
                                " part(s). Ecpecting 4" );
        }
    }   
}
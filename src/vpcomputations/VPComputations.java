/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vpcomputations;

/**
 *
 * @author Ben
 */
public class VPComputations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
//        Coordinate coord = new Coordinate();
//        coord.setCoordinate( "0_1_2_3" );
//        System.out.println( coord.toString() );
        
        Coordinate coord;
        
        coord = Coordinate.fromString( "1_2_3_4" );
        System.out.println( coord.toString() );
    }
    
}

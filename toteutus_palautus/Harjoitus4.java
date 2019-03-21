/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harjoitus4;

import java.util.ArrayList;
/**
 *
 * @author eero.savukoski
 */
public class Harjoitus4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> tekstit = new ArrayList<>();
        tekstit.add("Yeet");
        tekstit.add("Skrt");
        tekstit.add("Boi");
        System.out.println(tekstit.get(0) + tekstit.get(1) + tekstit.get(2));
        String test = tekstit.get(1); //2 = Skrt
        tekstit.remove(1); //2 =  " "
        System.out.println(tekstit.get(1));
        String test3 = tekstit.get(1); //3 = Boi
        int test2 = test3.length(); // = 3
        String test4 = test3.substring(0,test2);
        test4 = test4.concat(test4);
        tekstit.add(1, test4);
        String leet = tekstit.get(1);
        System.out.println(leet.toUpperCase());
    }
    
}

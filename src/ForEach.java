
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class ForEach {
    public static void main(String args[]) {
        ArrayList<String> myList = new ArrayList();
        myList.add("Hallo Peter");
        myList.add("Hallo Hans");
        myList.add("Hallo Klaus");
        myList.add("Hallo Andreas");
        
        for(String name : myList) {
            System.out.println(name);
        }
    }
    
}

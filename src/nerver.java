/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class nerver { // Dauerschleife
    
    static String nerver(int x){
        System.out.println("der eine steckt dem anderen seinen riemen in den po und" +x);
        System.out.println(x>=1 ? nerver(x-1):"am ende freuen sich alle");
        return "";
    }
    public static void main (String args[]){
    nerver(100);
    }
}

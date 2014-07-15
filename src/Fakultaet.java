/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Fakultaet {
static int fac(int x){
return x==0 ? 1 : x * fac(x-1);
}
public static void main(String[] args){
System.out.println("fac(4) = "+fac(4));
}
}
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class CountDown {
static String countDown(int i){
System.out.println("Tach"+i);
System.out.print(i==0?"":countDown(i-1));
 return "";
 }
 public static void main(String[] args){
 countDown(10);
}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package name.panitz.ludens.animationGame;

/**
 *
 * @author ASUS
 */
public class StackTest {
    public static void main(String [] args){
System.out.println(count1(0));
System.out.println(count2(0));
}
public static int count1(int k){
intj=2;
for (int i= 0;i<1000000000;i=i+1){
j=j+1;
 }
 return j;
}


public static int count2(int i){
if (i<1000) return count2(i+1) +1; else return 2;
}
}
    

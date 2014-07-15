/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package name.panitz.ludens.animationGame;
import name.panitz.ludens.animationGame.Vertex;
public class Cast{
public static String asString(Object o){
return (String) o;
}
public static void main(String args[]){
String s1 = asString("Guten Tag");
String s2 = asString(new Vertex(136543,4));
} 
}
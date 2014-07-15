/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
package name.panitz.ludens.animationGame;
public class ProjektGruppenarbeit1 {
    public double x;
    public double y;
    public ProjektGruppenarbeit1(double xx,double yy){
        x=xx;
        y=yy;
    }
    
    public static void main(String args[]){
        ProjektGruppenarbeit1 v1 = new ProjektGruppenarbeit1(0,0);
        ProjektGruppenarbeit1 v2 = new ProjektGruppenarbeit1(0,0);
        ProjektGruppenarbeit1 vv = new ProjektGruppenarbeit1(0,0);
                System.out.println("v1.x = "+v1.x);
                System.out.println("v2.y = "+v2.y);
                System.out.println("v1.y = "+v1.y);
                v1.y= 2*v1.y;
                System.out.println("v1.y = "+v1.y);
                System.out.println(v1);
                
    }
   
    public String toString(){return "("+x+","+y+")";}
    public double length(){ return Math.sqrt(x*x+y*y);}
    public ProjektGruppenarbeit1 skalarMult(double s){return new ProjektGruppenarbeit1(x*s,y*s);}
    public void skalarMultMod(double s){
    x=s*x;
    y=s*y;        
    }
    public ProjektGruppenarbeit1 add(ProjektGruppenarbeit1 v2){return new ProjektGruppenarbeit1(x+v2.x,y+v2.y);}
    public void addMod(ProjektGruppenarbeit1 v2){
        x=x+v2.x;
        y=y+v2.y;
    }
    public void setzeX(double xx){x=xx;}
    public void setX(double x){this.x = x;}
    public void setY(double y){this.y = y;}
    public double getX(){return x;}
    public double getY(){return y;}
    public boolean equals(Object thatObject){
        if (thatObject instanceof ProjektGruppenarbeit1){
         ProjektGruppenarbeit1 that = (ProjektGruppenarbeit1)thatObject;
         return this.x==that.x && this.y == that.y;
        }
        return false;
    }
    
}


 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package name.panitz.ludens.animationGame;

import java.util.Objects;

/**
 *
 * @author ASUS
 */
public class Pizzaa {
    
    public static void main(String[]args){
        Pizzaa p1 = new Pizzaa(null, null, 23, true);
        p1.getName();
        p1.getBelag();
        p1.getAnzahl();
        boolean softoderKnusprig = p1.getSoftoderKnusprig();
        
        System.out.println(p1);
        
        
        
       }
    
    private String Name;
    private String Belag;
    private int Anzahl;
    private boolean SoftoderKnusprig;  

    
    
   

    
  public Pizzaa (String Name, String Belag, int Anzahl, boolean SoftoderKnusprig) {
        setName(Name);
        setBelag(Belag);
        setAnzahl(Anzahl);
        setSoftoderKnusprig(SoftoderKnusprig); 
  }

  public final void setName(String Name) {if( Name != null)
      this.Name = Name;}
  public final void setBelag(String Belag) {if( Belag != null)
      this.Belag = Belag;}
  public final void setAnzahl (int Anzahl) {if( Anzahl >=0){this.Anzahl = Anzahl;
  }else{ this.Anzahl = Anzahl * 0; 
  }}
  public final void setSoftoderKnusprig (boolean SoftoderKnusprig) {if ( SoftoderKnusprig != false) this.SoftoderKnusprig = SoftoderKnusprig;}
  
  
   public String getName() {return Name;}
   public String getBelag() {return Belag;}
   public double getAnzahl() {return Anzahl;}
   public boolean getSoftoderKnusprig() {return SoftoderKnusprig;}
   
   @Override
   public String toString (){
       return "Name der Pizza: "+getName() 
               + "\nDer Belag:" +getBelag() 
               + "\nAnzahl der Pizzen:" +getAnzahl() 
               + "\nSoft oder Knusprig:" +getSoftoderKnusprig();
       
    
   }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.Name);
        hash = 47 * hash + Objects.hashCode(this.Belag);
        hash = 47 * hash + this.Anzahl;
        hash = 47 * hash + (this.SoftoderKnusprig ? 1 : 0);
        return hash;
    }
   
    @Override
    public boolean equals(Object thatObject){
        if (thatObject instanceof Pizzaa){
         Pizzaa that = (Pizzaa)thatObject;
         return this.Belag.equals(that.Belag) && this.Name.equals(that.Name);
        }
        return false;
    }
   
}


    


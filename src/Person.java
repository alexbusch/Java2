/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lk.arbeit4;


public class Person {
          
    private String name;
    private String nachname;
    private double alter;
    private boolean weiblich;  
    
    
   

    
  public Person (String name, String nachname, double alter, boolean weiblich) {
        setName(name);
        setNachname(nachname);
        setAlter(alter);
        setWeiblich(weiblich); 
  }

  public void setName(String name) {if( name != null)
      this.name = name;}
  public void setNachname(String nachname) {if( nachname != null)
      this.nachname = nachname;}
  public void setAlter (double alter) {if( alter >=0){this.alter = alter;
  }else{ this.alter = alter * 0; 
  }}
  public void setWeiblich (boolean weiblich) {if ( weiblich != false) this.weiblich = weiblich;}
  
  
   public String getName() {return name;}
   public String getNachname() {return nachname;}
   public double getAlter() {return alter;}
   public boolean getWeiblich() {return weiblich;}
   
   @Override
   public String toString (){
       return " name:" +getName() + " ,nachname:" +getNachname() + " alter:" +getAlter() + " Weiblich:" +getWeiblich();
   }
   
   
}


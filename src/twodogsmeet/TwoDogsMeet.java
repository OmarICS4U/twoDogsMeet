package twodogsmeet;

import javax.swing.JOptionPane;


public class TwoDogsMeet {
  public static void main(String[] args) {
    Dog dog1 = new Dog("Rover", "Spaniel", 3, 4, 11);
    int w, x, y, z;
    
    Dog dog2 = new Dog ((JOptionPane.showInputDialog("What is the first dog's name?")),JOptionPane.showInputDialog("What is the first dog's breed?"));
    Dog dog3 = new Dog ((JOptionPane.showInputDialog("What is the second dog's name?")),JOptionPane.showInputDialog("What is the second dog's breed?"));

    //Values for dog1
//    System.out.println(dog1.getName() + "'s Aggression: "
//      + dog1.getAggression());
    
    //Values for dog2
    System.out.println(dog2.toString());
    
    //Values for dog3
    System.out.println(dog3.toString());
    
    //see if user wants to change hunger and aggression
    String dog2AggChange = ((JOptionPane.showInputDialog("The First dog's agression is " + dog2.getAggression()+ ". If you want to change it press 1, if not press 2")));
   int dog2AggressionChange = Integer.parseInt(dog2AggChange);
    if (dog2AggressionChange == 1){
      String dog2AggChangeValue = ((JOptionPane.showInputDialog("The First dog's agression is changed to " )));
    w=Integer.parseInt(dog2AggChangeValue);
      dog2.setAggression(w);
  }
    
    
    String dog2hungChange = ((JOptionPane.showInputDialog("The First dog's hunger is " + dog2.getHunger()+ ". If you want to change it press 1, if not press 2")));
   int dog2HungerChange = Integer.parseInt(dog2hungChange);
    if (dog2HungerChange == 1){
      String dog2hungChangeValue = ((JOptionPane.showInputDialog("The First dog's agression is changed to " )));
    x=Integer.parseInt(dog2hungChangeValue);
      dog3.setAggression(x);
  }
    
    String dog3AggChange = ((JOptionPane.showInputDialog("The second dog's agression is " + dog3.getAggression()+ ". If you want to change it press 1, if not press 2")));
   int dog3AggressionChange = Integer.parseInt(dog3AggChange);
    if (dog3AggressionChange == 1){
      String dog3AggChangeValue = ((JOptionPane.showInputDialog("The second dog's agression is changed to " )));
    y=Integer.parseInt(dog3AggChangeValue);
      dog3.setAggression(y);
  }
    
    
    String dog3hungChange = ((JOptionPane.showInputDialog("The second dog's hunger is " + dog3.getHunger()+ ". If you want to change it press 1, if not press 2")));
   int dog3HungerChange = Integer.parseInt(dog3hungChange);
    if (dog3HungerChange == 1){
      String dog3hungChangeValue = ((JOptionPane.showInputDialog("The second dog's agression is changed to " )));
    z=Integer.parseInt(dog3hungChangeValue);
      dog3.setAggression(z);
  }
     
    
    //Values for dog2
    System.out.println(dog2.toString());
    
    //Values for dog3
    System.out.println(dog3.toString());


    //Factors control behaviour
    if (dog3.getAggression() > 5) {
      //dog1 is aggressive
      System.out.print(dog3.getName() + ": ");
      dog3.barkAngry();
    } else {
      //dog1 is not aggressive
      System.out.print(dog3.getName() + ": ");
      dog3.barkFriendly();
    }

    if (dog2.getAggression() > 5) {
      //dog2 is aggressive
      System.out.print(dog2.getName() + ": ");
      dog2.barkAngry();
    } else {
      //dog2 is not aggressive
      System.out.print(dog2.getName() + ": ");
      dog2.barkFriendly();
    }
  }
}

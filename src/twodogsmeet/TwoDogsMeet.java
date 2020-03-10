package twodogsmeet;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showInputDialog;

public class TwoDogsMeet {
  public static void main(String[] args) {
    Dog dog1 = new Dog("Rover", "Spaniel", 3, 4, 11);
    
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
    String dog1AggChange = ((JOptionPane.showInputDialog("The First dog's agression is " + dog2.getAggression()+ ". If you want to change it press 1, if not press 2")));
   int dog2AggressionChange = Integer.parseInt(dog1AggChange);
    if (dog2AggressionChange) == 1{
      String dog2AggChangeValue = ((JOptionPane.showInputDialog("The First dog's agression is changed to " )));
      dog2.setAggression = Integer.parseInt(dog2AggChangeValue);
  }
     String dog1HungChange = ((JOptionPane.showInputDialog("The First dog's Hunger is " + dog2.getAggression()+ ". If you want to change it press 1")));


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

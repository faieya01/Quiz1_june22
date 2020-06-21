 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1_cc104;


/**
 *
 * @author Fairy
 */
public class Quiz1_cc104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Person<String> human[] = new Person[5];
       human[0] = new Person<>("Flair","Clancer","Iceland",null);
       human[1] = new Person<>("karen","McDonald","Japan",null);
       human[2] = new Person<>("Rain","Perry","Canada",null);
       human[3] = new Person<>("Allan","McGreg","London",null);
       human[4] = new Person<>("Remuel","Biyo","Lanang",null);
       
       SinglyLinkedList<String> show = new SinglyLinkedList<>();
       show.addFirst(human[0]);
       show.addFirst(human[1]);
       show.addFirst(human[2]);
       show.addFirst(human[3]);
       show.addFirst(human[4]);
       
       System.out.println("\nAddfirst Method:");
       show.showList();
         
       System.out.println("\nAddLast Method: ");
       show.addLast(human[4]);
       show.showList();
       
       System.out.println("\nRemoveFirst Method: ");
       show.removeFirst();
       show.showList();
       
     
    }
    
}


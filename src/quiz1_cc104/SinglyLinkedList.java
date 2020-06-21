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
public class SinglyLinkedList<E>{
  private Person<E> head, tail;
  private int size=0;
  
  public SinglyLinkedList() {
       
    }
  
   public boolean isEmpty() {
        return size == 0;
    }
   
    public Person first() {
        return head;
    }

    public Person last() {
        return tail;
    }
    
    public void addFirst(Person newNode) {
        newNode.setNextPerson(head);
        head = newNode;
        if (isEmpty()) {
            tail = newNode;
            head.setNextPerson(tail);
        }
        size++;
        
    }
  
  public void addLast(Person newNode) {
        tail.setNextPerson(newNode);
        tail = newNode;
        if (isEmpty()) {
            head = newNode;
            tail.setNextPerson(head);
        }
        size++;
  }
    public Person removeFirst(){
    Person<E> tempNode = head;
        head = head.getNextPerson();
        tempNode.setNextPerson(head);
        size--;
        return tempNode;
        
    }
   
    
    public void showList() {
      
        Person temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print("[" + temp.getFirstname()+" "+ temp.getLastname()+","+ temp.getAddress()+"]");
           temp = temp.getNextPerson();
        }
    }
    
        
        
  }   


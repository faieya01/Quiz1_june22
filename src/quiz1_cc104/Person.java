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
public class Person<E>{
     private String Firstname, Lastname, Address;
     private Person nextPerson;

    /**
     * @return the nextPerson
     */
    public Person getNextPerson() {
        return nextPerson;
    }

    /**
     * @param nextPerson the nextPerson to set
     */
    public void setNextPerson(Person nextPerson) {
        this.nextPerson = nextPerson;
    }
 
    public Person(String Firstname, String lastname, String Address, Person nextPerson){
    
    this.Firstname = Firstname;
    this.Lastname = lastname;
    this.Address = Address;
    this.nextPerson = nextPerson;
    }
    
    /**
     * @return the Firstname
     */
    public String getFirstname() {
        return Firstname;
    }

    /**
     * @param Firstname the Firstname to set
     */
    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    /**
     * @return the Lastname
     */
    public String getLastname() {
        return Lastname;
    }

    /**
     * @param Lastname the Lastname to set
     */
    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }
    
   
}


import javax.swing.*;
import java.util.*;
class Contact{
    String name;
    String phoneNumber;
    String email;
    String address;
    
    Contact(String n,String p,String e,String a){
        name=n;
        phoneNumber=p;
        email=e;
        address=a;
    }
    void display(){
        JOptionPane.showMessageDialog(null,"Name: "+name+"\nPhone Number: "+phoneNumber+"\nEmail: "+email+"\nAddress: "+address);
    }
}
class AddressBook{
    ArrayList persons;
    AddressBook(){
        persons=new ArrayList();
       
    }
    void addPerson(){
        String name=JOptionPane.showInputDialog("Enter Name: ");
        String pNum=JOptionPane.showInputDialog("Enter Phone Number: ");
        String em=JOptionPane.showInputDialog("Enter Email: ");
        String add=JOptionPane.showInputDialog("Enter Address: ");
        Contact c=new Contact(name,pNum,em,add);
        persons.add(c);
    }
    void searchPerson(String n){
        for(int i=0;i<persons.size();i++){
            Contact c=(Contact)persons.get(i);
            if(n.equals(c.name)){
                c.display();
            }
        } 
    }
    void deletePerson(String n){
        for(int i=0;i<persons.size();i++){
            Contact c=(Contact)persons.get(i);
            if(n.equals(c.name)){
                persons.remove(i);
            }
        }
    }
    
   
}
public class Test{
    public static void main(String[]args){
        AddressBook ab=new AddressBook();
        String input,s;
        int ch;
         while(true){
             input=JOptionPane.showInputDialog("Enter 1 to add\nEnter 2 to Search\nEnter 3 to Delete\nEnter 4 to Exit");
             ch=Integer.parseInt(input);
             
             switch(ch){
                 case 1:
                     ab.addPerson();
                     break;
                    
                 case 2:
                     s=JOptionPane.showInputDialog("Enter name to search: ");
                     ab.searchPerson(s);
                     break;
                     
                 case 3:
                     s=JOptionPane.showInputDialog("Enter name to delete: ");
                     ab.deletePerson(s);
                     break;
                     
                 case 4:
                     
                     System.exit(0);
            }
        }
    }
}
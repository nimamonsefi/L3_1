/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author nimamonsefi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Person person=new Person();
        
        System.out.print("Enter Your Age : ");
        
        try{
            person.setAge(scanner.nextInt());
        }catch(MyException e){
            System.out.println("Error : You Are Under 23 !!!");
        }
        
        System.out.print("Enter Your Nation : ");
        
        try{
            person.setNation(scanner.next());
        }catch(MyException e){
            System.out.println("Error : You Are Not Iranian !!!");
        }
        
    }
    
}

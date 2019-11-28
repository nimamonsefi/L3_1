/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nimamonsefi
 */
public class Person {
    private int age;
    private String Nation;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws MyException {
        this.age = age;
        if(age<23){
            throw new MyException();
        }
    }

    public String getNation() {
        return Nation;
    }

    public void setNation(String Nation) throws MyException{
        this.Nation = Nation;
        if(!Nation.equalsIgnoreCase("iran")){
            throw new MyException();
        }
    }
    
}

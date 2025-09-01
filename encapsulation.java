package demo;
class Person{
    private String name;
    private int age;
    private double cash;

public String getName(){
    return name;
}
public int getAge(){
    return age;
}
public double getCash(){
    return cash;
}
public void setName(String name){
    this.name=name;
}
public void setAge(int age){
    this.age=age;
    if (age>=18){
        System.out.println("he/she is a major");
    }
    else{
        System.out.println("he/she is not a major");
    }
}
public void setCash(double cash){
    this.cash=cash;
    if(cash>=300){
        System.out.println("he/she can enter inside with a entry ticket");}
        else{
            System.out.println("Cash may not be sufficient to buy a ticket ");
    }
    }}
public class Main{
    public static void main(String[] args){
        Person sc=new Person();
   sc.setName("rahul"); 
    sc.setAge(20);
    sc.setCash(450);
    //displaying the information
    System.out.println("person named as:"+sc.getName());
    System.out.println("person age is:"+sc.getAge());
    System.out.println("person has an amount of:"+sc.getCash());
}}

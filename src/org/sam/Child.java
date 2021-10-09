package org.sam;

public class Child extends Parent {

int a=20;
private void add1() {
	int a=30;
	System.out.println("child  local : "+a);

}
public static void main(String[] args) {
	Child c=new Child();
	c.add1();
	c.add();
    System.out.println("child instance " +c.a);
    
   
}
}

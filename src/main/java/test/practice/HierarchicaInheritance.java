package test.practice;


 class AnimalsClass{  
void eat(){System.out.println("eating...");}  
}  
class Goat extends AnimalsClass{  
void bark(){System.out.println("barking...");}  
}  
class Cat3 extends AnimalsClass{  
void meow(){System.out.println("meowing...");}  
}  
class HierarchicaInheritance{  
public static void main(String args[]){  
Cat3 c=new Cat3();  
c.meow();  
c.eat();  
// c.bark();//C.T.Error  
}}  
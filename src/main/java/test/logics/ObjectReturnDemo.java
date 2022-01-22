package test.logics;

class ObjectReturnDemo {

    int a;

    ObjectReturnDemo(int i) { a = i; }
	
	

	ObjectReturnDemo incrByTen()
	{

		ObjectReturnDemo temp= new ObjectReturnDemo(a + 10);

		return temp;

	}



 

    // Main driver method

    public static void main(String args[])

    {

        ObjectReturnDemo ob1 = new ObjectReturnDemo(2);

        ObjectReturnDemo ob2;

        ob2 = ob1.incrByTen();

        System.out.println("ob1.a: " + ob1.a);

        System.out.println("ob2.a: " + ob2.a);

    }

}

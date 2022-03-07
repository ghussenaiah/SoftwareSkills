package test.logics;

public class Test 
{
    static
    {
        System.out.println("Static block called");
    }
    public Test()
    {
        System.out.println("Inside Test class constructor");
    }
    public Test(int i)
    {
        System.out.println("Inside Test class constructor121212"+i);
    }
}
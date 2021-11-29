package test.general;

public class SystemDuplicate {

	
	public static  PrintStreamDuplicate check=new PrintStreamDuplicate();

	public static PrintStreamDuplicate getCheck() {
		return check;
	}

	public static void setCheck(PrintStreamDuplicate check) {
		check=new PrintStreamDuplicate();
	}
	

}




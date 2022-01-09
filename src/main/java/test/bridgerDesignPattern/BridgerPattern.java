package test.bridgerDesignPattern;

public class BridgerPattern {

	public static void main(String[] args) {
		
		TextMessage textbyemail=new TextMessage(new Email());
		textbyemail.sendMessage();
		
		TextMessage textbysms=new TextMessage(new SMS());
		textbysms.sendMessage();
		
		
		QrMessage qrbyemail=new QrMessage(new Email());
		qrbyemail.sendMessage();
		
		QrMessage qrbysms=new QrMessage(new SMS());
		qrbysms.sendMessage();
	}

}

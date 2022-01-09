package test.bridgerDesignPattern;


public class Email implements NotificationSender {

	public void sendNotification() {
		System.out.println("sending message through email");
	}

}

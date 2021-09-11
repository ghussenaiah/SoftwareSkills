package test.BridgerDesignPattern;


public class Email implements NotificationSender {

	public void sendNotification() {
		System.out.println("sending message through email");
	}

}

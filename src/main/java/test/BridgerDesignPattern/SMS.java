package test.BridgerDesignPattern;

public class SMS implements NotificationSender {

	public void sendNotification() {

		System.out.println("sending message through sms");
	}
}

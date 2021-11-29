package test.BridgerDesignPattern;

public class TextMessage extends Notification {

	public TextMessage(NotificationSender notificationSender) {
		super(notificationSender);

	}

	@Override
	void sendMessage() {
		notificationSender.sendNotification();

	}

}

package test.bridgerDesignPattern;




public class QrMessage extends Notification{

	public QrMessage(NotificationSender notificationSender) {
		super(notificationSender);

	}

	@Override
	void sendMessage() {
		notificationSender.sendNotification();

	}

}
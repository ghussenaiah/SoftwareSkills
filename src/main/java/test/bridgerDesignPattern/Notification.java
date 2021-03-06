package test.bridgerDesignPattern;

public abstract class Notification {
	
	NotificationSender notificationSender;

	public Notification(NotificationSender notificationSender) {
		super();
		this.notificationSender = notificationSender;
	}
	
	abstract void sendMessage();
}

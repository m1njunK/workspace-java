package l1_example;

public class MessageButton {

	private String title;

	public MessageButton(String title) {
		this.title = title;
	}
	
	public void onTouch() {
		System.out.println("메세지를 전달합니다.");
	}

	@Override
	public String toString() {
		return "MessageButton [title=" + title + "]";
	}
	
}

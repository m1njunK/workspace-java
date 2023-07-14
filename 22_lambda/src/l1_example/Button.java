package l1_example;

@FunctionalInterface
interface OnClickListener{
	void onClick();
	// void onCheck();
}

public class Button {
	
	private OnClickListener listener;
	private String title;

	public Button(String title) {
		this.title = title;
	}
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	public void onTouch() {
		listener.onClick();
	}

	@Override
	public String toString() {
		return "Button [title=" + title + "]";
	}
	
}

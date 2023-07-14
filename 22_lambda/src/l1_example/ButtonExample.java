package l1_example;

public class ButtonExample {

	public static void main(String[] args) {
		MessageButton mButton = new MessageButton("메세지");
		mButton.onTouch();
		
		Button button = new Button("메세지");
		button.setOnClickListener(new MessageListener());
		button.onTouch();
		
		Button callButton = new Button("전화");
		callButton.setOnClickListener(new CallListener());
		callButton.onTouch();
		
		Button loginButton = new Button("로그인");
		OnClickListener clickListener = new OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("로그인 수행");
			}
		};
		
		loginButton.setOnClickListener(clickListener);
		loginButton.onTouch();
		
		Button joinButton = new Button("회원가입");
		joinButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("회원가입 수행");
			}
		});
		joinButton.onTouch();
		
		//lambda expression
		Button btnClick = new Button("페이지 이동");
		btnClick.setOnClickListener(()->{
			System.out.println("로그인 페이지로 이동");
		});
		btnClick.onTouch();
		
		
		
		
		
		
		
		
	}
}

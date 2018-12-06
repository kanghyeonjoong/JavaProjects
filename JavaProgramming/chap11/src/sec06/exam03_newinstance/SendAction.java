package sec06.exam03_newinstance;

public class SendAction implements Action {
	private String title;
	
	public SendAction() {
		
	}
	
	public SendAction(String title) {
		this.title=title;
	}
	
	 public String getTitle() {
		 return title;
	 }
	 
	@Override
	public void execute() {
		System.out.println("데이터를 보냅니다.");

	}

}

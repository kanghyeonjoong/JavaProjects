package sec06.exam03_newinstance;

public class ReceiveAction implements Action {

	private String title;
	
	 public ReceiveAction() {
		 
	 }
	 
	 public ReceiveAction(String title) {
		this.title=title;
	}
	
	 public String getTitle() {
		 return title;
	 }
	 
	@Override
	public void execute() {
		System.out.println("데이터를 받습니다.");

	}

}

package sec02.exam01_inheritance;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// DmbCellPhone 객체 생성
		//자식객체를 생성하면 부모객체가 먼저 생성되고 자식 객체가 그 다음에 생성된다.
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);

		// CellPhone으로부터 상속받은 필드
		System.out.println("모델 : " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);

		// DmbCellPhone의 필드
		System.out.println("채널: " + dmbCellPhone.channel);

		System.out.println();

		// CellPhone으로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		dmbCellPhone.sendVoice("아~ 예 반갑습니다.");
		dmbCellPhone.hangUp();

		System.out.println();

		// DmbCellPhone의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}

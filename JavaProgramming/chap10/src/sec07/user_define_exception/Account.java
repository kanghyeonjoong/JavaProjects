package sec07.user_define_exception;

public class Account {
	private long balance;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) throws BalanceInsufficientException {//����� ���� ���� ���ѱ��
		if (balance < money) {
			throw new BalanceInsufficientException("�ܰ����:" + (money - balance) + "���ڶ�");//����� ���� ���� �߻�
		}
		balance -= money;
	}
}
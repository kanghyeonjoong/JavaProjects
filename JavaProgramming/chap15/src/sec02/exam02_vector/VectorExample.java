package sec02.exam02_vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		/*
		 * Vector�� ArrayList�� ������ ���� ������ ������.
		 * =>List<E> list=new Vector<E>();
		 * ArrayList�� �ٸ� ���� Vector�� ����ȭ��(synchronized)�޼ҵ�� �����Ǿ� �ֱ� ������ ��Ƽ�����尡 ���ÿ�
		 * �� �޼ҵ���� ������ �� ����, �ϳ��� �����尡 ������ �Ϸ��ؾ߸� �ٸ� �����带 ������ �� �ִ�.
		 * �׷��� ��Ƽ ������ ȯ�濡�� �����ϰ� ��ü�� �߰�, ������ �� �ִ�.
		 */
		List<Board> list = new Vector<>();

		list.add(new Board("����1", "����1", "�۾���1"));
		list.add(new Board("����2", "����2", "�۾���2"));
		list.add(new Board("����3", "����3", "�۾���3"));
		list.add(new Board("����4", "����4", "�۾���4"));
		list.add(new Board("����5", "����5", "�۾���5"));

		list.remove(2);
		list.remove(3);

		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
		}
	}

}

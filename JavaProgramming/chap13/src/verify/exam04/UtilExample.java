package verify.exam04;

public class UtilExample {

	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<String, Integer>("ȫ�浿", 35);
		Integer age = Util.getValue(pair, "ȫ�浿");
		System.out.println(age.intValue());

		ChildPair<String, Integer> childPair = new ChildPair<String, Integer>("ȫ���", 20);
		Integer childAge = Util.getValue(childPair, "ȫ���");
		System.out.println(childAge);
		
		OtherPair<String, Integer> otherPair=new OtherPair<String, Integer>("ȫ���", 20);
		/*int otherAge=Util.getValue(otherPair,"ȫ���");
		System.out.println(otherAge);*/
	}

}

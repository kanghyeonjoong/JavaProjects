package verify.exam04;

public class UtilExample {

	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<String, Integer>("È«±æµ¿", 35);
		Integer age = Util.getValue(pair, "È«±æµ¿");
		System.out.println(age.intValue());

		ChildPair<String, Integer> childPair = new ChildPair<String, Integer>("È«»ï¿ø", 20);
		Integer childAge = Util.getValue(childPair, "È«»ï¼ø");
		System.out.println(childAge);
		
		OtherPair<String, Integer> otherPair=new OtherPair<String, Integer>("È«»ï¿ø", 20);
		/*int otherAge=Util.getValue(otherPair,"È«»ï¿ø");
		System.out.println(otherAge);*/
	}

}

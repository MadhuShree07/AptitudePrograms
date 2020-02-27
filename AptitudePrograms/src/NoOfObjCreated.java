public class NoOfObjCreated {

	static int countObject = 0;

	{
		countObject++;
	}

	public static void main(String[] args) {
		NoOfObjCreated object1 = new NoOfObjCreated();
		NoOfObjCreated object2 = new NoOfObjCreated();
		NoOfObjCreated object3 = new NoOfObjCreated();
		NoOfObjCreated object4 = new NoOfObjCreated();
		NoOfObjCreated object5 = new NoOfObjCreated();
		NoOfObjCreated object6 = new NoOfObjCreated();
		NoOfObjCreated object7 = new NoOfObjCreated();

		System.out.println("number of object created is " + countObject);
	}
}
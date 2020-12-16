package java11.basic.concepts;

public class TestParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Parent p=new Parent("Sreekanth");
        
		/*
		 * p.setX(100); System.out.println(p.getX());
		 * 
		 * //Parent.assignValues(); p.displayMembers();
		 */
        
        //Child c = new Child();
		Parent c2 = new Child("Jyothi","Arjun");
		c2.displayMembers();
		c2.getZ();
		c2.getZ(1);
        }
}

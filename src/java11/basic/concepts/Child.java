package java11.basic.concepts;

public class Child extends Parent {

	static {
		System.out.println("Inside Child, static block");
	}
	public Child() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Inside Zero argument constuctor of Child");
	}

	public Child(String z) {
		super(z);
		// TODO Auto-generated constructor stub
		System.out.println("Inside  argument constuctor of Child");
	}

	public Child(String string, String string2) {
		// TODO Auto-generated constructor stub
		super(string);
		str = string2;
		System.out.println("value of z is:"+z);
		System.out.println("value of str is:"+str);
	}

	String str = "";

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	public String getZ() {
		System.out.println("Inside Child, z value is:"+z);
		return z;
	}
}

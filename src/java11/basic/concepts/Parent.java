package java11.basic.concepts;
public class Parent {
int x;
static int y;

String z;

public Parent(String z) {
	super();
	this.z = z;
	System.out.println("Inside constructor: valu of z is:"+z);
	System.out.println("Inside constructor: valu of x is:"+x);
	System.out.println("Inside constructor: valu of y is:"+y);
}

public Parent() {
	super();
	// TODO Auto-generated constructor stub
	System.out.println("Inside Zero argument constuctor of Parent");
}


static {
	System.out.println("Inside Parent, Static block");
}

static void assignValues() {
	y=20;
	System.out.println(y);
}

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;	
}

public String getZ() {
	System.out.println("Inside Parent, z value is:"+z);
	return z;
}

public void setZ(String z) {
	this.z = z;
}

void displayMembers() {
	System.out.println("value of x is:"+x);
	System.out.println("value of y is:"+y);
	System.out.println("value of z is:"+z);
	} 

public void getZ(int i) {
	// TODO Auto-generated method stub
	System.out.println("value of i is:"+i);
}
}


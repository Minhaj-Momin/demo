package inheritance; // package : keyword

public class A /*extends Object*/
{
	//javac implicitly adds invocation of IMMEDIATE super ctor
	A()
	{   // inside ctor there is always 1st line is super() 
		// super(); //added only in the sub class ctor only (not in object class : superclass)
		System.out.println("In A");
	}
	// child can't exists without parents
	// hence 1st superclass ctor call then subclass ctor calls
}

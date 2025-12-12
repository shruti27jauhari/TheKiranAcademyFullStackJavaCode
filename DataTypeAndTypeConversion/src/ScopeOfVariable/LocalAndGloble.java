package ScopeOfVariable;

public class LocalAndGloble {
	 int b = 20;  

	    void m1() {
//	        int c = 78;  
	        System.out.println(b);
	    }

	    void m2() {
	        System.out.println(b);
//	        System.out.println(c);  
	    }
}

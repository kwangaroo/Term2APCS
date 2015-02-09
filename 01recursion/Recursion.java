public class Recursion{
    
    public String name(){ 
	return "Wang, Kathy"; 
    }
    
    public int fact(int n){
	if(n<0){
	    throw new IllegalArgumentException("Can't evaluate a negative number.");
	}
	if(n==0){
	    return 1; 
	}else if(n==1){
	    return 1;
	}else{
	    return n*fact(n-1); 
	}
    }
    
    public int fib(int n){
	if(n<0){
	    throw new IllegalArgumentException("Can't evaluate a negative number.");
	}
	if(n==0) return 0; 
	if(n==1 || n==2){
	    return 1;
	}
	return fib(n-1)+fib(n-2); 
    }

    public double sqrt(double n){
	if(n<0){
	    throw new IllegalArgumentException("Can't evaluate a negative number.");
	}
	if(n==0){
	    return 0;
	}
	return sqrtHelp(n,1.0);
    }

    public double sqrtHelp(double n, double guess){
	double newGuess = (n/guess + guess)/2;
	if(n==0){
	    return 0;
	}
	if(newGuess==guess){
	    return guess;
	}
	return sqrtHelp(n,newGuess); 
    }
    
    /*    public static void main(String[]args){
	Recursion a = new Recursion(); 
	System.out.println("0 factorial: " +a.fact(0));
	System.out.println("5 factorial: " +a.fact(5));
	System.out.println("-10 factorial: "+a.fact(-10)); 
      	System.out.println(a.fib(5));
	System.out.println(a.fib(-1));
	System.out.println(a.fib(7));
	System.out.println(a.fib(0));
	System.out.println(a.sqrt(100)); 
	System.out.println(a.sqrt(144));
	System.out.println(a.sqrt(50));
	System.out.println(a.sqrt(-100));  
	}*/
}

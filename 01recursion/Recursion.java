public class Recursion{

    public String name(){ 
	return "Wang, Kathy"; 
    }

    public int fact(int n){
	if(n==0){
	    return 0; 
	}else if(n==1){
	    return 1;
	}else{
	    return n*fact(n-1); 
	}
    }
    
    public int fib(int n){
	return 0;
    }
    
    public double sqrt(double n){
	return 0.0;  
  }
    
    public static void main(String[]args){
	Recursion a = new Recursion(); 
	System.out.println(a.fact(0));
	System.out.println(a.fact(5)); 
    }
}

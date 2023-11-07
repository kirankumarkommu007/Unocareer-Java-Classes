interface PrimeNumber{
	  
	  void isPrime(int num);
	  
  }

 
public class EvnoddInterface {
	
	
	
	public static void main(String[] args) {
	
		
			
			
			PrimeNumber pNo = 	(x)->{
					int count=0;
					for(int i=1;i<=x;i++) {
						if(x % i == 0) count++;
					}
					if(count == 2) System.out.println("True");
					else System.out.println("Flase");
				};
				
			pNo.isPrime(11);
				
				
				
			

	}

// functional interface
	
	
	

}
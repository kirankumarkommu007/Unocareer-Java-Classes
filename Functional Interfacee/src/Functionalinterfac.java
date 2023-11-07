interface Numbers{
	int add(int a,int b);
}


class AddNum implements Numbers{

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}
	
}


	
	
	


public class Functionalinterfac {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			
			AddNum adNo = new AddNum();
			
			int res = adNo.add(100, 200);
		
			System.out.println(res);
	}

}

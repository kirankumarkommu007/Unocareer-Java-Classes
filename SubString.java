public class SubString {

	public static void main(String[] args) {
     String Msg = "welcome to miryalaguda";
     String str1, str2,str3, str4  =new String();
     str1= Msg.substring(0, 5);
     System.out.println(str1);
     
     str2= Msg.substring(2);
     System.out.println(str2);
     
     str3 = Msg.toUpperCase();
     System.out.println(str3);
     
     str4 =str3.concat(" SIR");
     System.out.println(str4);
     
     

     
     
	}

}

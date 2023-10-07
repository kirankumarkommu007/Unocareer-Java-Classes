
public class LongStringWords {

	public static void main(String[] args) {
   String data = "welcome to india. i Love My india."
   		+" india is very Beautiful culture country.";
   
   String k = "india";
   
   //data = data.replace('.', ' ');
   String []res =data.split(" ");
 

   
   for(int i = 0; i<res.length;i++) {
	  if(res[i].equalsIgnoreCase(k) ) {
		   res[i]="USA";
	   }		  
	/*  if(res[i].equalsIgnoreCase("india.") ) {
		   res[i]="USA.";
	   }*/
	 
	   System.out.print(res[i]+" ");
   }
   
	}

}

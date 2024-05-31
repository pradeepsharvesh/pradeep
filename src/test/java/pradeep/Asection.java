package pradeep;

public class Asection {
	
	public static void main(String[] args) {
		
			int s[] = {10,40,20,30,50,20,40,};
    	int num = 0;
    	
    	for(int i=0; i<s.length;i++){
    		if(s[i]!=-0){
    			for (int j=i+1;j<s.length;j++){
    				if(s[i]==s[j]){
    					s[j]=num;
    				}
    				
    			}
    		System.out.println(s[i]);
    	}
        }	
     }
    	
}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
	  // String a = "pradeep";
	  // String b = "shanthi";
	   //System.out.println("before swaging");
	  // System.out.println(a);
	  // System.out.println(b);
	  // a = a + b;
	  // b = a.substring(0,a.length()-b.length());
	  // a = a.substring(b.length());
	 //  System.out.println("after swaging:a = "+a+" and b ="+b);
	  // System.out.println(a);
	   //System.out.println(b);
	   
			   
	   

   


   
	  
	    	  
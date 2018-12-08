package prova08122018;

public class exer8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 128;
		String numA = String.valueOf(a);
		
		int b = 457;
		String numB = String.valueOf(b);
		
		int c = calculaC(numA, numB);
		System.out.println("Numero final " + c);

	}
	
	public static  int calculaC (String numA, String numB) {
		int c = 0;
		String s = null;
		if(numA.length() > numB.length()) {
			for(int i = 0; i < numA.length(); i++) {
				
				int nA = Character.digit(numA.charAt(i), 10);
			    System.out.println("digito: " + nA);
			    if(s==null) {
			    	s = ""+nA;
			    }else {
			    	s = ""+s+nA;
			    }
			    
	
			    if(i < numB.length()) {
			    	int nB = Character.digit(numB.charAt(i), 10);
			    	System.out.println("digito: " + nB);
			    	s = ""+s+nB;
			    	
			    }
			  
			}
		}else {
			for(int i = 0; i < numB.length(); i++) {
				if(i < numA.length()) {
					int nA = Character.digit(numA.charAt(i), 10);
					System.out.println("digito: " + nA);
					if(s==null) {
						s = ""+nA;
					}else {
						s = ""+s+nA;
					}
				 }
				
				int nB = Character.digit(numB.charAt(i), 10);
				System.out.println("digito: " + nB);
				s = ""+s+nB;
						   
						  
			}
		}
		
		c = Integer.parseInt(s);
		if (c > 1000000) {
			c = -1;
		}
		return c;
	}

}

public class ex08 {
    public static void main(String[] args) {
        int val1[] = {2, 4, 6, 8, 10};
		int val2[] = {12, 14, 16, 18, 20};
		
		conc(val1, val2);
		
	}
	
	public static void conc(int val1[], int val2[]) {
		int soma = val1.length + val2.length;
		int nVal[] = new int[soma];
 		
		for(int i = 0; i < val1.length; i++) {
			nVal[i] = val1[i];
		}
		
		int vIn = val1.length+1;
		
		for(int j = 0; j <= val2.length; j++) {
			for(int i = vIn; i <= soma; i++) {
				nVal[i] = val2[j];
			}			 
		}	
		
		for(int i = 0; i < soma; i++) {
			System.out.println(nVal[i]);
		}
    }
}

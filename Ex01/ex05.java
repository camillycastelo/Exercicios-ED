public class ex05 {
    public static void main(String[] args) {
        int num[] = {2, 3, 6, 9, 12};		
		
		System.out.println(numAleat(num));
	}
	
	public static int numAleat(int num[]) {
		
		double aleat;
		int result;
		
		aleat = (Math.random()*5);
		aleat = Math.floor(aleat);
		
		result = (int)aleat;				
		
		return num[result];
    }
}

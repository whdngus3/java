package jojo1;


public class chap4_19 {
	public static void main(String[] args) {
		

		String[] animals= {"a","b","c","d"};
		String[] fruits= {"A","B","C","D"};
		String[] total = new String[animals.length+fruits.length];
		
		System.arraycopy(animals,0,total,0,animals.length);
		System.arraycopy(fruits,0,total,4,animals.length);
		
		for(int i=0;i<total.length;i++) {
			System.out.println(total[i]+"\t");
		
		}
		 
	}
}
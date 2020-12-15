package chap5;

public class card2 {
	String kind;
	int number;
	
	
	card2() {};
	card2(String k){
		kind=k;
	}
	card2(String k, int n){
		kind=k; number=n;
	}
	
	void disp() {
		System.out.println("=========");
		System.out.println(kind);
		System.out.println(number);
	}
}


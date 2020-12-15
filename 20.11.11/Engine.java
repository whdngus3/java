package chap5;

public class Engine {
	private int displacement;
	private String type;
	public Engine() {}
	Engine(int displacement,String type){
		this.displacement=displacement;
		this.setType(type);
	}
	public int getDisplacement() {return displacement;}
	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void print() {
		System.out.println(displacement);
		
	}
}

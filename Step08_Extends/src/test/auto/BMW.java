package test.auto;

public class BMW extends Car{
	
	public BMW(Engine engine) {
		
		super(engine);
	}
	
	public void change() {
		System.out.println("스포츠 모드로 변환해요!");
	}
}

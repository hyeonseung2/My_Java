package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

/*
 * 지역변수나 필드값에 선언하는 data type 은 (참조 데이터type)
 * 그 안에 들어있는 참조값의 사용 설명서라고 생각하면 된다.
 * 그렇기 때문에 그 지역변수나 필드에 . 을 찍으면 사용 설명서에 명시된 기능만 사용 할 수 있다.
 * java의 모든 객체는 다형성을 가질수 있다.
 * 다형성 type이 여러개라는 의미다.
 */
public class MainClass02 {
	public static void main(String[] args) {
		//다형성 확인!!
		HandPhone p1=new HandPhone();
		//어떤 객체의 참조값을 부모 type 으로 받을 수 있다. 
		Phone p2=new HandPhone();
		Object p3=new HandPhone();
		
	}
	
}

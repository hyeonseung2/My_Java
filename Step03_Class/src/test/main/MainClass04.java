package test.main;

import test.mypac.MemBer;

public class MainClass04 {
	public static void main(String[] args) {
		//1. Member 객체를 생성해서
		MemBer m1=new MemBer();
		//2. 회원 한명의 정보를 담고
		m1.num=1;
		m1.name="김구라";
		m1.addr="노량진";
		//3. showInfo() 메소드를 호출해보세요.
		m1.showInfo();
	}

}

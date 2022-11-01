package test.main;
/*
 * While 문을 활용해서 원하는 횟수만큼 반복하기
 * 
 * -반복 횟수가 명확히 정해져 있으면 for 문으로 반복문을 도는게 좋다.
 * -반복 횟수가 명확히 정해져

 */

public class MainClass08 {
	public static void main(String[] args) {
		int count=0;
		//무한 루프로 돌다가
		while(true) {
			System.out.println("안녕");
			count++;
			//특정 조건 하에서 무한 루프 빠져 나오기
			if(count==5) {
				break;
			}
		}
		System.out.println("-----");
		count=0; //카운트를 다시 0으로 만들고
		
		while(count<5) {
			System.out.println("안녕!");
			count++;
		}
	}
}

package test.main;

public class MainClass08 {
	public static void main(String[] args) {
		String str="abcde12345";
		int result=str.length();
		char result2=str.charAt(5);
		/*
		 * String 객체의메소드를활용해서
		 * str변수안에있는문자를모두대문자(UpperCase)로변환해서
		 * str2 라는이름의변수에담아보세요
		 */
		String str2=str.toUpperCase();
		
		String greet="Hello! mimi, Bye! mimi";
		//위문자열에서mimi라는문자열을 mama 라는문자열로교체해서결과를 greet2에담아보세요
		//단,String객체의메소드를활용해서
		String greet2=greet.replace("mimi", "mama");
		
		String message="My name is kimgura";
		/*
		 * 1. 위의문자열이 My 라는문자열로시작하는지여부(true or false)를isStart라는변수에담아보세요
		 * 
		 * 2. 위의문자열이i가문자열의몇번째인덱스에위치하고있는지 index 라는변수에담아보세요.
		 */
		boolean isStart=message.startsWith("My");
		int index=message.indexOf("i");
		
	}

}

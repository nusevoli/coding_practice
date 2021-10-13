package pass;

public class NumberString {

	/**
	 * 2021 카카오 채용연계형 인턴십 숫자 문자열과 영단어
	 * 
	 * 
	 * s result "one4seveneight" 1478 "23four5six7" 234567 "2three45sixseven" 234567
	 * "123" 123
	 * 
	 * @param args
	 */

	/**
	 * 숫자 영단어 0 zero 1 one 2 two 3 three 4 four 5 five 6 six 7 seven 8 eight 9 nine
	 */
	public int solution(String s) {

		String newString = s.replaceAll("zero", "0").replaceAll("one", "1").replaceAll("two", "2")
				.replaceAll("three", "3").replaceAll("four", "4").replaceAll("five", "5").replaceAll("six", "6")
				.replaceAll("seven", "7").replaceAll("eight", "8").replaceAll("nine", "9");

		return Integer.parseInt(newString);
	}

}

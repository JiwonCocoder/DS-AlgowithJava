package chp1;
import java.util.Scanner;
// 입력 받은 10진수를 2진수~36진수로 기수 변환하여 나타냄

class CardConvRev {
	// 정숫값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수를 반환합니다.
	static int cardConvR(int number, int card_number, char[] d) {
		int digits = 0;						// 변환 후의 자릿수
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits++] = dchar.charAt(number % card_number);	// r로 나눈 나머지를 저장
			number /= card_number;
		} while (number != 0);
		return digits;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;							// 변환하는 정수
		int cd;							// 기수
		int dno;						// 변환 후의 자릿수
		int retry;						// 다시 한 번?
		char[] invertNumberArray = new char[32];		// 변환 후 각 자리의 숫자를 넣어두는 문자의 배열

		System.out.println("10진수를 기수 변환합니다.");
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수：");
				no = stdIn.nextInt();
			} while (no < 0);

			do {
				System.out.print("어떤 진수로 변환할까요? (2~36)：");
				cd = stdIn.nextInt();
			} while (cd < 2 || cd > 36);

			dno = cardConvR(no, cd, invertNumberArray);		// no를 cd진수로 변환

			System.out.print(cd + "진수로는 ");
			for (int i = dno - 1; i >= 0; i--)	// 윗자리부터 차례로 나타냄
				System.out.print(invertNumberArray[i]);
			System.out.println("입니다.");

			System.out.print("한 번 더 할까요? (1.예／0.아니오)：");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}
/*
public class CardConvRev {
	static int count=0;
	static char[] convertCard(int cardinal_number,int num) {
		char[] transition_num=new char[32];
		String digit_character="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//나머지는　transition_num에，　몫은　num에　다시　넣는다．
		do {
			transition_num[count++]=digit_character.charAt(num%cardinal_number);
			num=num/cardinal_number;
		}
		while(num!=0);
		return transition_num;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Random random=new Random();
		System.out.println("숫자입력：");
		int cardianl_number=scanner.nextInt();
		int num=100+random.nextInt(90);
		char[] result_num=new char[32];
		result_num=convertCard(cardianl_number,num);
		for(int i=count;i<0;i++) {
			System.out.println(result_num[i]);
		}
		
	}
*/


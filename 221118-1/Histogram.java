/*
 *   2. 분포도 (히스토그램) 나타내기
 *   	- 사용자에게 1 ~ 100사이의 10개의 정수를 입력받아
 *   	- 각 정수의 범위에 해당하는 정수 개수를 출력하기
 *   	예) 1 ~ 10 : ****
 *   		11 ~ 20 : **
 *   		21 ~ 30 : *
 *   		31 ~ 40 : 
 *   		41 ~ 50 : ***
 *   		...
 *   		91 ~ 100 : *
 */
import java.util.Arrays;
import java.util.Scanner;

public class Histogram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int[] arr = new int [10];
		System.out.println("1 ~ 100사이의 정수 10개를 입력하세요.");
		
		
		
		
		int [] arr1 = new int [10];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = 0;
		}
		
		for (int i = 0; i < arr.length; i++) {
			int input = scan.nextInt();
			if (input > 0 && input <= 100) {
				if (input >= 1 && input <= 10) {
					arr1[0]++;
				} else if (input <= 20) {
					arr1[1]++;
				} else if (input <= 30) {
					arr1[2]++;
				} else if (input <= 40) {
					arr1[3]++;
				} else if (input <= 50) {
					arr1[4]++;
				} else if (input <= 60) {
					arr1[5]++;
				} else if (input <= 70) {
					arr1[6]++;
				} else if (input <= 80) {
					arr1[7]++;
				} else if (input <= 90) {
					arr1[8]++;
				} else if (input <= 100) {
					arr1[9]++;
			} else {
				System.out.println("1 ~ 100사이의 정수를 입력하세요.");
				i--;
				}
			}
		}
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.print((i * 10 + 1) + " ~ " + (i * 10 + 10) + " : ");
			for (int j = 0; j < arr1[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

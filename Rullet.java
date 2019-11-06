package test;

import java.util.Scanner;

public class Rullet {
	/**
	 * TODO 반장 뽑기
	 * 
	 * 25명 중 임의로 1명을 뽑는다.
	 * 
	 * 필요한 데이터 : 25명의 이름 -> 25개 변수
	 * 임의로 : 랜덤메서드 Math.Random()
	 * 
	 * 결과
	 * 반장: OOO
	 * 
	 * 지금 이 소스는 수강생이 카페에 올린 걸 강사님이 수정하신 것.
	 * 
	 * 과제 : 멤버들을 섞어서 무조건 0번이 뽑히게.
	 * 0번지의 값 == 임의의 위치의 값을 바꾼다.
	 * @param args
	 */
	public static void main(String[] args) {
		int ran;
		Scanner kb = new Scanner(System.in);
		
		
		String [] member = {"고현주", "구자윤", "김난형", "김동진", "김주연", "문영기", "박준섭", 
							"박지은", "방창용", "양햇살", "엄예빈", "위은주", "이용재", "이진형",
							"이택수", "장한솔", "정엄지", "정용기", "조지윤", "조성빈", "최찬영",
							"하재운", "홍지수", "황다울"};
		
		
		while(true) {			
			System.out.println("제비뽑기를 시작하려면 1번을 누르세요");
			int menu = kb.nextInt();
			
			if(menu == 1){
				ran = (int)(Math.random() * 24);// 0 <= ran < 1.0
				System.out.println("축하합니다. 반장은 " + member[ran] + "입니다.");
			}else if(menu == 2) break;
		}
	}
}
import java.util.LinkedList;
import java.util.Queue;

public class Main2 {
	public static void main(String[] args) {
		// Queue : 줄세우기
		// Deque : Queue 인터페이스의 동작을 상속받은 인터페이스 (addLast 가장 마지막에 원소 추가, removeLast 마지막 제거, getLast 마지막 살펴보는것)
		// PriorityQueue : 넣은 순서대로 줄세우는 것이 아닌 중요한 것이 앞으로 정렬되도록 (중요함의 정도는 크기로 비교)
//		Deque<String> queue = new LinkedList<>();
		Queue<String> queue = new LinkedList<>();
		queue.add("첫번째대기");
		queue.offer("두번째대기");
		queue.add("세번째대기");
		queue.offer("네번째대기");
		
		System.out.println(queue);
		// 줄제거
		String first = queue.remove();
		String second = queue.poll();
		
		System.out.println(first);
		System.out.println(second);
		
		System.out.println("현재 대기 : " + queue);
		
		// remove는 줄 것이 없다면 예외를 발생시킴
//		queue.remove();
//		queue.remove();
//		queue.remove();
		
		// poll은 줄 것이 없다면 null값을 반환함
//		queue.poll();
//		queue.poll();
//		queue.poll();
		
		System.out.println("현재 대기 : " + queue);
		System.out.println("가장 앞 녀석 : " + queue.element());
		System.out.println("가장 앞 녀석 : " + queue.peek());
		System.out.println("현재 대기 : " + queue);
		
	}
}

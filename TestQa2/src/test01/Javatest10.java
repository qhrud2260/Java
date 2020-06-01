package test01;

public class Javatest10 {

	
	static int QUEUE_SIZE = 10;
	static int queue[] = new int[QUEUE_SIZE];
	static int front = 0, rear = 0;
	
	public static void main(String[] args) {
	
		insert(100);
		insert(200);
		insert(300);
		
		System.out.println(delete());
		System.out.println(delete());
		System.out.println(delete());
		System.out.println(delete());
	}
	
	public static void insert(int data) {
		if(rear == QUEUE_SIZE) {
			System.out.println("���̻� �����͸� ���� �� �� �����ϴ�.");
		}
		queue[rear++] = data;
	}
	
	public static int delete() {
		if(front == QUEUE_SIZE) {
			System.out.println("�����Ͱ� �����ϴ�.");
			return 0;
		}
		return queue[front++];
	}

}
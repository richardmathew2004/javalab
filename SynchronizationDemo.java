package hello;
class MultipicationTable{
	synchronized void printMultiplicationTable(int number) {
		
		for(int i=1;i<=10;i++) {
			System.out.println(i+"X"+number+"="+i*number);
		}
	
}
}
class MyThread1 extends Thread{
	MultipicationTable t;
	MyThread1(MultipicationTable t){
		this.t=t;
	}
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
		t.printMultiplicationTable(5);
	}
}
class MyThread2 extends Thread{
	MultipicationTable t;
	MyThread2(MultipicationTable t){
		this.t=t;
	}
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
		t.printMultiplicationTable(7);
	
}
}
public class SynchronizationDemo {

	public static void main(String[] args) {
		MultipicationTable m =new MultipicationTable();
		MyThread1 t = new MyThread1(m);
		t.start();
		MyThread2 t2 = new MyThread2(m);
		t2.setPriority(2);
		t2.start();

	}

}


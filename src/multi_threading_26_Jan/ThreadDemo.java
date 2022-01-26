package multi_threading_26_Jan;

public class ThreadDemo {

	public static void main(String[] args) {
		Exx thread1 = new Exx("First", 2000);
		Exx thread2 = new Exx("Second", 3000);

		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		}

		catch (Exception e) {

		}
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
			System.out.println("main" + i);
		
		}
	}
}

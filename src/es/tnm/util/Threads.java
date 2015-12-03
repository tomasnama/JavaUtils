package es.tnm.util;

/**
 * @author Tomas Navarro Martinez
 *
 */
public class Threads {
	
	/**Para ver como el azar mezcla dos Threads
	 */
	public static void testThreads() {
		
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 20; i++) {
					System.out.println("thread1 "+i);
				}
            }
        });
        
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
            	 for (int i = 0; i < 10; i++) {
 					System.out.println("thread2 "+i);
 				}
            }
        });
        
        thread1.start();
        thread2.start();
	}
	
	/**
	 * Thread con parámetro n
	 */
	public static class ContarThread implements Runnable {
		public ContarThread(int n) {
			for (int i = 0; i < n; i++) {
				System.out.println(i);
			}
		}

		@Override
		public void run() {

		}
	}
	
}

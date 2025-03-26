package main.threading;

public class Main extends Thread{
	
	public Main() {
		System.out.println("Main Constuctor");
	}

	public Main(int a) {
		System.out.println("Main Constuctor "+a);
	}
	
	
	@Override
	public void run() {
		System.out.println("Running into thread");
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Thread currentThread = Thread.currentThread();
//		System.out.println(currentThread.getName());
		
//		Thread t = new Main();
//		t.start();

		
//		System.out.println("Hello world");
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("Printed");
		
//		Thread tv = new Thread(new TestingVideoPlayer());
//		tv.start();
//		Thread tv1 = new Thread(new TestingVideoPlayer());
//		tv1.start();
//		Thread tv2 = new Thread(new TestingVideoPlayer());
//		tv2.start();
		
		
//		
//		Thread video  = new Thread(new VideoPlayer());
//		video.start();
		
//		for(int i=0; i<20; i++) {
//			System.out.println("Video Running");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		for(int i=0; i<20; i++) {
//			System.out.println("Audio Playing");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		
//		Thread video  = new Thread(new VideoPlayer());
//		Thread audio = new Thread(new AudioPlayer());
//		
//		video.start();
//		audio.start();
		
//		Main m = new Main();
//		Main m2 = new Main(12);
		
		
	}

}

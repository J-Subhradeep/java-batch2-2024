package main.threading;

public class VideoPlayer implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.println("Video Running");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}

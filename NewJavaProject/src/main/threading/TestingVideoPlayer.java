package main.threading;

public class TestingVideoPlayer implements Runnable{

	@Override
	public void run() {
		System.out.println("Using runnable interface "+ Thread.currentThread().getName());
		
	}


}

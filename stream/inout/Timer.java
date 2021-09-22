package stream.inout;

public class Timer {
	static long startTime,endTime;
	public static void startTime() {
		startTime=System.nanoTime();
	}
	public static void endTime() {
		endTime=System.nanoTime();
		System.out.println("Total Time="+(endTime-startTime));
	}
}

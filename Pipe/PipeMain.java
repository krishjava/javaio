import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipeMain {

    public static void main(String[] args) throws Exception {

        final PipedOutputStream output = new PipedOutputStream();
        final PipedInputStream  input  = new PipedInputStream(output);


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
			for(int i=65;i<=90;i++){				
                    		output.write(i);
				Thread.sleep(1000);			
			}
                } catch (Exception e) {
                }
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int data = input.read();
                    while(data != -1){
                        System.out.print((char) data);
                        data = input.read();
                    }
                } catch (IOException e) {
                }
            }
        });

        thread1.start();
        thread2.start();

    }
}

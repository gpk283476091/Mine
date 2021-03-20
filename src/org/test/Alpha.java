package org.test;

public class Alpha {
private void write() {
	System.out.println("write");

}
private void read() throws InterruptedException {
	System.out.println("read");
	Thread.sleep(5000);

}
}

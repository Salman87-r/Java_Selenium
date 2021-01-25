package BrowserStack;

import java.net.MalformedURLException;

class IELatestWin10 implements Runnable {
	public void run() {
		mainTestClass r1 = new mainTestClass();
    try {
		r1.executeTest("edge", "latest", "Windows", "10", "Thread 3", "Multithreaded Java sample build");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}

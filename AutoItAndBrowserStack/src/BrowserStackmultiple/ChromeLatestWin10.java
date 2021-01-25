package BrowserStackmultiple;

import java.net.MalformedURLException;

class ChromeLatestWin10 implements Runnable {
	public void run() {
		mainTestClass r1 = new mainTestClass();
        try {
			r1.executeTest("Chrome", "latest", "Windows", "10", "Thread 1", "Multithreaded Java sample build");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
}

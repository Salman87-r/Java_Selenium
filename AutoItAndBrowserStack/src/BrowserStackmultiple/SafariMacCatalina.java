package BrowserStackmultiple;

import java.net.MalformedURLException;

class SafariMacCatalina implements Runnable
{
	public void run() {
		mainTestClass r1 = new mainTestClass();
		try {
			r1.executeTest("Safari", "latest", "OS X", "Catalina", "Thread 4", "Multithreaded Java sample build");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

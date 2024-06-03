package week1.day2;

public class Browser {
	public String launchBrowser(String BrowserName) {
		System.out.println("Browser launched successfully");
		return BrowserName;
	}
	public void loadUrl() {
		System.out.println("Application url is loadedsuccessfully");
	}
	public static void main(String[]args) {
		Browser bm=new Browser();
		System.out.println(bm.launchBrowser("EDGE"));
		bm.loadUrl();
				
	}

}

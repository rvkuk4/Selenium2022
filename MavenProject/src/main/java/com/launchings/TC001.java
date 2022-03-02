package com.launchings;

public class TC001 extends BaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			init();
			launcher("chromebrowser");
			navigateUrl("googleurl");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

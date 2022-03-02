package com.launchings;


public class TC005_jira extends BaseTest {

	public static void main(String[] args) throws Exception 
	{
		init();
		launcher("chromebrowser");
		navigateUrl("jiraurl");
		launchjiraticket("ticketid");

	}


}

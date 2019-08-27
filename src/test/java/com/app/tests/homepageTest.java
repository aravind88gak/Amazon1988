package com.app.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.basepage;
import com.app.pages.homepageobjects;

public class homepageTest {

		homepageobjects homePage;
		basepage bp;

		public homepageTest() {
			homePage = new homepageobjects();
		//	bp = new basepage();												
			}		
		@Test
		public void verifyallTab() {
			//Assert.assertTrue(homePage.getWomenTab().equals("Women"));
			Assert.assertTrue(homePage.getDressesTab().isDisplayed());
			Assert.assertTrue(homePage.gettShirtTab().isDisplayed());			}
				@Test
				public void navigateAllThree()	{
					System.out.println(homePage.womenPageNavi());
					System.out.println(homePage.dressesPageNavi());
					System.out.println(homePage.tshirtsPageNavi());				}
				@Test
				public void typeemailidandclick()	{
					homePage.getNewsLetterBox();
					homePage.getClickEmailButton();				
					homePage.alertpopup();
					System.out.println(homePage.alertpopup());					}
				@Test
				public void sdisplayedornot()	{
					Assert.assertTrue(homePage.verifysizes().isDisplayed());
					System.out.println(homePage.verifysizes().getText());
					Assert.assertTrue(homePage.verifysizem().isDisplayed());
					System.out.println(homePage.verifysizem().getText());	
					Assert.assertTrue(homePage.verifysizel().isDisplayed());
					System.out.println(homePage.verifysizel().getText());
				}}
package com.spacex.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import comSpaceX.base.TestSpaceXBase;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetSpaceXLatestLaunches extends TestSpaceXBase {
	
	public GetSpaceXLatestLaunches() {
		super();
	}

	
	@Test(priority=1)
	public void getSpaceXLaunchLatestTest() {
		
		Response response = get(prop.getProperty("spacexlaunchesurl"));
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());
		int statusCode = response.getStatusCode();
		System.out.println("Status code is"+statusCode);
		Assert.assertEquals(statusCode, 200);
	}
	
	@Test(priority=2)
	public void getSpaceXInvalidURLTest()
	{
	  given().
	       get(prop.getProperty("spacexlaunchestamperedurl")).
	  then().
	       statusCode(404);
	  

    }
	
	@Test(priority=3)
	public void verifySpaceXLaunchDetailsTest()
	{
	  given().
	       get(prop.getProperty("spacexlaunchesurl")).
	  then().
	       statusCode(200).
	       body("fairings.ships", hasItems("5ea6ed2f080df4000697c90b","5ea6ed2e080df4000697c909")).
	       body("window", equalTo(5940)).
	       body("links.youtube_id", equalTo("bgtDRR2F2wA")).
	       body("rocket",equalTo("5e9d0d95eda69973a809d1ec"));
	  

    }
	
	
	@Test(priority=4)
	public void getSpaceXLaunchLatestWithHeader()
	{
	  given().
	       header("Content-Type","application/json").
	       get(prop.getProperty("spacexlaunchesurl")).
	  then().
	       statusCode(200).
	       log().all();
	}
}

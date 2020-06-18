package com.qa.rest.tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;  // we need to mannually import this in order to make restassured work.
import static org.hamcrest.Matchers.*; 		//we need to mannually import this in order to make restassured work.

public class GetCallBdd {

	
	@Test
	public void total_circuits_2019() {// All the bdd tets have given(), when() and then () functions.
	
		given(). // initiator
			when().// condition
				get("http://ergast.com/api/f1/2020/circuits.json").// url to fetch.
					then().// action clause
					assertThat().
						statusCode(200).
						and().
							body("MRData.CircuitTable.Circuits",hasSize(30)); // assert a particular tag against a value ex:(hasSize(30)
								
}}

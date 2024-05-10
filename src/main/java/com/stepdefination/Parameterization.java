package com.stepdefination;

import java.util.Iterator;
import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Parameterization {
	  int  x, y,result = 0;
	  
	@Given("i have tow nymber {int} and {int}")
	public void i_have_tow_nymber(int x,int y) {
	 this.x = x;
	 this.y = y;
	}

	@When("i add them")
	public void i_add_them() {
	  result = x+y;
	}
	@Then("print result")
	public void print_result() {
	   System.out.println(result);
	}
	@Given("i have a string {string}")
	public void i_have_a_string(String string) {
	   System.out.println(string);
	}

	@Given("i have a word {string}")
	public void i_have_a_word(String string) {
	    System.out.println(string);
	}
	@Given("i have folling list:")
	public void i_have_folling_list(DataTable Table) {
		List<String> fruits = Table.asList();
		System.out.println();
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
	  
	}


	@Given("i have {string} {int}")
	public void detaDrivenTestcase(String fruit, int quantity) {
	  System.out.println("i have"+fruit+"with"+quantity+"quant");
	}










}

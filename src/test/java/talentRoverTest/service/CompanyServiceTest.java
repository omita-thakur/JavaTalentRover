package talentRoverTest.service;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import talentrover.model.Company;
import talentrover.service.CompanyService;

public class CompanyServiceTest {

	private static CompanyService companyService;

	@BeforeClass
	public static void setup() {
		companyService = new CompanyService();
	}

	@AfterClass
	public static void teardown() {
		companyService = null;
	}

	@Test
	public void testGetUserById() {
		Company company = companyService.getCompanyByName("Dazeworks");
		Assert.assertNotNull(company);
		System.out.println(company);
	}

}

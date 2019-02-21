package jWebUnitTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static net.sourceforge.jwebunit.junit.JWebUnit.assertLinkPresent;
import static net.sourceforge.jwebunit.junit.JWebUnit.assertTitleEquals;
import static net.sourceforge.jwebunit.junit.JWebUnit.beginAt;
import static net.sourceforge.jwebunit.junit.JWebUnit.clickLink;
import static net.sourceforge.jwebunit.junit.JWebUnit.assertSubmitButtonPresent;
import static net.sourceforge.jwebunit.junit.JWebUnit.assertCheckboxNotSelected;
import static net.sourceforge.jwebunit.junit.JWebUnit.assertCheckboxPresent;
import static net.sourceforge.jwebunit.junit.JWebUnit.assertFormElementPresent;
import static net.sourceforge.jwebunit.junit.JWebUnit.setBaseUrl;
import static net.sourceforge.jwebunit.junit.JWebUnit.setTestingEngineKey;
 
import org.junit.Before;
import org.junit.Test;
 
import net.sourceforge.jwebunit.util.TestingEngineRegistry;

public class JWebUnitTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		setTestingEngineKey(TestingEngineRegistry.TESTING_ENGINE_HTMLUNIT); 
        setBaseUrl("http://10.0.12.250:8080/SPM_project");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLoginPage() {
		beginAt("login.jsp"); 
        assertTitleEquals("SPM");
        assertLinkPresent("signup");
        assertLinkPresent("guestUser");
        clickLink("signup");
        assertTitleEquals("SignUp Form");
        assertFormElementPresent("firstName");
        assertFormElementPresent("lastName");
        assertFormElementPresent("email");
        assertFormElementPresent("matricula");
        assertFormElementPresent("password");
        assertCheckboxPresent("showPassword");
        assertCheckboxPresent("agree");
        assertCheckboxNotSelected("agree");
        assertSubmitButtonPresent("");
        assertLinkPresent("guestUser");
        assertLinkPresent("login");
        clickLink("login");
        assertTitleEquals("SPM");
        assertFormElementPresent("email");
        assertFormElementPresent("password");
        assertSubmitButtonPresent("");
        assertLinkPresent("passwordRecovery");
        assertLinkPresent("signup");
        assertLinkPresent("guestUser");
        clickLink("guestUser");
        assertTitleEquals("Guest User");
        assertCheckboxPresent("mine");
        assertCheckboxNotSelected("mine");
        assertLinkPresent("login");

	}
	
	 @Test
	 public void testSignUpPage() {
	        beginAt("signup.jsp"); 
	        assertTitleEquals("SignUp Form");
	        assertFormElementPresent("firstName");
	        assertFormElementPresent("lastName");
	        assertFormElementPresent("email");
	        assertFormElementPresent("matricula");
	        assertFormElementPresent("password");
	        assertCheckboxPresent("showPassword");
	        assertCheckboxPresent("agree");
	        assertCheckboxNotSelected("agree");
	        assertSubmitButtonPresent("");
	        assertLinkPresent("guestUser");
	        assertLinkPresent("login");
	        clickLink("login");
	        assertTitleEquals("SPM");
	        assertFormElementPresent("email");
	        assertFormElementPresent("password");
	        assertSubmitButtonPresent("");
	        assertLinkPresent("passwordRecovery");
	        assertLinkPresent("signup");
	        assertLinkPresent("guestUser");
	        clickLink("guestUser");
	        assertTitleEquals("Guest User");
	        assertCheckboxPresent("mine");
	        assertCheckboxNotSelected("mine");
	        assertLinkPresent("login");




	    }
	 
	 @Test
	 public void testGuestUserPage() {
	        beginAt("nonregister.jsp"); 
	        assertTitleEquals("Guest User");
	        assertCheckboxPresent("mine");
	        assertCheckboxNotSelected("mine");
	        assertLinkPresent("login");
	        clickLink("login");
	        assertTitleEquals("SPM");
	        assertLinkPresent("signup");
	        assertLinkPresent("guestUser");
	        clickLink("signup");
	        assertTitleEquals("SignUp Form");
	        assertFormElementPresent("firstName");
	        assertFormElementPresent("lastName");
	        assertFormElementPresent("email");
	        assertFormElementPresent("matricula");
	        assertFormElementPresent("password");
	        assertCheckboxPresent("showPassword");
	        assertCheckboxPresent("agree");
	        assertCheckboxNotSelected("agree");
	        assertSubmitButtonPresent("");
	        assertLinkPresent("guestUser");
	        assertLinkPresent("login");
	        clickLink("login");
	        assertTitleEquals("SPM");
	        assertFormElementPresent("email");
	        assertFormElementPresent("password");
	        assertSubmitButtonPresent("");
	        assertLinkPresent("passwordRecovery");
	        assertLinkPresent("signup");
	        //assertLinkPresent("guestUser");
	        
	    }
	 
	 @Test
	 public void testPasswordRecoveryPage() {
	        beginAt("PasswordRecovery.jsp"); 
	        assertTitleEquals("Forgot Password");
	        assertSubmitButtonPresent("");
	    	assertFormElementPresent("email");
	        assertLinkPresent("login");
	        clickLink("login");
	        assertTitleEquals("SPM");
	        assertLinkPresent("signup");
	        assertLinkPresent("guestUser");
	        clickLink("signup");
	        assertTitleEquals("SignUp Form");
	        assertFormElementPresent("firstName");
	        assertFormElementPresent("lastName");
	        assertFormElementPresent("email");
	        assertFormElementPresent("matricula");
	        assertFormElementPresent("password");
	        assertCheckboxPresent("showPassword");
	        assertCheckboxPresent("agree");
	        assertCheckboxNotSelected("agree");
	        assertSubmitButtonPresent("");
	        assertLinkPresent("guestUser");
	        assertLinkPresent("login");
	        clickLink("login");
	        assertTitleEquals("SPM");
	        assertFormElementPresent("email");
	        assertFormElementPresent("password");
	        assertSubmitButtonPresent("");
	        assertLinkPresent("passwordRecovery");
	        assertLinkPresent("signup");
	        assertLinkPresent("guestUser");
	        clickLink("guestUser");
	        assertTitleEquals("Guest User");
	        assertCheckboxPresent("mine");
	        assertCheckboxNotSelected("mine");
	        assertLinkPresent("login");
	    }
}

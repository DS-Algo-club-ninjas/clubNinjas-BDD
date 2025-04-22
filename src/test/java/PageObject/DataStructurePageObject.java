package PageObject;

public class DataStructurePageObject {

	
	@BeforeMethod
	public void setUp() {
	    login.signin();
	    login.login(Username, Password);
	}
}

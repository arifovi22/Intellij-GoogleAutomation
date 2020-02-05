
import googleTet.GoogleTest;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestAmaHomePage {
    GoogleTest page = new GoogleTest();
@Test
    public void testTitle(){

       // page.browserSetup();
       String actual = page.geTTitle();
       String expected ="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
    Assert.assertEquals(actual,expected);

    }

    @AfterTest
    public void close(){
       page.close();
    }
    @BeforeSuite
    public void setUp(){
    page.browserSetup();
    page.setUp();
    }






}

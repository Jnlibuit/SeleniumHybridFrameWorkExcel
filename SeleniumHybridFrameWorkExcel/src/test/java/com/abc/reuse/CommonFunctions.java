package com.abc.reuse;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.abc.config.StartBrowser;
import com.abc.wdcmds.ActionDriver;
import com.aventstack.extentreports.MediaEntityBuilder; 


public class CommonFunctions {

	public static WebDriver driver;
	public static ActionDriver aDriver;
	public static Properties prop;
	public CommonFunctions()
	{
		driver = StartBrowser.driver;
		aDriver = new ActionDriver();
	}

	public void Signin(String userName, String password) throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode( "Signin to Amazon");

		//aDriver.navigateToApplication("https://www.amazon.com/");
		aDriver.mouseHover(com.abc.applications.sample.objectrepository.HomePage.lnkAccount, "Account Menu");
		//aDriver.click(com.abc.applications.sample.objectrepository.HomePage.lnkAccount, "Account Link");
		aDriver.click(com.abc.applications.sample.objectrepository.AccountPage.btnSignin, "Sigin in button");	
		aDriver.type(com.abc.applications.sample.objectrepository.SigninPage.txtEmaild, userName, "Email Id");
		//aDriver.type(com.abc.applications.sample.objectrepository.SigninPage.txtEmaild, password, "Password");
		aDriver.click(com.abc.applications.sample.objectrepository.SigninPage.btnContinue, "Continue button");
		aDriver.type(com.abc.applications.sample.objectrepository.SigninPage.txtPassword, password, "Password");
		aDriver.click(com.abc.applications.sample.objectrepository.SigninPage.btnSignIn, "Sign-In button");
		Thread.sleep(2000);
	}

	public void AccountMenu() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode( "However to Account Menu");
		aDriver.mouseHover(com.abc.applications.sample.objectrepository.HomePage.lnkAccount, "Account Menu");




		//Thread.sleep(1000);
	}
	public static String[] DateSplit(String date) throws Exception
	{
		String date1 = date;
		String day = "";
		String mo = "";
		String year = "";
		String[] x=date.split("-");
		//System.out.println(day+x[0]);
		//System.out.println(day+x[1]);
		//System.out.println(day+x[2]);

		day =(x[0]);
		mo = (x[1]);
		year =(x[2]);

		String[] ans = new String[3]; 
		ans[0]  =day; 
		ans[1] = mo;
		ans[2] = year;


		return ans;
		//Thread.sleep(1000);
	}
	public void Signout() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode( "Mouseover to Account Menu");

		aDriver.mouseHover(com.abc.applications.sample.objectrepository.HomePage.lnkAccount, "Account Menu");
		aDriver.click(com.abc.applications.sample.objectrepository.AccountPage.lnkSignout, "Signout Link");



		//Thread.sleep(1000);
	}

	public void NavigateToHomePage(String url ) throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode( "Navigate to Home Page");
		aDriver.navigateToApplication(url);

		//aDriver.mouseHover(com.abc.applications.sample.objectrepository.HomePage.lnkAccount, "Account Menu");



		//Thread.sleep(1000);
	}

	public static void Gender(String gender ) throws Exception
	{
		String gendera = new String(gender);

		String male = new String("M");
		String female = new String("F");
		String other = new String("O");

		if (gendera.equals(male))
		{
			aDriver.click(com.abc.applications.i94.or.I94.rbtgendermale, "Gender Male");


		}
		if (gendera.equals(female))
		{
			aDriver.click(com.abc.applications.i94.or.I94.rbtgenderfemale, "Gender Female");

		}

		if (gendera.equals(other))
		{
			aDriver.click(com.abc.applications.i94.or.I94.rbtgenderother, "Gender Other");

		}

		
	}
	public static String capture(WebDriver driver, String screenshotName) throws IOException 
	{
		
		TakesScreenshot ts=(TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);
		String dest=System.getProperty("user.dir")+"/ErrorScreenshot/"+screenshotName+".png";
		File destination = new File(dest);
		FileUtils.copyFile(source, destination);

		return dest;
	}

	public static String isoCountrycode(String countryCode) throws IOException 
	{
		String countryCd = countryCode;

		String ABW="ABW";
		String AFG="AFG";
		String AGO="AGO";
		String AIA="AIA";
		String ALB="ALB";
		String AND="AND";
		String ANT="ANT";
		String ARE="ARE";
		String ARG="ARG";
		String ARM="ARM";
		String ASM="ASM";
		String ATA="ATA";
		String ATF="ATF";
		String ATG="ATG";
		String AUS="AUS";
		String AUT="AUT";
		String AZE="AZE";
		String BDI="BDI";
		String BEL="BEL";
		String BEN="BEN";
		String BES="BES";
		String BFA="BFA";
		String BGD="BGD";
		String BGR="BGR";
		String BHR="BHR";
		String BHS="BHS";
		String BIH="BIH";
		String BLM="BLM";
		String BLR="BLR";
		String BLZ="BLZ";
		String BMU="BMU";
		String BOL="BOL";
		String BRA="BRA";
		String BRB="BRB";
		String BRN="BRN";
		String BTN="BTN";
		String BVT="BVT";
		String BWA="BWA";
		String CAF="CAF";
		String CAN="CAN";
		String CCK="CCK";
		String CHE="CHE";
		String CHL="CHL";
		String CHN="CHN";
		String CIV="CIV";
		String CMR="CMR";
		String COD="COD";
		String COG="COG";
		String COK="COK";
		String COL="COL";
		String COM="COM";
		String CPV="CPV";
		String CRI="CRI";
		String CUB="CUB";
		String CUW="CUW";
		String CXR="CXR";
		String CYM="CYM";
		String CYP="CYP";
		String CZE="CZE";
		String DEU="DEU";
		String DJI="DJI";
		String DMA="DMA";
		String DNK="DNK";
		String DOM="DOM";
		String DZA="DZA";
		String ECU="ECU";
		String EGY="EGY";
		String ERI="ERI";
		String ESH="ESH";
		String ESP="ESP";
		String EST="EST";
		String ETH="ETH";
		String FIN="FIN";
		String FJI="FJI";
		String FLK="FLK";
		String FRA="FRA";
		String FRO="FRO";
		String FSM="FSM";
		String FXX="FXX";
		String GAB="GAB";
		String GBD="GBD";
		String GBN="GBN";
		String GBO="GBO";
		String GBP="GBP";
		String GBR="GBR";
		String GBS="GBS";
		String GGY="GGY";
		String GHA="GHA";
		String GIB="GIB";
		String GIN="GIN";
		String GLP="GLP";
		String GMB="GMB";
		String GNB="GNB";
		String GNQ="GNQ";
		String GRC="GRC";
		String GRD="GRD";
		String GRL="GRL";
		String GTM="GTM";
		String GUF="GUF";
		String GUM="GUM";
		String GUY="GUY";
		String HKG="HKG";
		String HMD="HMD";
		String HND="HND";
		String HRV="HRV";
		String HTI="HTI";
		String HUN="HUN";
		String IDN="IDN";
		String IMN="IMN";
		String IND="IND";
		String IOT="IOT";
		String IRL="IRL";
		String IRN="IRN";
		String IRQ="IRQ";
		String ISL="ISL";
		String ISR="ISR";
		String ITA="ITA";
		String JAM="JAM";
		String JEY="JEY";
		String JOR="JOR";
		String JPN="JPN";
		String KAZ="KAZ";
		String KEN="KEN";
		String KGZ="KGZ";
		String KHM="KHM";
		String KIR="KIR";
		String KNA="KNA";
		String KOR="KOR";
		String KWT="KWT";
		String LAO="LAO";
		String LBN="LBN";
		String LBR="LBR";
		String LBY="LBY";
		String LCA="LCA";
		String LIE="LIE";
		String LKA="LKA";
		String LSO="LSO";
		String LTU="LTU";
		String LUX="LUX";
		String LVA="LVA";
		String MAC="MAC";
		String MAF="MAF";
		String MAR="MAR";
		String MCO="MCO";
		String MDA="MDA";
		String MDG="MDG";
		String MDV="MDV";
		String MEX="MEX";
		String MHL="MHL";
		String MKD="MKD";
		String MLI="MLI";
		String MLT="MLT";
		String MMR="MMR";
		String MNE="MNE";
		String MNG="MNG";
		String MNP="MNP";
		String MOZ="MOZ";
		String MRT="MRT";
		String MSR="MSR";
		String MTQ="MTQ";
		String MUS="MUS";
		String MWI="MWI";
		String MYS="MYS";
		String MYT="MYT";
		String NAM="NAM";
		String NCL="NCL";
		String NER="NER";
		String NFK="NFK";
		String NGA="NGA";
		String NIC="NIC";
		String NIU="NIU";
		String NLD="NLD";
		String NOR="NOR";
		String NPL="NPL";
		String NRU="NRU";
		String NZL="NZL";
		String OMN="OMN";
		String PAK="PAK";
		String PAN="PAN";
		String PCN="PCN";
		String PER="PER";
		String PHL="PHL";
		String PLW="PLW";
		String PNG="PNG";
		String POL="POL";
		String PRI="PRI";
		String PRK="PRK";
		String PRT="PRT";
		String PRY="PRY";
		String PSE="PSE";
		String PYF="PYF";
		String QAT="QAT";
		String REU="REU";
		String RKS="RKS";
		String ROU="ROU";
		String RUS="RUS";
		String RWA="RWA";
		String SAU="SAU";
		String SDN="SDN";
		String SEN="SEN";
		String SGP="SGP";
		String SGS="SGS";
		String SHN="SHN";
		String SJM="SJM";
		String SLB="SLB";
		String SLE="SLE";
		String SLV="SLV";
		String SMR="SMR";
		String SOM="SOM";
		String SPM="SPM";
		String SRB="SRB";
		String SSD="SSD";
		String STP="STP";
		String SUR="SUR";
		String SVK="SVK";
		String SVN="SVN";
		String SWE="SWE";
		String SWZ="SWZ";
		String SXM="SXM";
		String SYC="SYC";
		String SYR="SYR";
		String TCA="TCA";
		String TCD="TCD";
		String TGO="TGO";
		String THA="THA";
		String TJK="TJK";
		String TKL="TKL";
		String TKM="TKM";
		String TLS="TLS";
		String TON="TON";
		String TTO="TTO";
		String TUN="TUN";
		String TUR="TUR";
		String TUV="TUV";
		String TWN="TWN";
		String TZA="TZA";
		String UGA="UGA";
		String UKR="UKR";
		String UMI="UMI";
		String UNO="UNO";
		String URY="URY";
		String USA="USA";
		String UZB="UZB";
		String VAT="VAT";
		String VCT="VCT";
		String VEN="VEN";
		String VGB="VGB";
		String VIR="VIR";
		String VNM="VNM";
		String VUT="VUT";
		String WAK="WAK";
		String WLF="WLF";
		String WSM="WSM";
		String XXB="XXB";
		String XXC="XXC";
		String XXX="XXX";
		String YEM="YEM";
		String YMD="YMD";
		String ZAF="ZAF";
		String ZAR="ZAR";
		String ZMB="ZMB";
		String ZWE="ZWE";





		String countryName = "";


		if (countryCd.equals(ABW)) {
			countryName="Aruba";
		}
		if (countryCd.equals(AFG)) {
			countryName="Afghanistan";
		}
		if (countryCd.equals(AGO)) {
			countryName="Angola";
		}
		if (countryCd.equals(AIA)) {
			countryName="Anguilla";
		}
		if (countryCd.equals(ALB)) {
			countryName="Albania";
		}
		if (countryCd.equals(AND)) {
			countryName="Andorra*";
		}
		if (countryCd.equals(ANT)) {
			countryName="Netherlands Antilles";
		}
		if (countryCd.equals(ARE)) {
			countryName="United Arab Emirates";
		}
		if (countryCd.equals(ARG)) {
			countryName="Argentina";
		}
		if (countryCd.equals(ARM)) {
			countryName="Armenia";
		}
		if (countryCd.equals(ASM)) {
			countryName="American Samoa";
		}
		if (countryCd.equals(ATA)) {
			countryName="Antarctica";
		}
		if (countryCd.equals(ATF)) {
			countryName="French Southern and Antarctic Lands";
		}
		if (countryCd.equals(ATG)) {
			countryName="Antigua and Barbuda";
		}
		if (countryCd.equals(AUS)) {
			countryName="Australia*";
		}
		if (countryCd.equals(AUT)) {
			countryName="Austria*";
		}
		if (countryCd.equals(AZE)) {
			countryName="Azerbaijan";
		}
		if (countryCd.equals(BDI)) {
			countryName="Burundi";
		}
		if (countryCd.equals(BEL)) {
			countryName="Belgium*";
		}
		if (countryCd.equals(BEN)) {
			countryName="Benin";
		}
		if (countryCd.equals(BES)) {
			countryName="Bonaire, Sint Eustatius, and Saba";
		}
		if (countryCd.equals(BFA)) {
			countryName="Burkina Faso";
		}
		if (countryCd.equals(BGD)) {
			countryName="Bangladesh";
		}
		if (countryCd.equals(BGR)) {
			countryName="Bulgaria";
		}
		if (countryCd.equals(BHR)) {
			countryName="Bahrain";
		}
		if (countryCd.equals(BHS)) {
			countryName="Bahamas, The";
		}
		if (countryCd.equals(BIH)) {
			countryName="Bosnia and Herzegovina";
		}
		if (countryCd.equals(BLM)) {
			countryName="Saint Barthelemy";
		}
		if (countryCd.equals(BLR)) {
			countryName="Belarus";
		}
		if (countryCd.equals(BLZ)) {
			countryName="Belize";
		}
		if (countryCd.equals(BMU)) {
			countryName="Bermuda";
		}
		if (countryCd.equals(BOL)) {
			countryName="Bolivia";
		}
		if (countryCd.equals(BRA)) {
			countryName="Brazil";
		}
		if (countryCd.equals(BRB)) {
			countryName="Barbados";
		}
		if (countryCd.equals(BRN)) {
			countryName="Brunei*";
		}
		if (countryCd.equals(BTN)) {
			countryName="Bhutan";
		}
		if (countryCd.equals(BVT)) {
			countryName="Bouvet Island";
		}
		if (countryCd.equals(BWA)) {
			countryName="Botswana";
		}
		if (countryCd.equals(CAF)) {
			countryName="Central African Republic";
		}
		if (countryCd.equals(CAN)) {
			countryName="Canada";
		}
		if (countryCd.equals(CCK)) {
			countryName="Cocos (Keeling) Islands";
		}
		if (countryCd.equals(CHE)) {
			countryName="Switzerland*";
		}
		if (countryCd.equals(CHL)) {
			countryName="Chile*";
		}
		if (countryCd.equals(CHN)) {
			countryName="China";
		}
		if (countryCd.equals(CIV)) {
			countryName="Cote d'Ivoire";
		}
		if (countryCd.equals(CMR)) {
			countryName="Cameroon";
		}
		if (countryCd.equals(COD)) {
			countryName="Congo, Democratic Republic of the";
		}
		if (countryCd.equals(COG)) {
			countryName="Congo, Republic of the";
		}
		if (countryCd.equals(COK)) {
			countryName="Cook Islands";
		}
		if (countryCd.equals(COL)) {
			countryName="Colombia";
		}
		if (countryCd.equals(COM)) {
			countryName="Comoros";
		}
		if (countryCd.equals(CPV)) {
			countryName="Cape Verde";
		}
		if (countryCd.equals(CRI)) {
			countryName="Costa Rica";
		}
		if (countryCd.equals(CUB)) {
			countryName="Cuba";
		}
		if (countryCd.equals(CUW)) {
			countryName="Curacao";
		}
		if (countryCd.equals(CXR)) {
			countryName="Christmas Island";
		}
		if (countryCd.equals(CYM)) {
			countryName="Cayman Islands";
		}
		if (countryCd.equals(CYP)) {
			countryName="Cyprus";
		}
		if (countryCd.equals(CZE)) {
			countryName="Czech Republic*";
		}
		if (countryCd.equals(DEU)) {
			countryName="Germany*";
		}
		if (countryCd.equals(DJI)) {
			countryName="Djibouti";
		}
		if (countryCd.equals(DMA)) {
			countryName="Dominica";
		}
		if (countryCd.equals(DNK)) {
			countryName="Denmark*";
		}
		if (countryCd.equals(DOM)) {
			countryName="Dominican Republic";
		}
		if (countryCd.equals(DZA)) {
			countryName="Algeria";
		}
		if (countryCd.equals(ECU)) {
			countryName="Ecuador";
		}
		if (countryCd.equals(EGY)) {
			countryName="Egypt";
		}
		if (countryCd.equals(ERI)) {
			countryName="Eritrea";
		}
		if (countryCd.equals(ESH)) {
			countryName="Western Sahara";
		}
		if (countryCd.equals(ESP)) {
			countryName="Spain*";
		}
		if (countryCd.equals(EST)) {
			countryName="Estonia*";
		}
		if (countryCd.equals(ETH)) {
			countryName="Ethiopia";
		}
		if (countryCd.equals(FIN)) {
			countryName="Finland*";
		}
		if (countryCd.equals(FJI)) {
			countryName="Fiji";
		}
		if (countryCd.equals(FLK)) {
			countryName="Falkland Islands (Islas Malvinas)";
		}
		if (countryCd.equals(FRA)) {
			countryName="France*";
		}
		if (countryCd.equals(FRO)) {
			countryName="Faroe Islands";
		}
		if (countryCd.equals(FSM)) {
			countryName="Micronesia, Federated States of";
		}
		if (countryCd.equals(FXX)) {
			countryName="France, Metropolitan";
		}
		if (countryCd.equals(GAB)) {
			countryName="Gabon";
		}
		if (countryCd.equals(GBD)) {
			countryName="UK - British DTC";
		}
		if (countryCd.equals(GBN)) {
			countryName="UK - British National (O)";
		}
		if (countryCd.equals(GBO)) {
			countryName="UK - British Overseas";
		}
		if (countryCd.equals(GBP)) {
			countryName="UK - Protected Person";
		}
		if (countryCd.equals(GBR)) {
			countryName="United Kingdom*";
		}
		if (countryCd.equals(GBS)) {
			countryName="UK - British Subject";
		}
		if (countryCd.equals(GGY)) {
			countryName="Guernsey";
		}
		if (countryCd.equals(GHA)) {
			countryName="Ghana";
		}
		if (countryCd.equals(GIB)) {
			countryName="Gibraltar";
		}
		if (countryCd.equals(GIN)) {
			countryName="Guinea";
		}
		if (countryCd.equals(GLP)) {
			countryName="Guadeloupe";
		}
		if (countryCd.equals(GMB)) {
			countryName="Gambia, The";
		}
		if (countryCd.equals(GNB)) {
			countryName="Guinea-Bissau";
		}
		if (countryCd.equals(GNQ)) {
			countryName="Equatorial Guinea";
		}
		if (countryCd.equals(GRC)) {
			countryName="Greece*";
		}
		if (countryCd.equals(GRD)) {
			countryName="Grenada";
		}
		if (countryCd.equals(GRL)) {
			countryName="Greenland";
		}
		if (countryCd.equals(GTM)) {
			countryName="Guatemala";
		}
		if (countryCd.equals(GUF)) {
			countryName="French Guiana";
		}
		if (countryCd.equals(GUM)) {
			countryName="Guam";
		}
		if (countryCd.equals(GUY)) {
			countryName="Guyana";
		}
		if (countryCd.equals(HKG)) {
			countryName="Hong Kong";
		}
		if (countryCd.equals(HMD)) {
			countryName="Heard Island and McDonald Islands";
		}
		if (countryCd.equals(HND)) {
			countryName="Honduras";
		}
		if (countryCd.equals(HRV)) {
			countryName="Croatia";
		}
		if (countryCd.equals(HTI)) {
			countryName="Haiti";
		}
		if (countryCd.equals(HUN)) {
			countryName="Hungary*";
		}
		if (countryCd.equals(IDN)) {
			countryName="Indonesia";
		}
		if (countryCd.equals(IMN)) {
			countryName="Isle of Man";
		}
		if (countryCd.equals(IND)) {
			countryName="India";
		}
		if (countryCd.equals(IOT)) {
			countryName="British Indian Ocean Territory";
		}
		if (countryCd.equals(IRL)) {
			countryName="Ireland*";
		}
		if (countryCd.equals(IRN)) {
			countryName="Iran";
		}
		if (countryCd.equals(IRQ)) {
			countryName="Iraq";
		}
		if (countryCd.equals(ISL)) {
			countryName="Iceland*";
		}
		if (countryCd.equals(ISR)) {
			countryName="Israel";
		}
		if (countryCd.equals(ITA)) {
			countryName="Italy*";
		}
		if (countryCd.equals(JAM)) {
			countryName="Jamaica";
		}
		if (countryCd.equals(JEY)) {
			countryName="Jersey";
		}
		if (countryCd.equals(JOR)) {
			countryName="Jordan";
		}
		if (countryCd.equals(JPN)) {
			countryName="Japan*";
		}
		if (countryCd.equals(KAZ)) {
			countryName="Kazakhstan";
		}
		if (countryCd.equals(KEN)) {
			countryName="Kenya";
		}
		if (countryCd.equals(KGZ)) {
			countryName="Kyrgyzstan";
		}
		if (countryCd.equals(KHM)) {
			countryName="Cambodia";
		}
		if (countryCd.equals(KIR)) {
			countryName="Kiribati";
		}
		if (countryCd.equals(KNA)) {
			countryName="Saint Kitts and Nevis";
		}
		if (countryCd.equals(KOR)) {
			countryName="Korea, South*";
		}
		if (countryCd.equals(KWT)) {
			countryName="Kuwait";
		}
		if (countryCd.equals(LAO)) {
			countryName="Laos";
		}
		if (countryCd.equals(LBN)) {
			countryName="Lebanon";
		}
		if (countryCd.equals(LBR)) {
			countryName="Liberia";
		}
		if (countryCd.equals(LBY)) {
			countryName="Libya";
		}
		if (countryCd.equals(LCA)) {
			countryName="Saint Lucia";
		}
		if (countryCd.equals(LIE)) {
			countryName="Liechtenstein*";
		}
		if (countryCd.equals(LKA)) {
			countryName="Sri Lanka";
		}
		if (countryCd.equals(LSO)) {
			countryName="Lesotho";
		}
		if (countryCd.equals(LTU)) {
			countryName="Lithuania*";
		}
		if (countryCd.equals(LUX)) {
			countryName="Luxembourg*";
		}
		if (countryCd.equals(LVA)) {
			countryName="Latvia*";
		}
		if (countryCd.equals(MAC)) {
			countryName="Macau";
		}
		if (countryCd.equals(MAF)) {
			countryName="Saint Martin";
		}
		if (countryCd.equals(MAR)) {
			countryName="Morocco";
		}
		if (countryCd.equals(MCO)) {
			countryName="Monaco*";
		}
		if (countryCd.equals(MDA)) {
			countryName="Moldova";
		}
		if (countryCd.equals(MDG)) {
			countryName="Madagascar";
		}
		if (countryCd.equals(MDV)) {
			countryName="Maldives";
		}
		if (countryCd.equals(MEX)) {
			countryName="Mexico";
		}
		if (countryCd.equals(MHL)) {
			countryName="Marshall Islands";
		}
		if (countryCd.equals(MKD)) {
			countryName="Macedonia";
		}
		if (countryCd.equals(MLI)) {
			countryName="Mali";
		}
		if (countryCd.equals(MLT)) {
			countryName="Malta*";
		}
		if (countryCd.equals(MMR)) {
			countryName="Burma";
		}
		if (countryCd.equals(MNE)) {
			countryName="Montenegro";
		}
		if (countryCd.equals(MNG)) {
			countryName="Mongolia";
		}
		if (countryCd.equals(MNP)) {
			countryName="Northern Mariana Islands";
		}
		if (countryCd.equals(MOZ)) {
			countryName="Mozambique";
		}
		if (countryCd.equals(MRT)) {
			countryName="Mauritania";
		}
		if (countryCd.equals(MSR)) {
			countryName="Montserrat";
		}
		if (countryCd.equals(MTQ)) {
			countryName="Martinique";
		}
		if (countryCd.equals(MUS)) {
			countryName="Mauritius";
		}
		if (countryCd.equals(MWI)) {
			countryName="Malawi";
		}
		if (countryCd.equals(MYS)) {
			countryName="Malaysia";
		}
		if (countryCd.equals(MYT)) {
			countryName="Mayotte";
		}
		if (countryCd.equals(NAM)) {
			countryName="Namibia";
		}
		if (countryCd.equals(NCL)) {
			countryName="New Caledonia";
		}
		if (countryCd.equals(NER)) {
			countryName="Niger";
		}
		if (countryCd.equals(NFK)) {
			countryName="Norfolk Island";
		}
		if (countryCd.equals(NGA)) {
			countryName="Nigeria";
		}
		if (countryCd.equals(NIC)) {
			countryName="Nicaragua";
		}
		if (countryCd.equals(NIU)) {
			countryName="Niue";
		}
		if (countryCd.equals(NLD)) {
			countryName="Netherlands*";
		}
		if (countryCd.equals(NOR)) {
			countryName="Norway*";
		}
		if (countryCd.equals(NPL)) {
			countryName="Nepal";
		}
		if (countryCd.equals(NRU)) {
			countryName="Nauru";
		}
		if (countryCd.equals(NZL)) {
			countryName="New Zealand*";
		}
		if (countryCd.equals(OMN)) {
			countryName="Oman";
		}
		if (countryCd.equals(PAK)) {
			countryName="Pakistan";
		}
		if (countryCd.equals(PAN)) {
			countryName="Panama";
		}
		if (countryCd.equals(PCN)) {
			countryName="Pitcairn Islands";
		}
		if (countryCd.equals(PER)) {
			countryName="Peru";
		}
		if (countryCd.equals(PHL)) {
			countryName="Philippines";
		}
		if (countryCd.equals(PLW)) {
			countryName="Palau";
		}
		if (countryCd.equals(PNG)) {
			countryName="Papua New Guinea";
		}
		if (countryCd.equals(POL)) {
			countryName="Poland";
		}
		if (countryCd.equals(PRI)) {
			countryName="Puerto Rico";
		}
		if (countryCd.equals(PRK)) {
			countryName="Korea, North";
		}
		if (countryCd.equals(PRT)) {
			countryName="Portugal*";
		}
		if (countryCd.equals(PRY)) {
			countryName="Paraguay";
		}
		if (countryCd.equals(PSE)) {
			countryName="Gaza Strip";
		}
		if (countryCd.equals(PYF)) {
			countryName="French Polynesia";
		}
		if (countryCd.equals(QAT)) {
			countryName="Qatar";
		}
		if (countryCd.equals(REU)) {
			countryName="Reunion";
		}
		if (countryCd.equals(RKS)) {
			countryName="Republic of Kosovo";
		}
		if (countryCd.equals(ROU)) {
			countryName="Romania";
		}
		if (countryCd.equals(RUS)) {
			countryName="Russia";
		}
		if (countryCd.equals(RWA)) {
			countryName="Rwanda";
		}
		if (countryCd.equals(SAU)) {
			countryName="Saudi Arabia";
		}
		if (countryCd.equals(SDN)) {
			countryName="Sudan";
		}
		if (countryCd.equals(SEN)) {
			countryName="Senegal";
		}
		if (countryCd.equals(SGP)) {
			countryName="Singapore*";
		}
		if (countryCd.equals(SGS)) {
			countryName="South Georgia and the Islands";
		}
		if (countryCd.equals(SHN)) {
			countryName="Saint Helena";
		}
		if (countryCd.equals(SJM)) {
			countryName="Svalbard";
		}
		if (countryCd.equals(SLB)) {
			countryName="Solomon Islands";
		}
		if (countryCd.equals(SLE)) {
			countryName="Sierra Leone";
		}
		if (countryCd.equals(SLV)) {
			countryName="El Salvador";
		}
		if (countryCd.equals(SMR)) {
			countryName="San Marino*";
		}
		if (countryCd.equals(SOM)) {
			countryName="Somalia";
		}
		if (countryCd.equals(SPM)) {
			countryName="Saint Pierre and Miquelon";
		}
		if (countryCd.equals(SRB)) {
			countryName="Serbia";
		}
		if (countryCd.equals(SSD)) {
			countryName="South Sudan";
		}
		if (countryCd.equals(STP)) {
			countryName="Sao Tome and Principe";
		}
		if (countryCd.equals(SUR)) {
			countryName="Suriname";
		}
		if (countryCd.equals(SVK)) {
			countryName="Slovakia*";
		}
		if (countryCd.equals(SVN)) {
			countryName="Slovenia*";
		}
		if (countryCd.equals(SWE)) {
			countryName="Sweden*";
		}
		if (countryCd.equals(SWZ)) {
			countryName="Swaziland";
		}
		if (countryCd.equals(SXM)) {
			countryName="Sint Maarten";
		}
		if (countryCd.equals(SYC)) {
			countryName="Seychelles";
		}
		if (countryCd.equals(SYR)) {
			countryName="Syria";
		}
		if (countryCd.equals(TCA)) {
			countryName="Turks and Caicos Islands";
		}
		if (countryCd.equals(TCD)) {
			countryName="Chad";
		}
		if (countryCd.equals(TGO)) {
			countryName="Togo";
		}
		if (countryCd.equals(THA)) {
			countryName="Thailand";
		}
		if (countryCd.equals(TJK)) {
			countryName="Tajikistan";
		}
		if (countryCd.equals(TKL)) {
			countryName="Tokelau";
		}
		if (countryCd.equals(TKM)) {
			countryName="Turkmenistan";
		}
		if (countryCd.equals(TLS)) {
			countryName="Timor-Leste";
		}
		if (countryCd.equals(TON)) {
			countryName="Tonga";
		}
		if (countryCd.equals(TTO)) {
			countryName="Trinidad and Tobago";
		}
		if (countryCd.equals(TUN)) {
			countryName="Tunisia";
		}
		if (countryCd.equals(TUR)) {
			countryName="Turkey";
		}
		if (countryCd.equals(TUV)) {
			countryName="Tuvalu";
		}
		if (countryCd.equals(TWN)) {
			countryName="Taiwan*";
		}
		if (countryCd.equals(TZA)) {
			countryName="Tanzania";
		}
		if (countryCd.equals(UGA)) {
			countryName="Uganda";
		}
		if (countryCd.equals(UKR)) {
			countryName="Ukraine";
		}
		if (countryCd.equals(UMI)) {
			countryName="United States Minor Outlying Islands";
		}
		if (countryCd.equals(UNO)) {
			countryName="United Nations";
		}
		if (countryCd.equals(URY)) {
			countryName="Uruguay";
		}
		if (countryCd.equals(USA)) {
			countryName="United States";
		}
		if (countryCd.equals(UZB)) {
			countryName="Uzbekistan";
		}
		if (countryCd.equals(VAT)) {
			countryName="Holy See (Vatican City)";
		}
		if (countryCd.equals(VCT)) {
			countryName="Saint Vincent and the Grenadines";
		}
		if (countryCd.equals(VEN)) {
			countryName="Venezuela";
		}
		if (countryCd.equals(VGB)) {
			countryName="British Virgin Islands";
		}
		if (countryCd.equals(VIR)) {
			countryName="Virgin Islands";
		}
		if (countryCd.equals(VNM)) {
			countryName="Vietnam";
		}
		if (countryCd.equals(VUT)) {
			countryName="Vanuatu";
		}
		if (countryCd.equals(WAK)) {
			countryName="Wake Island";
		}
		if (countryCd.equals(WLF)) {
			countryName="Wallis and Futuna";
		}
		if (countryCd.equals(WSM)) {
			countryName="Samoa";
		}
		if (countryCd.equals(XXB)) {
			countryName="1951 Convention Refugee Status";
		}
		if (countryCd.equals(XXC)) {
			countryName="Refugee, Other";
		}
		if (countryCd.equals(XXX)) {
			countryName="Person Of Unspecified Nationality";
		}
		if (countryCd.equals(YEM)) {
			countryName="Yemen";
		}
		if (countryCd.equals(YMD)) {
			countryName="Democratic Yemen";
		}
		if (countryCd.equals(ZAF)) {
			countryName="South Africa";
		}
		if (countryCd.equals(ZAR)) {
			countryName="Zaire";
		}
		if (countryCd.equals(ZMB)) {
			countryName="Zambia";
		}
		if (countryCd.equals(ZWE)) {
			countryName="Zimbabwe";
		}

		return countryName;
	}
	public void screenPrint() throws IOException 
	{
		String screenshotPath = CommonFunctions.capture(driver, "screenshotForExtetReport");
		StartBrowser.childTest.pass("Print Last Page",
				MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
	}

	public static String processInput(String path) throws IOException 
	{
		//System.out.println("Here inside processInput");
		//String path = "/I94config";
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/test/java/com/abc/applications/i94"
					+ (path)+"/config.properties");

			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String urlLink = prop.getProperty("url");
		//System.out.println("Url link");
		//System.out.println(urlLink);

		return urlLink;
	}
	public void UploadFile(String filename ) throws Exception
	{
		

		Thread.sleep(500);
		//Use robot=new Robot class to upload file
		Robot robot = new Robot();
		//Store the path of the file to be uploaded using StringSelection class object


		StringSelection filepath = new StringSelection (filename);


	

		//Copy above path tom clipboard

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

		//Now press CTRL
		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(500);

		//Press V
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(500);

		//Release V
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(500);

		//Release CTRL
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(500);

		//Release V
		robot.keyPress(KeyEvent.VK_CANCEL);
		Thread.sleep(500);

		//Release CTRL
		robot.keyRelease(KeyEvent.VK_CANCEL);
		Thread.sleep(500);




		//Thread.sleep(1000);
	}
}
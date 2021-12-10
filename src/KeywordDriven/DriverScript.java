package KeywordDriven;

public class DriverScript {

	public static void main(String[] args) throws Exception {
		String spath="C:\\Users\\Sainadha\\Desktop\\TT\\methodslist.xlsx";
		ReadExcelData.setExcelFile(spath,"Sheet1");
		for(int irow=0;irow<7;irow++)
		{
			String saction=ReadExcelData.getCellData(irow,0);
			System.out.println(saction);
			if(saction.equalsIgnoreCase("openbrowser"))
			{
					Methods.openBrowser();
			}
			if(saction.equalsIgnoreCase("navigate"))
			{
					Methods.navigate();
			}
			if(saction.equalsIgnoreCase("inputUsername"))
			{
					Methods.inputUsername();
			}
			if(saction.equalsIgnoreCase("inputPassword"))
			{
					Methods.inputPassword();
			}
			if(saction.equalsIgnoreCase("verifyLogin"))
			{
					Methods.verifyLogin();
			}
			if(saction.equalsIgnoreCase("clickLogin"))
			{
					Methods.clickLogin();
			}
			if(saction.equalsIgnoreCase("closeBrowser"))
			{
					Methods.closeBrowser();
			}
			
		}
		

	}

}

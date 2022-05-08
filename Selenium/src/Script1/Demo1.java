package Script1;

import org.oorsprong.websamples.CountryInfoService;
import org.oorsprong.websamples.CountryInfoServiceSoapType;

public class Demo1 {

	public static void main(String[] args) 
	{
		CountryInfoService info=new CountryInfoService();
		CountryInfoServiceSoapType a1 = info.getCountryInfoServiceSoap();
		System.out.println(a1.capitalCity("IN"));
		System.out.println(a1.countryFlag("CN"));
	}
}

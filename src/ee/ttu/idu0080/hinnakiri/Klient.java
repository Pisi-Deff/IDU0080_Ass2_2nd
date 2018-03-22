package ee.ttu.idu0080.hinnakiri;

/**
 * Klient hinnakirja teenusele
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.xml.ws.WebServiceException;
import javax.xml.ws.soap.SOAPFaultException;

import ee.ttu.idu0080.hinnakiri.exceptions.HinnakiriNegativePriceException;
import ee.ttu.idu0080.hinnakiri.exceptions.HinnakiriNumberFormatException;
import ee.ttu.idu0080.hinnakiri.exceptions.HinnakiriPriceTooAccurateException;
import ee.ttu.idu0080.hinnakiri.exceptions.HinnakiriZeroPriceException;
import ee.ttu.idu0080.hinnakiri.service.HinnakiriService;
import ee.ttu.idu0080.hinnakiri.service.HinnakiriService_Service;
import ee.ttu.idu0080.hinnakiri.types.GetHinnakiriResponse;
import ee.ttu.idu0080.hinnakiri.types.Hinnakiri;
import ee.ttu.idu0080.hinnakiri.types.Hinnakiri.HinnakirjaRida;

/**
 * This class was generated by Apache CXF 2.2.6 Thu Mar 04 16:26:57 EET 2010
 * Generated source version: 2.2.6
 * 
 */

public final class Klient {
	private static final int MAX_ATTEMPTS = 10;

	public static void main(String args[]) throws Exception {
		URL wsdlURL = parseArguments(args);

		tryDoRequests(wsdlURL);
	}
	
	private static void tryDoRequests(URL wsdlURL) {
		for (int attempt = 0; attempt < MAX_ATTEMPTS; attempt++) {
			try {
				System.out.println("attempt " + (attempt + 1));
				
				makeRequest(wsdlURL, "999.99");
				makeRequest(wsdlURL, "12.00A");
				makeRequest(wsdlURL, "12A");
				makeRequest(wsdlURL, "12.34");
				makeRequest(wsdlURL, "12.340");
				makeRequest(wsdlURL, "12.345");
				makeRequest(wsdlURL, "12.0");
				makeRequest(wsdlURL, "-12.00");
				makeRequest(wsdlURL, "0.000");
				
				return;
			} catch (WebServiceException e) {
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e1) {}
			}
		}
		
		System.out.println("ei saa �hendust");
	}
	
	public static void makeRequest(URL wsdlURL, String sPrice) {
		System.out.println("###################");
		System.out.println("#making request with price " + sPrice);
		System.out.println("-------------------");
		
		GetHinnakiriResponse response = null;
		try {
			HinnakiriService_Service service = new HinnakiriService_Service(wsdlURL);
			HinnakiriService port = service.getHinnakiriPort();
			
			response = port.getHinnakiri(sPrice);
		} catch(HinnakiriNumberFormatException e) {
			System.out.println("Hind ei ole numbrilises formaadis");
		} catch (HinnakiriZeroPriceException e) {
			System.out.println("hind on null");
		} catch (HinnakiriPriceTooAccurateException e) {
			System.out.println("hind liiga t�pne");
		} catch (HinnakiriNegativePriceException e) {
			System.out.println("hind negatiivne");
		} catch (SOAPFaultException e) {
			System.out.println("soap fault: " + e.getMessage());
		} catch (WebServiceException e) {
			throw e;
		} catch (Throwable t) {
			System.err.println("unknown error: " + t.getMessage());
		}

		if(response == null)
			return;
		
		printToConsole(response.getHinnakiri());
		System.out.println();
	}

	/**
	 * Prindib konsoolile hinnakirja
	 * 
	 * @param hinnakiri
	 */
	private static void printToConsole(Hinnakiri hinnakiri) {

		System.out.println("Hinnakiri:");

		for (HinnakirjaRida hinnakirjaRida : hinnakiri.getHinnakirjaRida()) {
			StringBuilder outRida = new StringBuilder();
			outRida.append(hinnakirjaRida.getToode().getKood());
			outRida.append("\t");
			outRida.append(hinnakirjaRida.getToode().getNimetus());
			outRida.append("\t");
			outRida.append(hinnakirjaRida.getHind().getSumma());
			outRida.append(" ");
			outRida.append(hinnakirjaRida.getHind().getValuuta());

			System.out.println(outRida);
		}
	}

	/**
	 * Parsib välja programmi argumentide hulgast WSDL-i URL-i
	 * 
	 * @param args
	 *            argumendid
	 * @return URL
	 */
	private static URL parseArguments(String[] args) {

		URL wsdlURL = HinnakiriService_Service.WSDL_LOCATION;

		try {
			if (args.length > 0) {
				String firstArg = args[0];

				if (firstArg.startsWith("http:")) {
					wsdlURL = new URL(firstArg);
				} else {
					File wsdlFile = new File(firstArg);
					if (wsdlFile.exists()) {
						wsdlURL = wsdlFile.toURI().toURL();
					} else {
						wsdlURL = new URL(firstArg);
					}
				}
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		return wsdlURL;
	}

}

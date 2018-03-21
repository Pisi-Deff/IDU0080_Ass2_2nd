package ee.ttu.idu0080.hinnakiri.exceptions;

import javax.xml.ws.WebFault;

@WebFault(name = "HinnakiriPriceTooAccurateFault")
public class HinnakiriPriceTooAccurateException extends Exception {
    
	private HinnakiriPriceTooAccurateFault faultInfo;

    public HinnakiriPriceTooAccurateException() {
    	this("Number is in an incorrect format");
    }

    public HinnakiriPriceTooAccurateException(String message) {
        super(message);
        
        // Set fault message
        faultInfo = new HinnakiriPriceTooAccurateFault();
        faultInfo.setMessage(message);
    }
    
    public HinnakiriPriceTooAccurateException(String message, 
    		HinnakiriPriceTooAccurateFault faultInfo) {
        super(message);
        
        this.faultInfo = faultInfo;
    }

    public HinnakiriPriceTooAccurateFault getFaultInfo() {
        return faultInfo;
    }
}

package ee.ttu.idu0080.hinnakiri.exceptions;

import javax.xml.ws.WebFault;

@WebFault(name = "HinnakiriNegativePriceFault")
public class HinnakiriNegativePriceException extends Exception {
    
	private HinnakiriNegativePriceFault faultInfo;

    public HinnakiriNegativePriceException() {
    	this("Number is in an incorrect format");
    }

    public HinnakiriNegativePriceException(String message) {
        super(message);
        
        // Set fault message
        faultInfo = new HinnakiriNegativePriceFault();
        faultInfo.setMessage(message);
    }
    
    public HinnakiriNegativePriceException(String message, 
    		HinnakiriNegativePriceFault faultInfo) {
        super(message);
        
        this.faultInfo = faultInfo;
    }

    public HinnakiriNegativePriceFault getFaultInfo() {
        return faultInfo;
    }
}

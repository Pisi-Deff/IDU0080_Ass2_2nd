package ee.ttu.idu0080.hinnakiri.exceptions;

import javax.xml.ws.WebFault;

@WebFault(name = "HinnakiriZeroPriceFault")
public class HinnakiriZeroPriceException extends Exception {
    
	private HinnakiriZeroPriceFault faultInfo;

    public HinnakiriZeroPriceException() {
    	this("Number is in an incorrect format");
    }

    public HinnakiriZeroPriceException(String message) {
        super(message);
        
        // Set fault message
        faultInfo = new HinnakiriZeroPriceFault();
        faultInfo.setMessage(message);
    }
    
    public HinnakiriZeroPriceException(String message, 
    		HinnakiriZeroPriceFault faultInfo) {
        super(message);
        
        this.faultInfo = faultInfo;
    }

    public HinnakiriZeroPriceFault getFaultInfo() {
        return faultInfo;
    }
}

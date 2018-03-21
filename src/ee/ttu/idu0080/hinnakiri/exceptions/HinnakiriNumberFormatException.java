package ee.ttu.idu0080.hinnakiri.exceptions;

import javax.xml.ws.WebFault;

@WebFault(name = "HinnakiriNumberFormatFault")
public class HinnakiriNumberFormatException extends Exception {
    
	private HinnakiriNumberFormatFault faultInfo;

    public HinnakiriNumberFormatException() {
    	this("Number is in an incorrect format");
    }

    public HinnakiriNumberFormatException(String message) {
        super(message);
        
        // Set fault message
        faultInfo = new HinnakiriNumberFormatFault();
        faultInfo.setMessage(message);
    }
    
    public HinnakiriNumberFormatException(String message, 
    		HinnakiriNumberFormatFault faultInfo) {
        super(message);
        
        this.faultInfo = faultInfo;
    }

    public HinnakiriNumberFormatFault getFaultInfo() {
        return faultInfo;
    }
}

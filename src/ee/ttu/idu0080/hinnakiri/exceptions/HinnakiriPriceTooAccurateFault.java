package ee.ttu.idu0080.hinnakiri.exceptions;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "HinnakiriPriceTooAccurateFault")
public class HinnakiriPriceTooAccurateFault {
	private String message;

    public HinnakiriPriceTooAccurateFault() { }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.11 at 06:45:25 PM IST 
//


package isu.issuer_ias.xsd.ias_auth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="card_no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="card_exp_date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="card_holder_status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cvd2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="language_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tran_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hkey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cardNo",
    "cardExpDate",
    "cardHolderStatus",
    "cvd2",
    "languageCode",
    "tranId",
    "hkey"
})
@XmlRootElement(name = "paysecure")
public class Paysecure {

    @XmlElement(name = "card_no", required = true)
    protected String cardNo;
    @XmlElement(name = "card_exp_date", required = true)
    protected String cardExpDate;
    @XmlElement(name = "card_holder_status", required = true)
    protected String cardHolderStatus;
    @XmlElement(required = true)
    protected String cvd2;
    @XmlElement(name = "language_code", required = true)
    protected String languageCode;
    @XmlElement(name = "tran_id", required = true)
    protected String tranId;
    @XmlElement(required = true)
    protected String hkey;

    /**
     * Gets the value of the cardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * Sets the value of the cardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNo(String value) {
        this.cardNo = value;
    }

    /**
     * Gets the value of the cardExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardExpDate() {
        return cardExpDate;
    }

    /**
     * Sets the value of the cardExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardExpDate(String value) {
        this.cardExpDate = value;
    }

    /**
     * Gets the value of the cardHolderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderStatus() {
        return cardHolderStatus;
    }

    /**
     * Sets the value of the cardHolderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderStatus(String value) {
        this.cardHolderStatus = value;
    }

    /**
     * Gets the value of the cvd2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvd2() {
        return cvd2;
    }

    /**
     * Sets the value of the cvd2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvd2(String value) {
        this.cvd2 = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the tranId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranId() {
        return tranId;
    }

    /**
     * Sets the value of the tranId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranId(String value) {
        this.tranId = value;
    }

    /**
     * Gets the value of the hkey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHkey() {
        return hkey;
    }

    /**
     * Sets the value of the hkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHkey(String value) {
        this.hkey = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.22 at 02:36:50 PM CAT 
//


package uk.co.argon.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetadataRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetadataRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="metadata" type="{http://synapse.ominsure.co.za/webservice/scribe}MetadataList" minOccurs="0"/&gt;
 *         &lt;element name="tables" type="{http://synapse.ominsure.co.za/webservice/scribe}TableList" minOccurs="0"/&gt;
 *         &lt;element name="overlay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataRequest", propOrder = {
    "metadata",
    "tables",
    "overlay"
})
public class MetadataRequest {

    protected MetadataList metadata;
    protected TableList tables;
    protected String overlay;

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link MetadataList }
     *     
     */
    public MetadataList getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataList }
     *     
     */
    public void setMetadata(MetadataList value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the tables property.
     * 
     * @return
     *     possible object is
     *     {@link TableList }
     *     
     */
    public TableList getTables() {
        return tables;
    }

    /**
     * Sets the value of the tables property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableList }
     *     
     */
    public void setTables(TableList value) {
        this.tables = value;
    }

    /**
     * Gets the value of the overlay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverlay() {
        return overlay;
    }

    /**
     * Sets the value of the overlay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverlay(String value) {
        this.overlay = value;
    }

}
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.16 at 10:47:16 AM CAT 
//


package uk.co.argon.cdm;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.co.argon.cdm package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.co.argon.cdm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Section }
     * 
     */
    public Section createSection() {
        return new Section();
    }

    /**
     * Create an instance of {@link Moderator }
     * 
     */
    public Moderator createModerator() {
        return new Moderator();
    }

    /**
     * Create an instance of {@link Sections }
     * 
     */
    public Sections createSections() {
        return new Sections();
    }

    /**
     * Create an instance of {@link Moderators }
     * 
     */
    public Moderators createModerators() {
        return new Moderators();
    }

    /**
     * Create an instance of {@link TemplatePayload }
     * 
     */
    public TemplatePayload createTemplatePayload() {
        return new TemplatePayload();
    }

}

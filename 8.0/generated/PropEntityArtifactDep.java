
package stubs.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propEntityArtifactDep complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propEntityArtifactDep">
 *   &lt;complexContent>
 *     &lt;extension base="{}propEntity">
 *       &lt;sequence>
 *         &lt;element name="source-buildType" type="{}buildType-ref" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propEntityArtifactDep", propOrder = {
    "sourceBuildType"
})
public class PropEntityArtifactDep
    extends PropEntity
{

    @XmlElement(name = "source-buildType")
    protected BuildTypeRef sourceBuildType;

    /**
     * Gets the value of the sourceBuildType property.
     * 
     * @return
     *     possible object is
     *     {@link BuildTypeRef }
     *     
     */
    public BuildTypeRef getSourceBuildType() {
        return sourceBuildType;
    }

    /**
     * Sets the value of the sourceBuildType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildTypeRef }
     *     
     */
    public void setSourceBuildType(BuildTypeRef value) {
        this.sourceBuildType = value;
    }

}

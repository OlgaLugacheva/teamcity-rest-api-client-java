
package stubs.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for project complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="project">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parentProject" type="{}project-ref" minOccurs="0"/>
 *         &lt;element ref="{}buildTypes" minOccurs="0"/>
 *         &lt;element name="templates" type="{}buildTypes" minOccurs="0"/>
 *         &lt;element name="parameters" type="{}properties" minOccurs="0"/>
 *         &lt;element name="vcsRoots" type="{}HReference" minOccurs="0"/>
 *         &lt;element ref="{}projects" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="archived" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="webUrl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "project", propOrder = {
    "parentProject",
    "buildTypes",
    "templates",
    "parameters",
    "vcsRoots",
    "projects"
})
public class Project {

    protected ProjectRef parentProject;
    protected BuildTypes buildTypes;
    protected BuildTypes templates;
    protected Properties parameters;
    protected HReference vcsRoots;
    protected Projects projects;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "href")
    protected String href;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "archived", required = true)
    protected boolean archived;
    @XmlAttribute(name = "webUrl")
    protected String webUrl;

    /**
     * Gets the value of the parentProject property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectRef }
     *     
     */
    public ProjectRef getParentProject() {
        return parentProject;
    }

    /**
     * Sets the value of the parentProject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectRef }
     *     
     */
    public void setParentProject(ProjectRef value) {
        this.parentProject = value;
    }

    /**
     * Gets the value of the buildTypes property.
     * 
     * @return
     *     possible object is
     *     {@link BuildTypes }
     *     
     */
    public BuildTypes getBuildTypes() {
        return buildTypes;
    }

    /**
     * Sets the value of the buildTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildTypes }
     *     
     */
    public void setBuildTypes(BuildTypes value) {
        this.buildTypes = value;
    }

    /**
     * Gets the value of the templates property.
     * 
     * @return
     *     possible object is
     *     {@link BuildTypes }
     *     
     */
    public BuildTypes getTemplates() {
        return templates;
    }

    /**
     * Sets the value of the templates property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildTypes }
     *     
     */
    public void setTemplates(BuildTypes value) {
        this.templates = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link Properties }
     *     
     */
    public Properties getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Properties }
     *     
     */
    public void setParameters(Properties value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the vcsRoots property.
     * 
     * @return
     *     possible object is
     *     {@link HReference }
     *     
     */
    public HReference getVcsRoots() {
        return vcsRoots;
    }

    /**
     * Sets the value of the vcsRoots property.
     * 
     * @param value
     *     allowed object is
     *     {@link HReference }
     *     
     */
    public void setVcsRoots(HReference value) {
        this.vcsRoots = value;
    }

    /**
     * Gets the value of the projects property.
     * 
     * @return
     *     possible object is
     *     {@link Projects }
     *     
     */
    public Projects getProjects() {
        return projects;
    }

    /**
     * Sets the value of the projects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Projects }
     *     
     */
    public void setProjects(Projects value) {
        this.projects = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalId() {
        return internalId;
    }

    /**
     * Sets the value of the internalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalId(String value) {
        this.internalId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the archived property.
     * 
     */
    public boolean isArchived() {
        return archived;
    }

    /**
     * Sets the value of the archived property.
     * 
     */
    public void setArchived(boolean value) {
        this.archived = value;
    }

    /**
     * Gets the value of the webUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebUrl() {
        return webUrl;
    }

    /**
     * Sets the value of the webUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebUrl(String value) {
        this.webUrl = value;
    }

}

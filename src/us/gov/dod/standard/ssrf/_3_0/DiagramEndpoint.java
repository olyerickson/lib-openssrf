/* 
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package us.gov.dod.standard.ssrf._3_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

/**
 * <p>
 * Java class for DiagramEndpoint complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="DiagramEndpoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100"/>
 *         &lt;element name="IconType" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS25" minOccurs="0"/>
 *         &lt;element name="IconPosLeft" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN6" minOccurs="0"/>
 *         &lt;element name="IconPosTop" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN6" minOccurs="0"/>
 *         &lt;element name="PointToMultiPoint" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 *         &lt;element name="EndpointLocation" type="{urn:us:gov:dod:standard:ssrf:3.0.0}EndpointLocation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagramEndpoint", propOrder = {
  "name",
  "iconType",
  "iconPosLeft",
  "iconPosTop",
  "pointToMultiPoint",
  "endpointLocation"
})
public class DiagramEndpoint {

  @XmlElement(name = "Name", required = true)
  protected TS100 name;
  @XmlElementRef(name = "IconType", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS25> iconType;
  @XmlElementRef(name = "IconPosLeft", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN6> iconPosLeft;
  @XmlElementRef(name = "IconPosTop", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN6> iconPosTop;
  @XmlElementRef(name = "PointToMultiPoint", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCBO> pointToMultiPoint;
  @XmlElement(name = "EndpointLocation")
  protected List<EndpointLocation> endpointLocation;

  /**
   * Gets the value of the name property.
   * <p>
   * @return possible object is {@link TS100 }
   * <p>
   */
  public TS100 getName() {
    return name;
  }

  /**
   * Sets the value of the name property.
   * <p>
   * @param value allowed object is {@link TS100 }
   * <p>
   */
  public void setName(TS100 value) {
    this.name = value;
  }

  /**
   * Gets the value of the iconType property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public JAXBElement<TS25> getIconType() {
    return iconType;
  }

  /**
   * Sets the value of the iconType property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public void setIconType(JAXBElement<TS25> value) {
    this.iconType = value;
  }

  /**
   * Gets the value of the iconPosLeft property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN6 }{@code >}
   * <p>
   */
  public JAXBElement<TUN6> getIconPosLeft() {
    return iconPosLeft;
  }

  /**
   * Sets the value of the iconPosLeft property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN6 }{@code >}
   * <p>
   */
  public void setIconPosLeft(JAXBElement<TUN6> value) {
    this.iconPosLeft = value;
  }

  /**
   * Gets the value of the iconPosTop property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN6 }{@code >}
   * <p>
   */
  public JAXBElement<TUN6> getIconPosTop() {
    return iconPosTop;
  }

  /**
   * Sets the value of the iconPosTop property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN6 }{@code >}
   * <p>
   */
  public void setIconPosTop(JAXBElement<TUN6> value) {
    this.iconPosTop = value;
  }

  /**
   * Gets the value of the pointToMultiPoint property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public JAXBElement<TListCBO> getPointToMultiPoint() {
    return pointToMultiPoint;
  }

  /**
   * Sets the value of the pointToMultiPoint property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public void setPointToMultiPoint(JAXBElement<TListCBO> value) {
    this.pointToMultiPoint = value;
  }

  /**
   * Gets the value of the endpointLocation property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the endpointLocation property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getEndpointLocation().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link EndpointLocation }
   * <p>
   * <p>
   */
  public List<EndpointLocation> getEndpointLocation() {
    if (endpointLocation == null) {
      endpointLocation = new ArrayList<>();
    }
    return this.endpointLocation;
  }

}

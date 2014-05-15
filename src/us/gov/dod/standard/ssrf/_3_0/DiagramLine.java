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

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

/**
 * <p>
 * Java class for DiagramLine complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <pre>
 * &lt;complexType name="DiagramLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TxEndpointName" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100"/>
 *         &lt;element name="RxEndpointName" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100"/>
 *         &lt;element name="ConfigID" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagramLine", propOrder = {
  "txEndpointName",
  "rxEndpointName",
  "configID"
})
public class DiagramLine {

  @XmlElement(name = "TxEndpointName", required = true)
  protected TS100 txEndpointName;
  @XmlElement(name = "RxEndpointName", required = true)
  protected TS100 rxEndpointName;
  @XmlElementRef(name = "ConfigID", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS100> configID;

  /**
   * Gets the value of the txEndpointName property.
   * <p>
   * @return possible object is {@link TS100 }
   * <p>
   */
  public TS100 getTxEndpointName() {
    return txEndpointName;
  }

  /**
   * Sets the value of the txEndpointName property.
   * <p>
   * @param value allowed object is {@link TS100 }
   * <p>
   */
  public void setTxEndpointName(TS100 value) {
    this.txEndpointName = value;
  }

  /**
   * Gets the value of the rxEndpointName property.
   * <p>
   * @return possible object is {@link TS100 }
   * <p>
   */
  public TS100 getRxEndpointName() {
    return rxEndpointName;
  }

  /**
   * Sets the value of the rxEndpointName property.
   * <p>
   * @param value allowed object is {@link TS100 }
   * <p>
   */
  public void setRxEndpointName(TS100 value) {
    this.rxEndpointName = value;
  }

  /**
   * Gets the value of the configID property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS100 }{@code >}
   * <p>
   */
  public JAXBElement<TS100> getConfigID() {
    return configID;
  }

  /**
   * Sets the value of the configID property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS100 }{@code >}
   * <p>
   */
  public void setConfigID(JAXBElement<TS100> value) {
    this.configID = value;
  }

}

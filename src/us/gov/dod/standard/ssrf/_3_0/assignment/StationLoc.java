/* 
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield <jesse@caulfield.org>.
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
package us.gov.dod.standard.ssrf._3_0.assignment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.Location;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCBO;

/**
 * Java class for StationLoc complex type.
 * <p>
 * Either a satellite (locSatRef) or terrestrial location (serviceVolumeLocRef)
 * reference is required.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StationLoc", propOrder = {
  "locationExcluded",
  "locSatRef",
  "locationRadius",
  "serviceVolumeLocRef",
  "serviceVolumeRadius",
  "serviceVolumeHeight"
})
public class StationLoc {

  /**
   * LocationExcluded: Enter "Yes" to indicate that the LocSatRef is to be
   * excluded from the possible location set for the current station. If
   * omitted, a "No" SHOULD be assumed by processing applications, meaning that
   * the location is included by default.
   * <p>
   * [XSD ERR CODELIST] This data item MUST use one of the codes from Code List
   * CBO: Code Yes No
   */
  @XmlElement(name = "LocationExcluded", required = false)
  private TString locationExcluded;
  /**
   * LocSatRef: Enter the serial of a Location or Satellite dataset. When this
   * location is complex (other than a single point), that means that the
   * assignment is for a mobile inside the definition location.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be "LO
   * or SA".
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "[A-Z0-9-]{1,5}:\w{0,4}:[A-Z]{2}: \S{1,15}"
   */
  @XmlElement(name = "LocSatRef", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString locSatRef;
  /**
   * LocationRadius: Enter the radius (in km) associated with the Location to
   * produce a circle. Note that the Radius information only applies to points,
   * and should be ignored in the case of polygons and ellipses.
   */
  @XmlElement(name = "LocationRadius", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDISTANCE.class)
  private TDecimal locationRadius;
  /**
   * ServiceVolumeLocRef: Enter the unique reference of an existing Location
   * dataset.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be
   * "LO".
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "[A-Z0-9-]{1,5}:\w{0,4}:[A-Z]{2}: \S{1,15}"
   */
  @XmlElement(name = "ServiceVolumeLocRef", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString serviceVolumeLocRef;
  /**
   * ServiceVolumeRadius: Enter the radius (in km) associated with the
   * ServiceVolumeLocRef (referencing a Location) to produce a circle.
   * <p>
   * Note that the Radius information only applies to points, and should be
   * ignored in the case of polygons and ellipses.
   */
  @XmlElement(name = "ServiceVolumeRadius", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDISTANCE.class)
  private TDecimal serviceVolumeRadius;
  /**
   * ServiceVolumeHeight: Enter the flight altitude in meters of all
   * aeronautical navigational aids and air traffic control assignments for
   * radio frequencies above 30 MHz and for low-frequency beacons. The altitude
   * is always referenced to the mean sea level (MSL).
   */
  @XmlElement(name = "ServiceVolumeHeight", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterALTITUDE.class)
  private TDecimal serviceVolumeHeight;

  /**
   * Gets the value of the locationExcluded property.
   * <p>
   * @return
   */
  public TString getLocationExcluded() {
    return locationExcluded;
  }

  /**
   * Sets the value of the locationExcluded property.
   * <p>
   * @param value
   */
  public void setLocationExcluded(TString value) {
    this.locationExcluded = value;
  }

  public boolean isSetLocationExcluded() {
    return (this.locationExcluded != null);
  }

  /**
   * Gets the value of the locSatRef property.
   * <p>
   * @return
   */
  public TString getLocSatRef() {
    return locSatRef;
  }

  /**
   * Sets the value of the locSatRef property.
   * <p>
   * @param value
   */
  public void setLocSatRef(TString value) {
    this.locSatRef = value;
  }

  public boolean isSetLocSatRef() {
    return (this.locSatRef != null);
  }

  /**
   * Gets the value of the locationRadius property.
   * <p>
   * @return
   */
  public TDecimal getLocationRadius() {
    return locationRadius;
  }

  /**
   * Sets the value of the locationRadius property.
   * <p>
   * @param value
   */
  public void setLocationRadius(TDecimal value) {
    this.locationRadius = value;
  }

  public boolean isSetLocationRadius() {
    return (this.locationRadius != null);
  }

  /**
   * Gets the value of the serviceVolumeLocRef property.
   * <p>
   * @return
   */
  public TString getServiceVolumeLocRef() {
    return serviceVolumeLocRef;
  }

  /**
   * Sets the value of the serviceVolumeLocRef property.
   * <p>
   * @param value
   */
  public void setServiceVolumeLocRef(TString value) {
    this.serviceVolumeLocRef = value;
  }

  public boolean isSetServiceVolumeLocRef() {
    return (this.serviceVolumeLocRef != null);
  }

  /**
   * Gets the value of the serviceVolumeRadius property.
   * <p>
   * @return
   */
  public TDecimal getServiceVolumeRadius() {
    return serviceVolumeRadius;
  }

  /**
   * Sets the value of the serviceVolumeRadius property.
   * <p>
   * @param value
   */
  public void setServiceVolumeRadius(TDecimal value) {
    this.serviceVolumeRadius = value;
  }

  public boolean isSetServiceVolumeRadius() {
    return (this.serviceVolumeRadius != null);
  }

  /**
   * Gets the value of the serviceVolumeHeight property.
   * <p>
   * @return
   */
  public TDecimal getServiceVolumeHeight() {
    return serviceVolumeHeight;
  }

  /**
   * Sets the value of the serviceVolumeHeight property.
   * <p>
   * @param value
   */
  public void setServiceVolumeHeight(TDecimal value) {
    this.serviceVolumeHeight = value;
  }

  public boolean isSetServiceVolumeHeight() {
    return (this.serviceVolumeHeight != null);
  }

  public StationLoc withLocationExcluded(ListCBO value) {
    setLocationExcluded(new TString(value.value()));
    return this;
  }

  public StationLoc withLocSatRef(String value) {
    setLocSatRef(new TString(value));
    return this;
  }

  public StationLoc withLocationRadius(Double value) {
    setLocationRadius(new TDecimal(value));
    return this;
  }

  public StationLoc withServiceVolumeLocRef(String value) {
    setServiceVolumeLocRef(new TString(value));
    return this;
  }

  /**
   * Generate a US location reference from the indicated location.
   * <p>
   * @param value a location
   * @return the current instance
   */
  public StationLoc withServiceVolumeLocRef(Location value) {
    setServiceVolumeLocRef(value.getSerial());
    return this;
  }

  public StationLoc withServiceVolumeRadius(Double value) {
    setServiceVolumeRadius(new TDecimal(value));
    return this;
  }

  public StationLoc withServiceVolumeHeight(Double value) {
    setServiceVolumeHeight(new TDecimal(value));
    return this;
  }

}

package us.gov.dod.standard.ssrf._3_1.metadata.domains;

import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.XmlAdapterS1;
import us.gov.dod.standard.ssrf._3_1.metadata.AMetadata;

/**
 * The SSRF S1 data type.
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/28/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S1", propOrder = {"value"})
public class S1 extends AMetadata<S1> implements Comparable<S1> {

  /**
   * The value property.
   */
  @XmlValue
  @XmlJavaTypeAdapter(XmlAdapterS1.class)
  protected String value;

  /**
   * Construct a new, empty S1 instance.
   */
  public S1() {
  }

  /**
   * Construct a new S1 instance with the given initial value.
   * <p>
   * @param value The initial value.
   */
  public S1(String value) {
    this.value = value;
  }

  /**
   * Get the value of the value property.
   * <p>
   * @return the value of the value property
   */
  public String getValue() {
    return value;
  }

  /**
   * Set the value of the value property.
   * <p>
   * @param the value
   */
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Determine if the value property is configured.
   * <p>
   * @return TRUE if the value is set, FALSE if the value is null
   */
  public boolean isSetValue() {
    return this.value != null;
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetValue();
  }

  /**
   * Get a string representation of this data wrapper value.
   * <p>
   * @return The current data value.
   */
  @Override
  public String toString() {
    return this.value;
  }

  //<editor-fold defaultstate="collapsed" desc="Hashcode Equals and Comparable">
  /**
   * Hash code is based upon the value.
   * <p>
   * @return a unique hash code from the value.
   */
  @Override
  public int hashCode() {
    int hash = 7;
    hash = 97 * hash + Objects.hashCode(this.value);
    return hash;
  }

  /**
   * Equality is based upon the value.
   * <p>
   * @param obj the other object to compare.
   * @return TRUE if the values match exactly.
   */
  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    return Objects.equals(this.value, ((S1) obj).getValue());
  }

  /**
   * Comparison and sorting.
   * <p>
   * @param obj the other object to compare
   * @return the sorting order.
   */
  @Override
  public int compareTo(S1 obj) {
    if (obj == null) {
      return -1;
    }
    if (this.value == null) {
      return 1;
    }
    return this.value.compareTo(obj.getValue());
  }//</editor-fold>
}

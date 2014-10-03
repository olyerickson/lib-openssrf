/* 
 * The MIT License
 *
 * Copyright 2014 Key Bridge Global LLC.
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
package us.gov.dod.standard.ssrf._3_1.receiver;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.Receiver;
import us.gov.dod.standard.ssrf._3_1.Transmitter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCT;

/**
 * Curve defines the type of curve. It contains an indication as to whether the
 * values were measured or calculated, the numeric factor to be applied to the
 * carrier frequency to find the abscissa of the curve, a frequency to be added
 * to the carrier frequency to obtain the origin of the curve, and the
 * measurement bandwidth.
 * <p>
 * Element of {@link Receiver}, {@link Transmitter}
 * <p>
 * Sub-Element is {@link CurvePoint}
 * <p>
 * Example:
 * <pre>
 * &lt;Curve idx="1"&gt;
 *   &lt;Type cls="U"&gt;Tx RF Spectrum&lt;/Type&gt;
 *   &lt;Calculated cls="U"&gt;No&lt;/Calculated&gt;
 *   &lt;FreqFactor cls="U"&gt;1&lt;/FreqFactor&gt;
 *   &lt;FreqConst cls="U"&gt;0&lt;/FreqConst&gt;
 *   &lt;Bw cls="U"&gt;0.001&lt;/Bw&gt;
 *   &lt;CurvePoint&gt;
 *     &lt;Offset cls="U"&gt;0.025&lt;/Offset&gt;
 *     &lt;Level cls="U"&gt;-3&lt;/Level&gt;
 *   &lt;/CurvePoint&gt;
 *   &lt;CurvePoint&gt;
 *     &lt;Offset cls="U"&gt;0.05&lt;/Offset&gt;
 *     &lt;Level cls="U"&gt;-20&lt;/Level&gt;
 *   &lt;/CurvePoint&gt;
 *   &lt;CurvePoint&gt;
 *     &lt;Offset cls="U"&gt;0.1&lt;/Offset&gt;
 *     &lt;Level cls="U"&gt;-40&lt;/Level&gt;
 *   &lt;/CurvePoint&gt;
 *   &lt;CurvePoint&gt;
 *     &lt;Offset cls="U"&gt;1&lt;/Offset&gt;
 *     &lt;Level cls="U"&gt;-60&lt;/Level&gt;
 *   &lt;/CurvePoint&gt;
 * &lt;/Curve&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Curve", propOrder = {
  "type",
  "calculated",
  "freqFactor",
  "freqConst",
  "bw",
  "freqMin",
  "freqMax",
  "curvePoint"
})
public class Curve {

  /**
   * Type - Curve Type (Required)
   * <p>
   * A code defining the type of curve.
   * <p>
   * Format is L:CCT
   */
  @XmlElement(name = "Type", required = true)
  private TString type;
  /**
   * Calculated - Calculated Data Indicator (Optional)
   * <p>
   * Yes to indicate that the data was calculated, or "No" if the data is issued
   * from measurement. Leave blank if the origin of the data is not known.
   * <p>
   * Format is L:CBO
   */
  @XmlElement(name = "Calculated", required = false)
  private TString calculated;
  /**
   * FreqFactor - Curve Frequency Factor (Required)
   * <p>
   * A positive numeric multiplier of the carrier frequency. For example, enter
   * 0 to define a curve around the IF, or 1 to define a curve around the
   * carrier frequency.
   * <p>
   * Format is UN(3,1)
   */
  @XmlElement(name = "FreqFactor", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN3_1.class)
  private TDecimal freqFactor;
  /**
   * FreqConst - Curve Frequency Constant (Required)
   * <p>
   * A frequency offset (positive or negative).
   * <p>
   * Format is SN(16,9) (MHz)
   */
  @XmlElement(name = "FreqConst", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQOFFSET.class)
  private TDecimal freqConst;
  /**
   * Bw - Curve Measurement Bandwidth (Optional)
   * <p>
   * The bandwidth measurement of the curve values.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "Bw", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal bw;
  /**
   * FreqMin - Lowest Frequency of the Curve (Optional)
   * <p>
   * The lowest value of the curve frequency range.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "FreqMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMin;
  /**
   * FreqMax - Highest Frequency (Optional)
   * <p>
   * The highest value of the curve frequency range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "FreqMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMax;
  /**
   * CurvePoint (Required)
   * <p>
   * CurvePoint contains the relative frequency to add to the curve origin to
   * obtain the absolute frequency point on the curve, and the value in dB
   * (relative to the carrier for a Tx characteristic, or relative to
   * sensitivity for a Rx characteristic).
   */
  @XmlElement(name = "CurvePoint", required = true)
  private List<CurvePoint> curvePoint;
  /**
   * idx - Index (Required)
   * <p>
   * A unique index for each Curve used by this Dataset. Once an idx is used it
   * SHOULD NOT be modified during the lifetime of the Dataset; e.g., an element
   * with idx=2 will keep idx=2 even if the first occurrence (idx=1) is deleted.
   * <p>
   * Format is UN(6)
   */
  @XmlAttribute(name = "idx", required = true)
  private BigInteger idx;

  /**
   * Get a code defining the type of curve.
   * <p>
   * @return the Type value in a {@link TString} data type
   */
  public TString getType() {
    return type;
  }

  /**
   * Set a code defining the type of curve.
   * <p>
   * @param value the Type value in a {@link TString} data type
   */
  public void setType(TString value) {
    this.type = value;
  }

  /**
   * Determine if the Type is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetType() {
    return (this.type != null ? this.type.isSetValue() : false);
  }

  /**
   * Get Yes to indicate that the data was calculated, or "No" if the data is
   * issued from measurement. Leave blank if the origin of the data is not
   * known.
   * <p>
   * @return the Calculated value in a {@link TString} data type
   */
  public TString getCalculated() {
    return calculated;
  }

  /**
   * Set Yes to indicate that the data was calculated, or "No" if the data is
   * issued from measurement. Leave blank if the origin of the data is not
   * known.
   * <p>
   * @param value the Calculated value in a {@link TString} data type
   */
  public void setCalculated(TString value) {
    this.calculated = value;
  }

  /**
   * Determine if the Calculated is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCalculated() {
    return (this.calculated != null ? this.calculated.isSetValue() : false);
  }

  /**
   * Get a positive numeric multiplier of the carrier frequency. For example,
   * enter 0 to define a curve around the IF, or 1 to define a curve around the
   * carrier frequency.
   * <p>
   * @return the FreqFactor value in a {@link TDecimal} data type
   */
  public TDecimal getFreqFactor() {
    return freqFactor;
  }

  /**
   * Set a positive numeric multiplier of the carrier frequency. For example,
   * enter 0 to define a curve around the IF, or 1 to define a curve around the
   * carrier frequency.
   * <p>
   * @param value the FreqFactor value in a {@link TDecimal} data type
   */
  public void setFreqFactor(TDecimal value) {
    this.freqFactor = value;
  }

  /**
   * Determine if the FreqFactor is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqFactor() {
    return (this.freqFactor != null ? this.freqFactor.isSetValue() : false);
  }

  /**
   * Get a frequency offset (positive or negative).
   * <p>
   * @return the FreqConst value in a {@link TDecimal} data type
   */
  public TDecimal getFreqConst() {
    return freqConst;
  }

  /**
   * Set a frequency offset (positive or negative).
   * <p>
   * @param value the FreqConst value in a {@link TDecimal} data type
   */
  public void setFreqConst(TDecimal value) {
    this.freqConst = value;
  }

  /**
   * Determine if the FreqConst is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqConst() {
    return (this.freqConst != null ? this.freqConst.isSetValue() : false);
  }

  /**
   * Get the bandwidth measurement of the curve values.
   * <p>
   * @return the Bw value in a {@link TDecimal} data type
   */
  public TDecimal getBw() {
    return bw;
  }

  /**
   * Set the bandwidth measurement of the curve values.
   * <p>
   * @param value the Bw value in a {@link TDecimal} data type
   */
  public void setBw(TDecimal value) {
    this.bw = value;
  }

  /**
   * Determine if the Bw is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBw() {
    return (this.bw != null ? this.bw.isSetValue() : false);
  }

  /**
   * Get the lowest value of the curve frequency range.
   * <p>
   * @return the FreqMin value in a {@link TDecimal} data type
   */
  public TDecimal getFreqMin() {
    return freqMin;
  }

  /**
   * Set the lowest value of the curve frequency range.
   * <p>
   * @param value the FreqMin value in a {@link TDecimal} data type
   */
  public void setFreqMin(TDecimal value) {
    this.freqMin = value;
  }

  /**
   * Determine if the FreqMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqMin() {
    return (this.freqMin != null ? this.freqMin.isSetValue() : false);
  }

  /**
   * Get the highest value of the curve frequency range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * @return the FreqMax value in a {@link TDecimal} data type
   */
  public TDecimal getFreqMax() {
    return freqMax;
  }

  /**
   * Set the highest value of the curve frequency range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * @param value the FreqMax value in a {@link TDecimal} data type
   */
  public void setFreqMax(TDecimal value) {
    this.freqMax = value;
  }

  /**
   * Determine if the FreqMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqMax() {
    return (this.freqMax != null ? this.freqMax.isSetValue() : false);
  }

  /**
   * Get the CurvePoint
   * <p>
   * Complex element CurvePoint contains the relative frequency to add to the
   * curve origin to obtain the absolute frequency point on the curve, and the
   * value in dB (relative to the carrier for a Tx characteristic, or relative
   * to sensitivity for a Rx characteristic).
   * <p>
   * @return a non-null but possibly empty list of {@link CurvePoint} instances
   */
  public List<CurvePoint> getCurvePoint() {
    if (curvePoint == null) {
      curvePoint = new ArrayList<>();
    }
    return this.curvePoint;
  }

  /**
   * Determine if the CurvePoint is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCurvePoint() {
    return ((this.curvePoint != null) && (!this.curvePoint.isEmpty()));
  }

  /**
   * Clear the CurvePoint field. This sets the field to null.
   */
  public void unsetCurvePoint() {
    this.curvePoint = null;
  }

  /**
   * Get a unique index for each Curve used by this Dataset. Once an idx is used
   * it SHOULD NOT be modified during the lifetime of the Dataset; e.g., an
   * element with idx=2 will keep idx=2 even if the first occurrence (idx=1) is
   * deleted.
   * <p>
   * @return a {@link BigInteger} instance
   */
  public BigInteger getIdx() {
    return idx;
  }

  /**
   * Set a unique index for each Curve used by this Dataset. Once an idx is used
   * it SHOULD NOT be modified during the lifetime of the Dataset; e.g., an
   * element with idx=2 will keep idx=2 even if the first occurrence (idx=1) is
   * deleted.
   * <p>
   * @param value a {@link BigInteger} instance
   */
  public void setIdx(BigInteger value) {
    this.idx = value;
  }

  /**
   * Determine if the Idx is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIdx() {
    return (this.idx != null);
  }

  /**
   * Set a code defining the type of curve.
   * <p>
   * @param value An instances of type {@link ListCCT}
   * @return The current Curve object instance
   */
  public Curve withType(ListCCT value) {
    setType(new TString(value.value()));
    return this;
  }

  /**
   * Set Yes to indicate that the data was calculated, or "No" if the data is
   * issued from measurement. Leave blank if the origin of the data is not
   * known.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current Curve object instance
   */
  public Curve withCalculated(ListCBO value) {
    setCalculated(new TString(value.value()));
    return this;
  }

  /**
   * Set a positive numeric multiplier of the carrier frequency. For example,
   * enter 0 to define a curve around the IF, or 1 to define a curve around the
   * carrier frequency.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Curve object instance
   */
  public Curve withFreqFactor(Double value) {
    setFreqFactor(new TDecimal(value));
    return this;
  }

  /**
   * Set a frequency offset (positive or negative).
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Curve object instance
   */
  public Curve withFreqConst(Double value) {
    setFreqConst(new TDecimal(value));
    return this;
  }

  /**
   * Set the bandwidth measurement of the curve values.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Curve object instance
   */
  public Curve withBw(Double value) {
    setBw(new TDecimal(value));
    return this;
  }

  /**
   * Set the lowest value of the curve frequency range.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Curve object instance
   */
  public Curve withFreqMin(Double value) {
    setFreqMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the highest value of the curve frequency range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Curve object instance
   */
  public Curve withFreqMax(Double value) {
    setFreqMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the CurvePoint
   * <p>
   * Complex element CurvePoint contains the relative frequency to add to the
   * curve origin to obtain the absolute frequency point on the curve, and the
   * value in dB (relative to the carrier for a Tx characteristic, or relative
   * to sensitivity for a Rx characteristic).
   * <p>
   * @param values One or more instances of type {@link CurvePoint...}
   * @return The current Curve object instance
   */
  public Curve withCurvePoint(CurvePoint... values) {
    if (values != null) {
      getCurvePoint().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the CurvePoint
   * <p>
   * Complex element CurvePoint contains the relative frequency to add to the
   * curve origin to obtain the absolute frequency point on the curve, and the
   * value in dB (relative to the carrier for a Tx characteristic, or relative
   * to sensitivity for a Rx characteristic).
   * <p>
   * @param values A collection of {@link CurvePoint} instances
   * @return The current Curve object instance
   */
  public Curve withCurvePoint(Collection<CurvePoint> values) {
    if (values != null) {
      getCurvePoint().addAll(values);
    }
    return this;
  }

  /**
   * Set a unique index for each Curve used by this Dataset. Once an idx is used
   * it SHOULD NOT be modified during the lifetime of the Dataset; e.g., an
   * element with idx=2 will keep idx=2 even if the first occurrence (idx=1) is
   * deleted.
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current Curve object instance
   */
  public Curve withIdx(BigInteger value) {
    setIdx(value);
    return this;
  }

  /**
   * Get a string representation of this Curve instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Curve {"
      + " curvePoint [" + curvePoint + "]"
      + " idx [" + idx + "]"
      + " freqConst [" + freqConst + "]"
      + " freqMin [" + freqMin + "]"
      + " bw [" + bw + "]"
      + " freqMax [" + freqMax + "]"
      + " type [" + type + "]"
      + " freqFactor [" + freqFactor + "]"
      + " calculated [" + calculated + "]"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Curve} requires
   * {@link CurvePoint CurvePoint}, {@link TDecimal FreqConst}, {@link TDecimal FreqFactor}, {@link TString Type}, {@link BigInteger idx}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetCurvePoint() && isSetFreqConst() && isSetFreqFactor() && isSetType() && isSetIdx();
  }

}

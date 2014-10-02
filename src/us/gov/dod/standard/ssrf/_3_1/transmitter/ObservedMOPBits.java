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
package us.gov.dod.standard.ssrf._3_1.transmitter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * ObservedMOPBits (US) describes the data format for the Amplitude (AM), Phase
 * (PM), Frequency (FM) and/or Continuous Wave (CW) features of a signal
 * impressed on a Pulse.
 * <p>
 * Element of {@link ObservedMOPSequence}
 * <p>
 * Sub-Element is {@link ObservedMOPValues}
 * <p>
 * Example: See {@link ObservedMOPAnalysis}.
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservedMOPBits", propOrder = {
  "mopDutyCycle",
  "mopNumElements",
  "mopStepAM",
  "mopStepCW",
  "mopStepFM",
  "mopStepPM",
  "mopRepetionInterval",
  "bitRate",
  "bitDuration",
  "observedMOPValues"
})
public class ObservedMOPBits {

  /**
   * In Data Item US:MOPDutyCycle (US), enter as a percentage, the minimum or
   * nominal ratio of the pulse duration to the pulse period.
   */
  @XmlElement(name = "MOPDutyCycle", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterPERCENT.class)
  private TDecimal mopDutyCycle;
  /**
   * In Data Item US:MOPNumElements (US), enter the number of discrete
   * FREQ/PHASE/AMP values transmitted in a patterned sequence (i.e., any
   * repeated values are counted each time)
   */
  @XmlElement(name = "MOPNumElements", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN6.class)
  private TInteger mopNumElements;
  /**
   * In Data Item US:MOPStepAM (US), enter the difference between adjacent
   * amplitude discrete power values, within a pulse. Use of this element should
   * agree with the selection made in US:ObservedMOPAnalysis.MOPType.
   */
  @XmlElement(name = "MOPStepAM", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUNSIGNED_DB_5_2.class)
  private TDecimal mopStepAM;
  /**
   * In Data Item US:MOPStepCW(US), enter the difference between adjacent
   * continuous wave frequency discrete values, within a pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   */
  @XmlElement(name = "MOPStepCW", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_MOPFM.class)
  private TDecimal mopStepCW;
  /**
   * In Data Item US:MOPStepFM (US), enter the difference between adjacent
   * frequency discrete values, within a pulse. Use of this element should agree
   * with the selection made in US:ObservedMOPAnalysis.MOPType.
   */
  @XmlElement(name = "MOPStepFM", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_MOPFM.class)
  private TDecimal mopStepFM;
  /**
   * In Data Item US:MOPStepPM (US), enter the difference between adjacent phase
   * discrete values, within a pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType.
   */
  @XmlElement(name = "MOPStepPM", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_PHASEANGLE.class)
  private TDecimal mopStepPM;
  /**
   * US:MOPRepetionInterval - MOP Repetion Interval (Optional)
   * <p>
   * The overall interval which may include multiple Sweep Repetition Intervals
   * (SRI). Fly-back times, and dead times.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "MOPRepetionInterval", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal mopRepetionInterval;
  /**
   * US:BitRate - Bit Rate (Optional)
   * <p>
   * The rate at which the signal exhibits a change of FREQ/PHASE/AMP; inverse
   * of the minimum bit duration (e.g., a signal that has a .977 usec minimum
   * bit has a bit rate of 1024 kbit/sec).
   * <p>
   * Format is UN(10,3) (kbit/sec)
   */
  @XmlElement(name = "BitRate", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterBITRATE.class)
  private TDecimal bitRate;
  /**
   * US:BitDuration - Bit Duration (Optional)
   * <p>
   * The shortest time interval (within a pulse for pulsed signals) that a
   * discrete frequency, phase, or amplitude value stays at its state before
   * changing to a new one.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "BitDuration", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal bitDuration;

  @XmlElement(name = "ObservedMOPValues")
  private List<ObservedMOPValues> observedMOPValues;

  /**
   * Get In Data Item US:MOPDutyCycle (US), enter as a percentage, the minimum
   * or nominal ratio of the pulse duration to the pulse period.
   * <p>
   * @return the MOPDutyCycle value in a {@link TDecimal} data type
   */
  public TDecimal getMOPDutyCycle() {
    return mopDutyCycle;
  }

  /**
   * Set In Data Item US:MOPDutyCycle (US), enter as a percentage, the minimum
   * or nominal ratio of the pulse duration to the pulse period.
   * <p>
   * @param value the MOPDutyCycle value in a {@link TDecimal} data type
   */
  public void setMOPDutyCycle(TDecimal value) {
    this.mopDutyCycle = value;
  }

  /**
   * Determine if the MOPDutyCycle is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPDutyCycle() {
    return (this.mopDutyCycle != null ? this.mopDutyCycle.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPNumElements (US), enter the number of discrete
   * FREQ/PHASE/AMP values transmitted in a patterned sequence (i.e., any
   * repeated values are counted each time)
   * <p>
   * @return the MOPNumElements value in a {@link TInteger} data type
   */
  public TInteger getMOPNumElements() {
    return mopNumElements;
  }

  /**
   * Set In Data Item US:MOPNumElements (US), enter the number of discrete
   * FREQ/PHASE/AMP values transmitted in a patterned sequence (i.e., any
   * repeated values are counted each time)
   * <p>
   * @param value the MOPNumElements value in a {@link TInteger} data type
   */
  public void setMOPNumElements(TInteger value) {
    this.mopNumElements = value;
  }

  /**
   * Determine if the MOPNumElements is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPNumElements() {
    return (this.mopNumElements != null ? this.mopNumElements.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPStepAM (US), enter the difference between adjacent
   * amplitude discrete power values, within a pulse. Use of this element should
   * agree with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @return the MOPStepAM value in a {@link TDecimal} data type
   */
  public TDecimal getMOPStepAM() {
    return mopStepAM;
  }

  /**
   * Set In Data Item US:MOPStepAM (US), enter the difference between adjacent
   * amplitude discrete power values, within a pulse. Use of this element should
   * agree with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value the MOPStepAM value in a {@link TDecimal} data type
   */
  public void setMOPStepAM(TDecimal value) {
    this.mopStepAM = value;
  }

  /**
   * Determine if the MOPStepAM is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPStepAM() {
    return (this.mopStepAM != null ? this.mopStepAM.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPStepCW(US), enter the difference between adjacent
   * continuous wave frequency discrete values, within a pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @return the MOPStepCW value in a {@link TDecimal} data type
   */
  public TDecimal getMOPStepCW() {
    return mopStepCW;
  }

  /**
   * Set In Data Item US:MOPStepCW(US), enter the difference between adjacent
   * continuous wave frequency discrete values, within a pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value the MOPStepCW value in a {@link TDecimal} data type
   */
  public void setMOPStepCW(TDecimal value) {
    this.mopStepCW = value;
  }

  /**
   * Determine if the MOPStepCW is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPStepCW() {
    return (this.mopStepCW != null ? this.mopStepCW.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPStepFM (US), enter the difference between adjacent
   * frequency discrete values, within a pulse. Use of this element should agree
   * with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @return the MOPStepFM value in a {@link TDecimal} data type
   */
  public TDecimal getMOPStepFM() {
    return mopStepFM;
  }

  /**
   * Set In Data Item US:MOPStepFM (US), enter the difference between adjacent
   * frequency discrete values, within a pulse. Use of this element should agree
   * with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value the MOPStepFM value in a {@link TDecimal} data type
   */
  public void setMOPStepFM(TDecimal value) {
    this.mopStepFM = value;
  }

  /**
   * Determine if the MOPStepFM is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPStepFM() {
    return (this.mopStepFM != null ? this.mopStepFM.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPStepPM (US), enter the difference between adjacent
   * phase discrete values, within a pulse. Use of this element should agree
   * with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @return the MOPStepPM value in a {@link TDecimal} data type
   */
  public TDecimal getMOPStepPM() {
    return mopStepPM;
  }

  /**
   * Set In Data Item US:MOPStepPM (US), enter the difference between adjacent
   * phase discrete values, within a pulse. Use of this element should agree
   * with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value the MOPStepPM value in a {@link TDecimal} data type
   */
  public void setMOPStepPM(TDecimal value) {
    this.mopStepPM = value;
  }

  /**
   * Determine if the MOPStepPM is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPStepPM() {
    return (this.mopStepPM != null ? this.mopStepPM.isSetValue() : false);
  }

  /**
   * Get the overall interval which may include multiple Sweep Repetition
   * Intervals (SRI). Fly-back times, and dead times.
   * <p>
   * @return the MOPRepetionInterval value in a {@link TDecimal} data type
   */
  public TDecimal getMOPRepetionInterval() {
    return mopRepetionInterval;
  }

  /**
   * Set the overall interval which may include multiple Sweep Repetition
   * Intervals (SRI). Fly-back times, and dead times.
   * <p>
   * @param value the MOPRepetionInterval value in a {@link TDecimal} data type
   */
  public void setMOPRepetionInterval(TDecimal value) {
    this.mopRepetionInterval = value;
  }

  /**
   * Determine if the MOPRepetionInterval is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPRepetionInterval() {
    return (this.mopRepetionInterval != null ? this.mopRepetionInterval.isSetValue() : false);
  }

  /**
   * Get the rate at which the signal exhibits a change of FREQ/PHASE/AMP;
   * inverse of the minimum bit duration (e.g., a signal that has a .977 usec
   * minimum bit has a bit rate of 1024 kbit/sec).
   * <p>
   * @return the BitRate value in a {@link TDecimal} data type
   */
  public TDecimal getBitRate() {
    return bitRate;
  }

  /**
   * Set the rate at which the signal exhibits a change of FREQ/PHASE/AMP;
   * inverse of the minimum bit duration (e.g., a signal that has a .977 usec
   * minimum bit has a bit rate of 1024 kbit/sec).
   * <p>
   * @param value the BitRate value in a {@link TDecimal} data type
   */
  public void setBitRate(TDecimal value) {
    this.bitRate = value;
  }

  /**
   * Determine if the BitRate is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBitRate() {
    return (this.bitRate != null ? this.bitRate.isSetValue() : false);
  }

  /**
   * Get the shortest time interval (within a pulse for pulsed signals) that a
   * discrete frequency, phase, or amplitude value stays at its state before
   * changing to a new one.
   * <p>
   * @return the BitDuration value in a {@link TDecimal} data type
   */
  public TDecimal getBitDuration() {
    return bitDuration;
  }

  /**
   * Set the shortest time interval (within a pulse for pulsed signals) that a
   * discrete frequency, phase, or amplitude value stays at its state before
   * changing to a new one.
   * <p>
   * @param value the BitDuration value in a {@link TDecimal} data type
   */
  public void setBitDuration(TDecimal value) {
    this.bitDuration = value;
  }

  /**
   * Determine if the BitDuration is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBitDuration() {
    return (this.bitDuration != null ? this.bitDuration.isSetValue() : false);
  }

  /**
   * Get
   * <p>
   * @return a {@link List<ObservedMOPValues>} instance
   */
  public List<ObservedMOPValues> getObservedMOPValues() {
    if (observedMOPValues == null) {
      observedMOPValues = new ArrayList<>();
    }
    return this.observedMOPValues;
  }

  /**
   * Determine if the ObservedMOPValues is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObservedMOPValues() {
    return ((this.observedMOPValues != null) && (!this.observedMOPValues.isEmpty()));
  }

  /**
   * Clear the ObservedMOPValues field. This sets the field to null.
   */
  public void unsetObservedMOPValues() {
    this.observedMOPValues = null;
  }

  /**
   * Set In Data Item US:MOPDutyCycle (US), enter as a percentage, the minimum
   * or nominal ratio of the pulse duration to the pulse period.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPBits object instance
   */
  public ObservedMOPBits withMOPDutyCycle(Double value) {
    setMOPDutyCycle(new TDecimal(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPNumElements (US), enter the number of discrete
   * FREQ/PHASE/AMP values transmitted in a patterned sequence (i.e., any
   * repeated values are counted each time)
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current ObservedMOPBits object instance
   */
  public ObservedMOPBits withMOPNumElements(Integer value) {
    setMOPNumElements(new TInteger(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPStepAM (US), enter the difference between adjacent
   * amplitude discrete power values, within a pulse. Use of this element should
   * agree with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPBits object instance
   */
  public ObservedMOPBits withMOPStepAM(Double value) {
    setMOPStepAM(new TDecimal(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPStepCW(US), enter the difference between adjacent
   * continuous wave frequency discrete values, within a pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPBits object instance
   */
  public ObservedMOPBits withMOPStepCW(Double value) {
    setMOPStepCW(new TDecimal(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPStepFM (US), enter the difference between adjacent
   * frequency discrete values, within a pulse. Use of this element should agree
   * with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPBits object instance
   */
  public ObservedMOPBits withMOPStepFM(Double value) {
    setMOPStepFM(new TDecimal(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPStepPM (US), enter the difference between adjacent
   * phase discrete values, within a pulse. Use of this element should agree
   * with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPBits object instance
   */
  public ObservedMOPBits withMOPStepPM(Double value) {
    setMOPStepPM(new TDecimal(value));
    return this;
  }

  /**
   * Set the overall interval which may include multiple Sweep Repetition
   * Intervals (SRI). Fly-back times, and dead times.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPBits object instance
   */
  public ObservedMOPBits withMOPRepetionInterval(Double value) {
    setMOPRepetionInterval(new TDecimal(value));
    return this;
  }

  /**
   * Set the rate at which the signal exhibits a change of FREQ/PHASE/AMP;
   * inverse of the minimum bit duration (e.g., a signal that has a .977 usec
   * minimum bit has a bit rate of 1024 kbit/sec).
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPBits object instance
   */
  public ObservedMOPBits withBitRate(Double value) {
    setBitRate(new TDecimal(value));
    return this;
  }

  /**
   * Set the shortest time interval (within a pulse for pulsed signals) that a
   * discrete frequency, phase, or amplitude value stays at its state before
   * changing to a new one.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPBits object instance
   */
  public ObservedMOPBits withBitDuration(Double value) {
    setBitDuration(new TDecimal(value));
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link ObservedMOPValues...}
   * @return The current ObservedMOPBits object instance
   */
  public ObservedMOPBits withObservedMOPValues(ObservedMOPValues... values) {
    if (values != null) {
      getObservedMOPValues().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link ObservedMOPValues} instances
   * @return The current ObservedMOPBits object instance
   */
  public ObservedMOPBits withObservedMOPValues(Collection<ObservedMOPValues> values) {
    if (values != null) {
      getObservedMOPValues().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this ObservedMOPBits instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "ObservedMOPBits {"
      + " mopNumElements [" + mopNumElements + "]"
      + " mopRepetionInterval [" + mopRepetionInterval + "]"
      + " mopStepAM [" + mopStepAM + "]"
      + " observedMOPValues [" + observedMOPValues + "]"
      + " mopStepCW [" + mopStepCW + "]"
      + " bitDuration [" + bitDuration + "]"
      + " mopDutyCycle [" + mopDutyCycle + "]"
      + " bitRate [" + bitRate + "]"
      + " mopStepPM [" + mopStepPM + "]"
      + " mopStepFM [" + mopStepFM + "]"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ObservedMOPBits} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
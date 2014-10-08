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
package us.gov.dod.standard.ssrf._3_1.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.multiple.Usage;
import us.gov.dod.standard.ssrf._3_1.toa.StnClass;

/**
 * Enumerated values for fields using the ListUSC type.
 * <p>
 * Used in {@link StnClass}, {@link Usage}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListUSC")
@XmlEnum
public enum ListUSC {

  AL("AL"),
  ALA("ALA"),
  ALB("ALB"),
  ALC("ALC"),
  ALG("ALG"),
  ALL("ALL"),
  ALO("ALO"),
  ALR("ALR"),
  ALS("ALS"),
  ALTM("ALTM"),
  ALTO("ALTO"),
  AM("AM"),
  AMA("AMA"),
  APX("APX"),
  @XmlEnumValue("APX2")
  APX_2("APX2"),
  AT("AT"),
  AX("AX"),
  @XmlEnumValue("AX2")
  AX_2("AX2"),
  BC("BC"),
  BT("BT"),
  DAMS("DAMS"),
  DARS("DARS"),
  DBS("DBS"),
  DFSS("DFSS"),
  DGP("DGP"),
  DHFS("DHFS"),
  DLMS("DLMS"),
  DMMS("DMMS"),
  DMSS("DMSS"),
  DTH("DTH"),
  @XmlEnumValue("E1")
  E_1("E1"),
  @XmlEnumValue("E2")
  E_2("E2"),
  @XmlEnumValue("E3")
  E_3("E3"),
  @XmlEnumValue("E4")
  E_4("E4"),
  EA("EA"),
  EB("EB"),
  EC("EC"),
  ED("ED"),
  EE("EE"),
  EESS("EESS"),
  EF("EF"),
  EG("EG"),
  EH("EH"),
  EI("EI"),
  EJ("EJ"),
  EK("EK"),
  ELT("ELT"),
  @XmlEnumValue("ELT1")
  ELT_1("ELT1"),
  EM("EM"),
  EMER("EMER"),
  EMSS("EMSS"),
  EN("EN"),
  EO("EO"),
  EQ("EQ"),
  ER("ER"),
  ES("ES"),
  ESV("ESV"),
  ET("ET"),
  EU("EU"),
  EV("EV"),
  EW("EW"),
  EX("EX"),
  EY("EY"),
  FA("FA"),
  @XmlEnumValue("FA1")
  FA_1("FA1"),
  @XmlEnumValue("FA2")
  FA_2("FA2"),
  FAA("FAA"),
  @XmlEnumValue("FAA1")
  FAA_1("FAA1"),
  @XmlEnumValue("FAA2")
  FAA_2("FAA2"),
  FAB("FAB"),
  FAC("FAC"),
  FAD("FAD"),
  FAS("FAS"),
  @XmlEnumValue("FAS1")
  FAS_1("FAS1"),
  FAT("FAT"),
  @XmlEnumValue("FAT1")
  FAT_1("FAT1"),
  @XmlEnumValue("FAT3")
  FAT_3("FAT3"),
  FB("FB"),
  @XmlEnumValue("FB2")
  FB_2("FB2"),
  @XmlEnumValue("FB2A")
  FB_2_A("FB2A"),
  @XmlEnumValue("FB2C")
  FB_2_C("FB2C"),
  @XmlEnumValue("FB2I")
  FB_2_I("FB2I"),
  @XmlEnumValue("FB2J")
  FB_2_J("FB2J"),
  @XmlEnumValue("FB2K")
  FB_2_K("FB2K"),
  @XmlEnumValue("FB2L")
  FB_2_L("FB2L"),
  @XmlEnumValue("FB2S")
  FB_2_S("FB2S"),
  @XmlEnumValue("FB2T")
  FB_2_T("FB2T"),
  @XmlEnumValue("FB4")
  FB_4("FB4"),
  @XmlEnumValue("FB4C")
  FB_4_C("FB4C"),
  @XmlEnumValue("FB4I")
  FB_4_I("FB4I"),
  @XmlEnumValue("FB4J")
  FB_4_J("FB4J"),
  @XmlEnumValue("FB4K")
  FB_4_K("FB4K"),
  @XmlEnumValue("FB4S")
  FB_4_S("FB4S"),
  @XmlEnumValue("FB4T")
  FB_4_T("FB4T"),
  @XmlEnumValue("FB6")
  FB_6("FB6"),
  @XmlEnumValue("FB6C")
  FB_6_C("FB6C"),
  @XmlEnumValue("FB6I")
  FB_6_I("FB6I"),
  @XmlEnumValue("FB6J")
  FB_6_J("FB6J"),
  @XmlEnumValue("FB6K")
  FB_6_K("FB6K"),
  @XmlEnumValue("FB6L")
  FB_6_L("FB6L"),
  @XmlEnumValue("FB6S")
  FB_6_S("FB6S"),
  @XmlEnumValue("FB6T")
  FB_6_T("FB6T"),
  @XmlEnumValue("FB7")
  FB_7("FB7"),
  @XmlEnumValue("FB7C")
  FB_7_C("FB7C"),
  @XmlEnumValue("FB7J")
  FB_7_J("FB7J"),
  @XmlEnumValue("FB7T")
  FB_7_T("FB7T"),
  @XmlEnumValue("FB8")
  FB_8("FB8"),
  @XmlEnumValue("FB8A")
  FB_8_A("FB8A"),
  @XmlEnumValue("FB8C")
  FB_8_C("FB8C"),
  @XmlEnumValue("FB8I")
  FB_8_I("FB8I"),
  @XmlEnumValue("FB8J")
  FB_8_J("FB8J"),
  @XmlEnumValue("FB8L")
  FB_8_L("FB8L"),
  @XmlEnumValue("FB8S")
  FB_8_S("FB8S"),
  @XmlEnumValue("FB8T")
  FB_8_T("FB8T"),
  FBA("FBA"),
  FBAT("FBAT"),
  FBBS("FBBS"),
  FBC("FBC"),
  FBCT("FBCT"),
  FBD("FBD"),
  FBGS("FBGS"),
  FBI("FBI"),
  FBJ("FBJ"),
  FBK("FBK"),
  FBL("FBL"),
  FBS("FBS"),
  FBSI("FBSI"),
  FBST("FBST"),
  FBT("FBT"),
  FC("FC"),
  FCA("FCA"),
  @XmlEnumValue("FCA2")
  FCA_2("FCA2"),
  FCB("FCB"),
  FCD("FCD"),
  FCL("FCL"),
  @XmlEnumValue("FCL2")
  FCL_2("FCL2"),
  FCU("FCU"),
  @XmlEnumValue("FCU1")
  FCU_1("FCU1"),
  FD("FD"),
  FDBS("FDBS"),
  FG("FG"),
  FIS("FIS"),
  FL("FL"),
  FLD("FLD"),
  FLE("FLE"),
  FLEA("FLEA"),
  FLEB("FLEB"),
  FLEC("FLEC"),
  FLFS("FLFS"),
  FLH("FLH"),
  FLU("FLU"),
  @XmlEnumValue("FLU1")
  FLU_1("FLU1"),
  FLW("FLW"),
  @XmlEnumValue("FMA1")
  FMA_1("FMA1"),
  FP("FP"),
  FR("FR"),
  FSS("FSS"),
  FSSF("FSSF"),
  FX("FX"),
  @XmlEnumValue("FX1")
  FX_1("FX1"),
  @XmlEnumValue("FX1A")
  FX_1_A("FX1A"),
  @XmlEnumValue("FX1C")
  FX_1_C("FX1C"),
  @XmlEnumValue("FX1I")
  FX_1_I("FX1I"),
  @XmlEnumValue("FX1J")
  FX_1_J("FX1J"),
  @XmlEnumValue("FX1K")
  FX_1_K("FX1K"),
  @XmlEnumValue("FX1L")
  FX_1_L("FX1L"),
  @XmlEnumValue("FX1S")
  FX_1_S("FX1S"),
  @XmlEnumValue("FX1T")
  FX_1_T("FX1T"),
  @XmlEnumValue("FX2")
  FX_2("FX2"),
  @XmlEnumValue("FX2C")
  FX_2_C("FX2C"),
  @XmlEnumValue("FX2I")
  FX_2_I("FX2I"),
  @XmlEnumValue("FX2J")
  FX_2_J("FX2J"),
  @XmlEnumValue("FX2K")
  FX_2_K("FX2K"),
  @XmlEnumValue("FX2L")
  FX_2_L("FX2L"),
  @XmlEnumValue("FX2S")
  FX_2_S("FX2S"),
  @XmlEnumValue("FX2T")
  FX_2_T("FX2T"),
  @XmlEnumValue("FX3")
  FX_3("FX3"),
  @XmlEnumValue("FX3C")
  FX_3_C("FX3C"),
  @XmlEnumValue("FX3J")
  FX_3_J("FX3J"),
  @XmlEnumValue("FX3S")
  FX_3_S("FX3S"),
  @XmlEnumValue("FX3T")
  FX_3_T("FX3T"),
  @XmlEnumValue("FX5")
  FX_5("FX5"),
  FXC("FXC"),
  FXCO("FXCO"),
  FXCT("FXCT"),
  FXD("FXD"),
  FXDI("FXDI"),
  FXE("FXE"),
  FXH("FXH"),
  FXI("FXI"),
  FXIO("FXIO"),
  FXK("FXK"),
  FXO("FXO"),
  FXOC("FXOC"),
  FXOI("FXOI"),
  FXOJ("FXOJ"),
  FXOS("FXOS"),
  FXOT("FXOT"),
  FXRP("FXRP"),
  FXRX("FXRX"),
  FXS("FXS"),
  FXSB("FXSB"),
  FXT("FXT"),
  FXTS("FXTS"),
  GCO("GCO"),
  GS("GS"),
  IAMS("IAMS"),
  IFLM("IFLM"),
  IFSS("IFSS"),
  IMMS("IMMS"),
  IMSS("IMSS"),
  LR("LR"),
  LRT("LRT"),
  MA("MA"),
  MAD("MAD"),
  MAP("MAP"),
  ME("ME"),
  MFL("MFL"),
  @XmlEnumValue("MFL1")
  MFL_1("MFL1"),
  @XmlEnumValue("MFL2")
  MFL_2("MFL2"),
  MFX("MFX"),
  ML("ML"),
  MLD("MLD"),
  MLP("MLP"),
  MMS("MMS"),
  MO("MO"),
  @XmlEnumValue("MO3")
  MO_3("MO3"),
  @XmlEnumValue("MO3C")
  MO_3_C("MO3C"),
  @XmlEnumValue("MO3I")
  MO_3_I("MO3I"),
  @XmlEnumValue("MO5")
  MO_5("MO5"),
  @XmlEnumValue("MO6")
  MO_6("MO6"),
  @XmlEnumValue("MO6C")
  MO_6_C("MO6C"),
  @XmlEnumValue("MO6I")
  MO_6_I("MO6I"),
  @XmlEnumValue("MO6L")
  MO_6_L("MO6L"),
  @XmlEnumValue("MO6S")
  MO_6_S("MO6S"),
  @XmlEnumValue("MO7")
  MO_7("MO7"),
  @XmlEnumValue("MO7C")
  MO_7_C("MO7C"),
  @XmlEnumValue("MO7I")
  MO_7_I("MO7I"),
  @XmlEnumValue("MO7L")
  MO_7_L("MO7L"),
  @XmlEnumValue("MO8")
  MO_8("MO8"),
  @XmlEnumValue("MO8A")
  MO_8_A("MO8A"),
  @XmlEnumValue("MO8C")
  MO_8_C("MO8C"),
  MOA("MOA"),
  MOB("MOB"),
  MOC("MOC"),
  MOD("MOD"),
  MOE("MOE"),
  MOEA("MOEA"),
  MOEB("MOEB"),
  MOEC("MOEC"),
  MOH("MOH"),
  MOI("MOI"),
  MOL("MOL"),
  MOP("MOP"),
  MOS("MOS"),
  MOT("MOT"),
  MOU("MOU"),
  @XmlEnumValue("MOU1")
  MOU_1("MOU1"),
  MR("MR"),
  MRP("MRP"),
  MRT("MRT"),
  @XmlEnumValue("MRT2")
  MRT_2("MRT2"),
  MS("MS"),
  MSC("MSC"),
  MSD("MSD"),
  MSP("MSP"),
  MSR("MSR"),
  MSS("MSS"),
  NL("NL"),
  NLC("NLC"),
  NLM("NLM"),
  NR("NR"),
  OD("OD"),
  OE("OE"),
  OTH("OTH"),
  PA("PA"),
  PL("PL"),
  PLAN("PLAN"),
  RA("RA"),
  RCO("RCO"),
  RDS("RDS"),
  RG("RG"),
  RLA("RLA"),
  RLB("RLB"),
  @XmlEnumValue("RLB1")
  RLB_1("RLB1"),
  @XmlEnumValue("RLB2")
  RLB_2("RLB2"),
  RLC("RLC"),
  @XmlEnumValue("RLC2")
  RLC_2("RLC2"),
  RLD("RLD"),
  RLG("RLG"),
  RLL("RLL"),
  RLO("RLO"),
  RLR("RLR"),
  RLT("RLT"),
  @XmlEnumValue("RLT1")
  RLT_1("RLT1"),
  RM("RM"),
  RN("RN"),
  RNL("RNL"),
  RNV("RNV"),
  RPC("RPC"),
  SA("SA"),
  SAR("SAR"),
  @XmlEnumValue("SAR1")
  SAR_1("SAR1"),
  SM("SM"),
  SMB("SMB"),
  SMD("SMD"),
  SMRG("SMRG"),
  SN("SN"),
  SP("SP"),
  SS("SS"),
  TA("TA"),
  TB("TB"),
  TC("TC"),
  TD("TD"),
  TE("TE"),
  TF("TF"),
  TG("TG"),
  TH("TH"),
  TI("TI"),
  TJ("TJ"),
  TK("TK"),
  TL("TL"),
  TM("TM"),
  TN("TN"),
  TO("TO"),
  TP("TP"),
  TQ("TQ"),
  TR("TR"),
  TS("TS"),
  TT("TT"),
  TU("TU"),
  TV("TV"),
  TW("TW"),
  TX("TX"),
  TY("TY"),
  TZ("TZ"),
  UA("UA"),
  UB("UB"),
  UD("UD"),
  UE("UE"),
  UH("UH"),
  UK("UK"),
  UM("UM"),
  UN("UN"),
  UR("UR"),
  UT("UT"),
  UV("UV"),
  UW("UW"),
  UY("UY"),
  VA("VA"),
  WDX("WDX"),
  WDXT("WDXT"),
  X("X"),
  XC("XC"),
  XD("XD"),
  XE("XE"),
  XM("XM"),
  XR("XR"),
  XT("XT");
  private final String value;

  ListUSC(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListUSC fromValue(String v) {
    for (ListUSC c : ListUSC.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}

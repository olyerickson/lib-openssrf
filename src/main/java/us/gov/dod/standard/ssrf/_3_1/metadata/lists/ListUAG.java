/*
 * Copyright 2015 Key Bridge LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package us.gov.dod.standard.ssrf._3_1.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.IntfReport;

/**
 * Enumerated values for fields using the ListUAG type.
 * <p>
 * Used in {@link IntfReport}
 * <p>
 * @author Key Bridge LLC &lt;developer@keybridge.ch&gt;
 * @version 3.1.0, 04/02/2015
 */
@XmlType(name = "ListUAG")
@XmlEnum
public enum ListUAG {

  AFRICOM,
  CENTCOM,
  EUCOM,
  JFCOM,
  NORTHCOM,
  PACOM,
  SOCOM,
  SOUTHCOM,
  STRATCOM,
  TRANSCOM,
  OTHER;

  public String value() {
    return name();
  }

  public static ListUAG fromValue(String v) {
    return valueOf(v);
  }

}

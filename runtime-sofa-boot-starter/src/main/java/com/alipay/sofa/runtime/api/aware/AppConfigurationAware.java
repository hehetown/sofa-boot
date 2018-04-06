/**
 * Copyright Notice: This software is developed by Ant Small and Micro Financial Services Group Co., Ltd. This software and all the relevant information, including but not limited to any signs, images, photographs, animations, text, interface design,
 *  audios and videos, and printed materials, are protected by copyright laws and other intellectual property laws and treaties.
 *  The use of this software shall abide by the laws and regulations as well as Software Installation License Agreement/Software Use Agreement updated from time to time.
 *   Without authorization from Ant Small and Micro Financial Services Group Co., Ltd., no one may conduct the following actions:
 *
 *   1) reproduce, spread, present, set up a mirror of, upload, download this software;
 *
 *   2) reverse engineer, decompile the source code of this software or try to find the source code in any other ways;
 *
 *   3) modify, translate and adapt this software, or develop derivative products, works, and services based on this software;
 *
 *   4) distribute, lease, rent, sub-license, demise or transfer any rights in relation to this software, or authorize the reproduction of this software on other’s computers.
 */
package com.alipay.sofa.runtime.api.aware;

import com.alipay.sofa.runtime.api.component.AppConfiguration;
import org.springframework.beans.factory.annotation.Value;

/**
 * Interface used to implemented by a Spring bean who want to get the SOFA configuration of current application. Sample
 * usage:
 *
 * <pre>
 * public class SampleConfigurationBean implements AppConfigurationAware {
 *
 *     private AppConfiguration appConfiguration;
 *
 *     &#064;Override
 *     public void setAppConfiguration(AppConfiguration appConfiguration) {
 *         this.appConfiguration = appConfiguration;
 *     }
 * }
 * </pre>
 *
 * Deprecated, you should use {@link Value} instead
 * @author xuanbei 18/3/5
 */
@Deprecated
public interface AppConfigurationAware {

    /**
     * Set the SOFA configuration of current application to the Spring bean implemented this class
     *
     * @param appConfiguration The SOFA configuration of current application.
     */
    void setAppConfiguration(AppConfiguration appConfiguration);
}

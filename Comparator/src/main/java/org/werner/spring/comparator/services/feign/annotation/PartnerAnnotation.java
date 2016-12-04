package org.werner.spring.comparator.services.feign.annotation;

import org.werner.spring.comparator.services.feign.dto.PartnerEnum;

/**
 * Created by Werner on 2016/11/18.
 */
public @interface PartnerAnnotation {
    PartnerEnum partner();
}

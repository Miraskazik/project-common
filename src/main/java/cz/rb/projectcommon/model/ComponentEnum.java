package cz.rb.projectcommon.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ComponentEnum {

    BC_DOG("bc-dog"),
    BC_CUSTOMER("bc_customer"),
    ;

    private final String componentName;
}

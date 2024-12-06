package cz.rb.projectcommon.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GenderEnum {
    INVALID("invalid"),
    MALE("male"),
    FEMALE("female");

    private final String value;
}

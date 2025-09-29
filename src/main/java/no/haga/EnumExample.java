package no.haga;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EnumExample {
    AUTOMATIC("AUTOMATIC");

    private final String value;
}
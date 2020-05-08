package org.sophize.datamodel;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum TruthValue {
    CONTRADICTION, FALSE, TRUE, UNKNOWN;

    @JsonValue
    public String toValue() {
        switch (this) {
        case CONTRADICTION: return "CONTRADICTION";
        case FALSE: return "FALSE";
        case TRUE: return "TRUE";
        case UNKNOWN: return "UNKNOWN";
        }
        return null;
    }

    @JsonCreator
    public static TruthValue forValue(String value) throws IOException {
        if (value.equals("CONTRADICTION")) return CONTRADICTION;
        if (value.equals("FALSE")) return FALSE;
        if (value.equals("TRUE")) return TRUE;
        if (value.equals("UNKNOWN")) return UNKNOWN;
        throw new IOException("Cannot deserialize TruthValue");
    }
}

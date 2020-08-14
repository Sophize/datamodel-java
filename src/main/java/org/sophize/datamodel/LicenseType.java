package org.sophize.datamodel;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum LicenseType {
    CC0, CC_BY, CC_BY_NC, CC_BY_NC_ND, CC_BY_NC_SA, CC_BY_ND, CC_BY_SA, GNU_GPL, MIT, UNKNOWN;

    @JsonValue
    public String toValue() {
        switch (this) {
        case CC0: return "CC0";
        case CC_BY: return "CC_BY";
        case CC_BY_NC: return "CC_BY_NC";
        case CC_BY_NC_ND: return "CC_BY_NC_ND";
        case CC_BY_NC_SA: return "CC_BY_NC_SA";
        case CC_BY_ND: return "CC_BY_ND";
        case CC_BY_SA: return "CC_BY_SA";
        case GNU_GPL: return "GNU_GPL";
        case MIT: return "MIT";
        case UNKNOWN: return "UNKNOWN";
        }
        return null;
    }

    @JsonCreator
    public static LicenseType forValue(String value) throws IOException {
        if (value.equals("CC0")) return CC0;
        if (value.equals("CC_BY")) return CC_BY;
        if (value.equals("CC_BY_NC")) return CC_BY_NC;
        if (value.equals("CC_BY_NC_ND")) return CC_BY_NC_ND;
        if (value.equals("CC_BY_NC_SA")) return CC_BY_NC_SA;
        if (value.equals("CC_BY_ND")) return CC_BY_ND;
        if (value.equals("CC_BY_SA")) return CC_BY_SA;
        if (value.equals("GNU_GPL")) return GNU_GPL;
        if (value.equals("MIT")) return MIT;
        if (value.equals("UNKNOWN")) return UNKNOWN;
        throw new IOException("Cannot deserialize LicenseType");
    }
}

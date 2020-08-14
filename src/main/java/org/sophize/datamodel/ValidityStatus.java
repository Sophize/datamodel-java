package org.sophize.datamodel;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ValidityStatus {
    AUTO_APPROVED, MACHINE_APPROVED, MACHINE_DENIED, MANUAL_APPROVED, MANUAL_DENIED, REQUESTED_APPROVAL, UNAPPROVED, UNKNOWN;

    @JsonValue
    public String toValue() {
        switch (this) {
        case AUTO_APPROVED: return "AUTO_APPROVED";
        case MACHINE_APPROVED: return "MACHINE_APPROVED";
        case MACHINE_DENIED: return "MACHINE_DENIED";
        case MANUAL_APPROVED: return "MANUAL_APPROVED";
        case MANUAL_DENIED: return "MANUAL_DENIED";
        case REQUESTED_APPROVAL: return "REQUESTED_APPROVAL";
        case UNAPPROVED: return "UNAPPROVED";
        case UNKNOWN: return "UNKNOWN";
        }
        return null;
    }

    @JsonCreator
    public static ValidityStatus forValue(String value) throws IOException {
        if (value.equals("AUTO_APPROVED")) return AUTO_APPROVED;
        if (value.equals("MACHINE_APPROVED")) return MACHINE_APPROVED;
        if (value.equals("MACHINE_DENIED")) return MACHINE_DENIED;
        if (value.equals("MANUAL_APPROVED")) return MANUAL_APPROVED;
        if (value.equals("MANUAL_DENIED")) return MANUAL_DENIED;
        if (value.equals("REQUESTED_APPROVAL")) return REQUESTED_APPROVAL;
        if (value.equals("UNAPPROVED")) return UNAPPROVED;
        if (value.equals("UNKNOWN")) return UNKNOWN;
        throw new IOException("Cannot deserialize ValidityStatus");
    }
}

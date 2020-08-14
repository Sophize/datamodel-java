package org.sophize.datamodel;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class ValidityUpdate {
    private String justification;
    private User updater;
    private ValidityStatus validityStatus;

    @JsonProperty("justification")
    public String getJustification() { return justification; }
    @JsonProperty("justification")
    public void setJustification(String value) { this.justification = value; }

    @JsonProperty("updater")
    public User getUpdater() { return updater; }
    @JsonProperty("updater")
    public void setUpdater(User value) { this.updater = value; }

    @JsonProperty("validityStatus")
    public ValidityStatus getValidityStatus() { return validityStatus; }
    @JsonProperty("validityStatus")
    public void setValidityStatus(ValidityStatus value) { this.validityStatus = value; }
}

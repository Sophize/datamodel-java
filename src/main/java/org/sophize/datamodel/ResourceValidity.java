package org.sophize.datamodel;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class ResourceValidity {
    private ValidityUpdate globalValidity;
    private ValidityUpdate localValidity;

    @JsonProperty("globalValidity")
    public ValidityUpdate getGlobalValidity() { return globalValidity; }
    @JsonProperty("globalValidity")
    public void setGlobalValidity(ValidityUpdate value) { this.globalValidity = value; }

    @JsonProperty("localValidity")
    public ValidityUpdate getLocalValidity() { return localValidity; }
    @JsonProperty("localValidity")
    public void setLocalValidity(ValidityUpdate value) { this.localValidity = value; }
}

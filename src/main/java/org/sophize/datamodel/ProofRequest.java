package org.sophize.datamodel;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class ProofRequest {
    private Boolean fetchProof;
    private Boolean fetchUpdatedProposition;
    private String machinePtr;
    private Boolean parseLenient;
    private Proposition proposition;

    @JsonProperty("fetchProof")
    public Boolean getFetchProof() { return fetchProof; }
    @JsonProperty("fetchProof")
    public void setFetchProof(Boolean value) { this.fetchProof = value; }

    @JsonProperty("fetchUpdatedProposition")
    public Boolean getFetchUpdatedProposition() { return fetchUpdatedProposition; }
    @JsonProperty("fetchUpdatedProposition")
    public void setFetchUpdatedProposition(Boolean value) { this.fetchUpdatedProposition = value; }

    @JsonProperty("machinePtr")
    public String getMachinePtr() { return machinePtr; }
    @JsonProperty("machinePtr")
    public void setMachinePtr(String value) { this.machinePtr = value; }

    @JsonProperty("parseLenient")
    public Boolean getParseLenient() { return parseLenient; }
    @JsonProperty("parseLenient")
    public void setParseLenient(Boolean value) { this.parseLenient = value; }

    @JsonProperty("proposition")
    public Proposition getProposition() { return proposition; }
    @JsonProperty("proposition")
    public void setProposition(Proposition value) { this.proposition = value; }
}

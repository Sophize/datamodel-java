package org.sophize.datamodel;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Beliefset extends Resource {
    private String description;
    private String[] subBeliefsetPtrs;
    private String[] unsupportedMachinePtrs;
    private String[] unsupportedPropositionPtrs;

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    @JsonProperty("subBeliefsetPtrs")
    public String[] getSubBeliefsetPtrs() { return subBeliefsetPtrs; }
    @JsonProperty("subBeliefsetPtrs")
    public void setSubBeliefsetPtrs(String[] value) { this.subBeliefsetPtrs = value; }

    @JsonProperty("unsupportedMachinePtrs")
    public String[] getUnsupportedMachinePtrs() { return unsupportedMachinePtrs; }
    @JsonProperty("unsupportedMachinePtrs")
    public void setUnsupportedMachinePtrs(String[] value) { this.unsupportedMachinePtrs = value; }

    @JsonProperty("unsupportedPropositionPtrs")
    public String[] getUnsupportedPropositionPtrs() { return unsupportedPropositionPtrs; }
    @JsonProperty("unsupportedPropositionPtrs")
    public void setUnsupportedPropositionPtrs(String[] value) { this.unsupportedPropositionPtrs = value; }
}

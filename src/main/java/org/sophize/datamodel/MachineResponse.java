package org.sophize.datamodel;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class MachineResponse {
    private Argument[] proofArguments;
    private Proposition[] proofPropositions;
    private Proposition resolvedProposition;
    private TruthValue truthValue;

    @JsonProperty("proofArguments")
    public Argument[] getProofArguments() { return proofArguments; }
    @JsonProperty("proofArguments")
    public void setProofArguments(Argument[] value) { this.proofArguments = value; }

    @JsonProperty("proofPropositions")
    public Proposition[] getProofPropositions() { return proofPropositions; }
    @JsonProperty("proofPropositions")
    public void setProofPropositions(Proposition[] value) { this.proofPropositions = value; }

    @JsonProperty("resolvedProposition")
    public Proposition getResolvedProposition() { return resolvedProposition; }
    @JsonProperty("resolvedProposition")
    public void setResolvedProposition(Proposition value) { this.resolvedProposition = value; }

    @JsonProperty("truthValue")
    public TruthValue getTruthValue() { return truthValue; }
    @JsonProperty("truthValue")
    public void setTruthValue(TruthValue value) { this.truthValue = value; }
}

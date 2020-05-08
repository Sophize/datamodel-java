package org.sophize.datamodel;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Argument extends Resource {
    private String argumentText;
    private String conclusion;
    private Language language;
    private String[] lookupTerms;
    private MetaLanguage metaLanguage;
    private String premiseMachine;
    private String[] premises;

    @JsonProperty("argumentText")
    public String getArgumentText() { return argumentText; }
    @JsonProperty("argumentText")
    public void setArgumentText(String value) { this.argumentText = value; }

    @JsonProperty("conclusion")
    public String getConclusion() { return conclusion; }
    @JsonProperty("conclusion")
    public void setConclusion(String value) { this.conclusion = value; }

    @JsonProperty("language")
    public Language getLanguage() { return language; }
    @JsonProperty("language")
    public void setLanguage(Language value) { this.language = value; }

    @JsonProperty("lookupTerms")
    public String[] getLookupTerms() { return lookupTerms; }
    @JsonProperty("lookupTerms")
    public void setLookupTerms(String[] value) { this.lookupTerms = value; }

    @JsonProperty("metaLanguage")
    public MetaLanguage getMetaLanguage() { return metaLanguage; }
    @JsonProperty("metaLanguage")
    public void setMetaLanguage(MetaLanguage value) { this.metaLanguage = value; }

    @JsonProperty("premiseMachine")
    public String getPremiseMachine() { return premiseMachine; }
    @JsonProperty("premiseMachine")
    public void setPremiseMachine(String value) { this.premiseMachine = value; }

    @JsonProperty("premises")
    public String[] getPremises() { return premises; }
    @JsonProperty("premises")
    public void setPremises(String[] value) { this.premises = value; }
}

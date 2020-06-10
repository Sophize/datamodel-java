package org.sophize.datamodel;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Machine extends Resource {
    private Language defaultLanguage;
    private String defaultLenientStatement;
    private String defaultMaterializeDataset;
    private String defaultStrictStatement;
    private String description;
    private String[] premiseMachines;
    private String[] premisePropositions;
    private String serverName;

    @JsonProperty("defaultLanguage")
    public Language getDefaultLanguage() { return defaultLanguage; }
    @JsonProperty("defaultLanguage")
    public void setDefaultLanguage(Language value) { this.defaultLanguage = value; }

    @JsonProperty("defaultLenientStatement")
    public String getDefaultLenientStatement() { return defaultLenientStatement; }
    @JsonProperty("defaultLenientStatement")
    public void setDefaultLenientStatement(String value) { this.defaultLenientStatement = value; }

    @JsonProperty("defaultMaterializeDataset")
    public String getDefaultMaterializeDataset() { return defaultMaterializeDataset; }
    @JsonProperty("defaultMaterializeDataset")
    public void setDefaultMaterializeDataset(String value) { this.defaultMaterializeDataset = value; }

    @JsonProperty("defaultStrictStatement")
    public String getDefaultStrictStatement() { return defaultStrictStatement; }
    @JsonProperty("defaultStrictStatement")
    public void setDefaultStrictStatement(String value) { this.defaultStrictStatement = value; }

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    @JsonProperty("premiseMachines")
    public String[] getPremiseMachines() { return premiseMachines; }
    @JsonProperty("premiseMachines")
    public void setPremiseMachines(String[] value) { this.premiseMachines = value; }

    @JsonProperty("premisePropositions")
    public String[] getPremisePropositions() { return premisePropositions; }
    @JsonProperty("premisePropositions")
    public void setPremisePropositions(String[] value) { this.premisePropositions = value; }

    @JsonProperty("serverName")
    public String getServerName() { return serverName; }
    @JsonProperty("serverName")
    public void setServerName(String value) { this.serverName = value; }
}

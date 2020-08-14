package org.sophize.datamodel;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Dataset {
    private String bannerURL;
    private Boolean customHomeArticle;
    private String description;
    private String iconURL;
    private License[] licenses;
    private String name;
    private AccessType[] openAcls;
    private String[] subscribedDatasets;
    private String[] tags;

    @JsonProperty("bannerUrl")
    public String getBannerURL() { return bannerURL; }
    @JsonProperty("bannerUrl")
    public void setBannerURL(String value) { this.bannerURL = value; }

    @JsonProperty("customHomeArticle")
    public Boolean getCustomHomeArticle() { return customHomeArticle; }
    @JsonProperty("customHomeArticle")
    public void setCustomHomeArticle(Boolean value) { this.customHomeArticle = value; }

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    @JsonProperty("iconUrl")
    public String getIconURL() { return iconURL; }
    @JsonProperty("iconUrl")
    public void setIconURL(String value) { this.iconURL = value; }

    @JsonProperty("licenses")
    public License[] getLicenses() { return licenses; }
    @JsonProperty("licenses")
    public void setLicenses(License[] value) { this.licenses = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("openAcls")
    public AccessType[] getOpenAcls() { return openAcls; }
    @JsonProperty("openAcls")
    public void setOpenAcls(AccessType[] value) { this.openAcls = value; }

    @JsonProperty("subscribedDatasets")
    public String[] getSubscribedDatasets() { return subscribedDatasets; }
    @JsonProperty("subscribedDatasets")
    public void setSubscribedDatasets(String[] value) { this.subscribedDatasets = value; }

    @JsonProperty("tags")
    public String[] getTags() { return tags; }
    @JsonProperty("tags")
    public void setTags(String[] value) { this.tags = value; }
}

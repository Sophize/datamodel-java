package org.sophize.datamodel;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class License {
    private String licenseText;
    private LicenseType licenseType;
    private String linkToLicense;

    @JsonProperty("licenseText")
    public String getLicenseText() { return licenseText; }
    @JsonProperty("licenseText")
    public void setLicenseText(String value) { this.licenseText = value; }

    @JsonProperty("licenseType")
    public LicenseType getLicenseType() { return licenseType; }
    @JsonProperty("licenseType")
    public void setLicenseType(LicenseType value) { this.licenseType = value; }

    @JsonProperty("linkToLicense")
    public String getLinkToLicense() { return linkToLicense; }
    @JsonProperty("linkToLicense")
    public void setLinkToLicense(String value) { this.linkToLicense = value; }
}

package org.sophize.datamodel;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum AccessType {
    ADD_NEW_DATA, APPROVE_DATA_UPDATES, APPROVE_USER_UPDATES, APPROVE_VALIDITY, COMMENT, DATASET_PROPERTY_UPDATE, EDIT_DELETE_DATA, GLOBAL_APPROVE_VALIDITY, MODERATE_COMMENTS, READ_DATA, SUGGEST_DATA_UPDATES, SUGGEST_USER_UPDATES, UNKNOWN, UPDATE_USER;

    @JsonValue
    public String toValue() {
        switch (this) {
        case ADD_NEW_DATA: return "ADD_NEW_DATA";
        case APPROVE_DATA_UPDATES: return "APPROVE_DATA_UPDATES";
        case APPROVE_USER_UPDATES: return "APPROVE_USER_UPDATES";
        case APPROVE_VALIDITY: return "APPROVE_VALIDITY";
        case COMMENT: return "COMMENT";
        case DATASET_PROPERTY_UPDATE: return "DATASET_PROPERTY_UPDATE";
        case EDIT_DELETE_DATA: return "EDIT_DELETE_DATA";
        case GLOBAL_APPROVE_VALIDITY: return "GLOBAL_APPROVE_VALIDITY";
        case MODERATE_COMMENTS: return "MODERATE_COMMENTS";
        case READ_DATA: return "READ_DATA";
        case SUGGEST_DATA_UPDATES: return "SUGGEST_DATA_UPDATES";
        case SUGGEST_USER_UPDATES: return "SUGGEST_USER_UPDATES";
        case UNKNOWN: return "UNKNOWN";
        case UPDATE_USER: return "UPDATE_USER";
        }
        return null;
    }

    @JsonCreator
    public static AccessType forValue(String value) throws IOException {
        if (value.equals("ADD_NEW_DATA")) return ADD_NEW_DATA;
        if (value.equals("APPROVE_DATA_UPDATES")) return APPROVE_DATA_UPDATES;
        if (value.equals("APPROVE_USER_UPDATES")) return APPROVE_USER_UPDATES;
        if (value.equals("APPROVE_VALIDITY")) return APPROVE_VALIDITY;
        if (value.equals("COMMENT")) return COMMENT;
        if (value.equals("DATASET_PROPERTY_UPDATE")) return DATASET_PROPERTY_UPDATE;
        if (value.equals("EDIT_DELETE_DATA")) return EDIT_DELETE_DATA;
        if (value.equals("GLOBAL_APPROVE_VALIDITY")) return GLOBAL_APPROVE_VALIDITY;
        if (value.equals("MODERATE_COMMENTS")) return MODERATE_COMMENTS;
        if (value.equals("READ_DATA")) return READ_DATA;
        if (value.equals("SUGGEST_DATA_UPDATES")) return SUGGEST_DATA_UPDATES;
        if (value.equals("SUGGEST_USER_UPDATES")) return SUGGEST_USER_UPDATES;
        if (value.equals("UNKNOWN")) return UNKNOWN;
        if (value.equals("UPDATE_USER")) return UPDATE_USER;
        throw new IOException("Cannot deserialize AccessType");
    }
}

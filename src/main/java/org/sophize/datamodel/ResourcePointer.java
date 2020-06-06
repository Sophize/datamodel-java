package org.sophize.datamodel;

import java.util.Objects;

import static org.sophize.datamodel.ResourcePointer.PointerType.*;

public final class ResourcePointer {
  public enum PointerType {
    EPHEMERAL,
    PERMANENT,
    ASSIGNABLE
  }

  private final String datasetId;
  private final PointerType pointerType;
  private final ResourceType resourceType;
  private final String id;

  public String getDatasetId() {
    return datasetId;
  }

  public PointerType getPointerType() {
    return pointerType;
  }

  public ResourceType getResourceType() {
    return resourceType;
  }

  public String getId() {
    return id;
  }

  public ResourcePointer(ResourceType resourceType, PointerType pointerType, String id) {
    this("", resourceType, pointerType, id);
  }

  public ResourcePointer(
      String datasetId, ResourceType resourceType, PointerType pointerType, String id) {
    this.datasetId = datasetId;
    this.pointerType = pointerType;
    this.id = id;
    this.resourceType = resourceType;
  }

  public static ResourcePointer ephemeral(ResourceType resourceType, String id) {
    return new ResourcePointer(resourceType, EPHEMERAL, id);
  }

  public static ResourcePointer permanent(ResourceType resourceType, String id) {
    return new ResourcePointer(resourceType, PERMANENT, id);
  }

  public static ResourcePointer assignable(ResourceType resourceType, String id) {
    return new ResourcePointer(resourceType, ASSIGNABLE, id);
  }

  public static boolean isValid(ResourcePointer ptr) {
    return ptr != null
        && ptr.resourceType != null
        && ptr.pointerType != null
        && !isNullOrEmpty(ptr.id);
  }

  public String toString() {
    String resourceTypeCode = getResourceTypeCode();
    String pointerTypeCode = getPointerTypeCode();
    String datasetPart = isNullOrEmpty(datasetId) ? "" : (datasetId + "/");
    return "#" + datasetPart + resourceTypeCode + pointerTypeCode + id;
  }

  private String getResourceTypeCode() {
    switch (resourceType) {
      case TERM:
        return "T";
      case PROPOSITION:
        return "P";
      case ARGUMENT:
        return "A";
      case BELIEFSET:
        return "B";
      case ARTICLE:
        return "R";
      case PROJECT:
        return "J";
      case MACHINE:
        return "M";
    }
    throw new IllegalStateException("Invalid resource type");
  }

  private String getPointerTypeCode() {
    switch (pointerType) {
      case PERMANENT:
        return ".";
      case ASSIGNABLE:
        return "_";
      case EPHEMERAL:
        return "~";
    }
    throw new IllegalStateException("Invalid pointer type");
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof ResourcePointer)) {
      return false;
    }
    ResourcePointer ptr = (ResourcePointer) o;
    return Objects.equals(datasetId, ptr.datasetId)
        && Objects.equals(resourceType, ptr.resourceType)
        && Objects.equals(pointerType, ptr.pointerType)
        && Objects.equals(id, ptr.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasetId, resourceType, pointerType, id);
  }

  private static boolean isNullOrEmpty(String s) {
    return s == null || s.isEmpty();
  }
}

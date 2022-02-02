package com.coremedia.labs.contenthub.adapters.bynder.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.Date;
import java.util.List;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Image.class, name = Image.TYPE),
        @JsonSubTypes.Type(value = Video.class, name = Video.TYPE)
})
public abstract class Entity {

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("copyright")
  private String copyright;

  @JsonProperty("description")
  private String description;

  @JsonProperty("thumbnails")
  private Thumbnails thumbnails;

  @JsonProperty("fileSize")
  private int fileSize;

  @JsonProperty("tags")
  private List<String> tags;

  @JsonProperty("dateModified")
  private Date dateModified;

  @JsonProperty("datePublished")
  private Date datePublished;

  @JsonProperty("dateCreated")
  private Date dateCreated;

  @JsonProperty("userCreated")
  private String userCreated;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCopyright() {
    return copyright;
  }

  public void setCopyright(String copyright) {
    this.copyright = copyright;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Thumbnails getThumbnails() {
    return thumbnails;
  }

  public void setThumbnails(Thumbnails thumbnails) {
    this.thumbnails = thumbnails;
  }

  public int getFileSize() {
    return fileSize;
  }

  public void setFileSize(int fileSize) {
    this.fileSize = fileSize;
  }

  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public Date getDateModified() {
    return dateModified;
  }

  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }

  public Date getDatePublished() {
    return datePublished;
  }

  public void setDatePublished(Date datePublished) {
    this.datePublished = datePublished;
  }

  public Date getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  public String getUserCreated() {
    return userCreated;
  }

  public void setUserCreated(String userCreated) {
    this.userCreated = userCreated;
  }
}

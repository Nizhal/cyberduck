/*
 * Box Platform API
 * [Box Platform](https://box.dev) provides functionality to provide access to content stored within [Box](https://box.com). It provides endpoints for basic manipulation of files and folders, management of users within an enterprise, as well as more complex topics such as legal holds and retention policies.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: devrel@box.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ch.cyberduck.core.box.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import ch.cyberduck.core.box.io.swagger.client.model.FileSharedLink;
import ch.cyberduck.core.box.io.swagger.client.model.Folder;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.joda.time.DateTime;
/**
 * A standard representation of a folder, as returned from any folder API endpoints by default
 */
@Schema(description = "A standard representation of a folder, as returned from any folder API endpoints by default")

public class Folder {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("etag")
  private String etag = null;

  /**
   * &#x60;folder&#x60;
   */
  public enum TypeEnum {
    FOLDER("folder");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("folder_id")
  private String folderId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("created_at")
  private DateTime createdAt = null;

  @JsonProperty("modified_at")
  private DateTime modifiedAt = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("trashed_at")
  private DateTime trashedAt = null;

  @JsonProperty("purged_at")
  private DateTime purgedAt = null;

  @JsonProperty("content_created_at")
  private DateTime contentCreatedAt = null;

  @JsonProperty("content_modified_at")
  private DateTime contentModifiedAt = null;

  @JsonProperty("expires_at")
  private DateTime expiresAt = null;

  @JsonProperty("shared_link")
  private FileSharedLink sharedLink = null;

  @JsonProperty("parent")
  private Folder parent = null;

  public Folder id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier that represent a folder.  The ID for any folder can be determined by visiting a folder in the web application and copying the ID from the URL. For example, for the URL &#x60;https://_*.app.box.com/folders/123&#x60; the &#x60;folder_id&#x60; is &#x60;123&#x60;.
   * @return id
  **/
  @Schema(example = "12345", description = "The unique identifier that represent a folder.  The ID for any folder can be determined by visiting a folder in the web application and copying the ID from the URL. For example, for the URL `https://_*.app.box.com/folders/123` the `folder_id` is `123`.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Folder etag(String etag) {
    this.etag = etag;
    return this;
  }

   /**
   * The HTTP &#x60;etag&#x60; of this folder. This can be used within some API endpoints in the &#x60;If-Match&#x60; and &#x60;If-None-Match&#x60; headers to only perform changes on the folder if (no) changes have happened.
   * @return etag
  **/
  @Schema(example = "1", description = "The HTTP `etag` of this folder. This can be used within some API endpoints in the `If-Match` and `If-None-Match` headers to only perform changes on the folder if (no) changes have happened.")
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public Folder type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * &#x60;folder&#x60;
   * @return type
  **/
  @Schema(example = "folder", description = "`folder`")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Folder folderId(String folderId) {
    this.folderId = folderId;
    return this;
  }

   /**
   * A numeric identifier that represents the most recent user event that has been applied to this item.  This can be used in combination with the &#x60;GET /events&#x60;-endpoint to filter out user events that would have occurred before this identifier was read.  An example would be where a Box Drive-like application would fetch an item via the API, and then listen to incoming user events for changes to the item. The application would ignore any user events where the &#x60;sequence_id&#x60; in the event is smaller than or equal to the &#x60;sequence_id&#x60; in the originally fetched resource.
   * @return folderId
  **/
  @Schema(example = "3", description = "A numeric identifier that represents the most recent user event that has been applied to this item.  This can be used in combination with the `GET /events`-endpoint to filter out user events that would have occurred before this identifier was read.  An example would be where a Box Drive-like application would fetch an item via the API, and then listen to incoming user events for changes to the item. The application would ignore any user events where the `sequence_id` in the event is smaller than or equal to the `sequence_id` in the originally fetched resource.")
  public String getFolderId() {
    return folderId;
  }

  public void setFolderId(String folderId) {
    this.folderId = folderId;
  }

  public Folder name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the folder.
   * @return name
  **/
  @Schema(example = "Contracts", description = "The name of the folder.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Folder createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time when the folder was created. This value may be &#x60;null&#x60; for some folders such as the root folder or the trash folder.
   * @return createdAt
  **/
  @Schema(example = "2012-12-12T10:53:43-08:00", description = "The date and time when the folder was created. This value may be `null` for some folders such as the root folder or the trash folder.")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Folder modifiedAt(DateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * The date and time when the folder was last updated. This value may be &#x60;null&#x60; for some folders such as the root folder or the trash folder.
   * @return modifiedAt
  **/
  @Schema(example = "2012-12-12T10:53:43-08:00", description = "The date and time when the folder was last updated. This value may be `null` for some folders such as the root folder or the trash folder.")
  public DateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(DateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public Folder size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * The folder size in bytes.  Be careful parsing this integer as its value can get very large.
   * @return size
  **/
  @Schema(example = "629644", description = "The folder size in bytes.  Be careful parsing this integer as its value can get very large.")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public Folder trashedAt(DateTime trashedAt) {
    this.trashedAt = trashedAt;
    return this;
  }

   /**
   * The time at which this folder was put in the trash.
   * @return trashedAt
  **/
  @Schema(example = "2012-12-12T10:53:43-08:00", description = "The time at which this folder was put in the trash.")
  public DateTime getTrashedAt() {
    return trashedAt;
  }

  public void setTrashedAt(DateTime trashedAt) {
    this.trashedAt = trashedAt;
  }

  public Folder purgedAt(DateTime purgedAt) {
    this.purgedAt = purgedAt;
    return this;
  }

   /**
   * The time at which this folder is expected to be purged from the trash.
   * @return purgedAt
  **/
  @Schema(example = "2012-12-12T10:53:43-08:00", description = "The time at which this folder is expected to be purged from the trash.")
  public DateTime getPurgedAt() {
    return purgedAt;
  }

  public void setPurgedAt(DateTime purgedAt) {
    this.purgedAt = purgedAt;
  }

  public Folder contentCreatedAt(DateTime contentCreatedAt) {
    this.contentCreatedAt = contentCreatedAt;
    return this;
  }

   /**
   * The date and time at which this folder was originally created.
   * @return contentCreatedAt
  **/
  @Schema(example = "2012-12-12T10:53:43-08:00", description = "The date and time at which this folder was originally created.")
  public DateTime getContentCreatedAt() {
    return contentCreatedAt;
  }

  public void setContentCreatedAt(DateTime contentCreatedAt) {
    this.contentCreatedAt = contentCreatedAt;
  }

  public Folder contentModifiedAt(DateTime contentModifiedAt) {
    this.contentModifiedAt = contentModifiedAt;
    return this;
  }

   /**
   * The date and time at which this folder was last updated.
   * @return contentModifiedAt
  **/
  @Schema(example = "2012-12-12T10:53:43-08:00", description = "The date and time at which this folder was last updated.")
  public DateTime getContentModifiedAt() {
    return contentModifiedAt;
  }

  public void setContentModifiedAt(DateTime contentModifiedAt) {
    this.contentModifiedAt = contentModifiedAt;
  }

  public Folder expiresAt(DateTime expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * The time and which the folder will be automatically be deleted.
   * @return expiresAt
  **/
  @Schema(example = "2012-12-12T10:53:43-08:00", description = "The time and which the folder will be automatically be deleted.")
  public DateTime getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(DateTime expiresAt) {
    this.expiresAt = expiresAt;
  }

  public Folder sharedLink(FileSharedLink sharedLink) {
    this.sharedLink = sharedLink;
    return this;
  }

   /**
   * Get sharedLink
   * @return sharedLink
  **/
  @Schema(description = "")
  public FileSharedLink getSharedLink() {
    return sharedLink;
  }

  public void setSharedLink(FileSharedLink sharedLink) {
    this.sharedLink = sharedLink;
  }

  public Folder parent(Folder parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @Schema(description = "")
  public Folder getParent() {
    return parent;
  }

  public void setParent(Folder parent) {
    this.parent = parent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Folder folder = (Folder) o;
    return Objects.equals(this.id, folder.id) &&
        Objects.equals(this.etag, folder.etag) &&
        Objects.equals(this.type, folder.type) &&
        Objects.equals(this.folderId, folder.folderId) &&
        Objects.equals(this.name, folder.name) &&
        Objects.equals(this.createdAt, folder.createdAt) &&
        Objects.equals(this.modifiedAt, folder.modifiedAt) &&
        Objects.equals(this.size, folder.size) &&
        Objects.equals(this.trashedAt, folder.trashedAt) &&
        Objects.equals(this.purgedAt, folder.purgedAt) &&
        Objects.equals(this.contentCreatedAt, folder.contentCreatedAt) &&
        Objects.equals(this.contentModifiedAt, folder.contentModifiedAt) &&
        Objects.equals(this.expiresAt, folder.expiresAt) &&
        Objects.equals(this.sharedLink, folder.sharedLink) &&
        Objects.equals(this.parent, folder.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, etag, type, folderId, name, createdAt, modifiedAt, size, trashedAt, purgedAt, contentCreatedAt, contentModifiedAt, expiresAt, sharedLink, parent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Folder {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    trashedAt: ").append(toIndentedString(trashedAt)).append("\n");
    sb.append("    purgedAt: ").append(toIndentedString(purgedAt)).append("\n");
    sb.append("    contentCreatedAt: ").append(toIndentedString(contentCreatedAt)).append("\n");
    sb.append("    contentModifiedAt: ").append(toIndentedString(contentModifiedAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    sharedLink: ").append(toIndentedString(sharedLink)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

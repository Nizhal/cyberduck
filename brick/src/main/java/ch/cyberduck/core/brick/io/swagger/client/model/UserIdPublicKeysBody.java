/*
 * Files.com API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.0.1
 * Contact: support@files.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ch.cyberduck.core.brick.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * UserIdPublicKeysBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-25T22:25:43.390877+02:00[Europe/Paris]")
public class UserIdPublicKeysBody {
  @JsonProperty("title")
  private String title = null;

  @JsonProperty("public_key")
  private String publicKey = null;

  public UserIdPublicKeysBody title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Internal reference for key.
   * @return title
  **/
  @Schema(example = "My Main Key", required = true, description = "Internal reference for key.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public UserIdPublicKeysBody publicKey(String publicKey) {
    this.publicKey = publicKey;
    return this;
  }

   /**
   * Actual contents of SSH key.
   * @return publicKey
  **/
  @Schema(required = true, description = "Actual contents of SSH key.")
  public String getPublicKey() {
    return publicKey;
  }

  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserIdPublicKeysBody userIdPublicKeysBody = (UserIdPublicKeysBody) o;
    return Objects.equals(this.title, userIdPublicKeysBody.title) &&
        Objects.equals(this.publicKey, userIdPublicKeysBody.publicKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, publicKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserIdPublicKeysBody {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
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
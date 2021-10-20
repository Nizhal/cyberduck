/*
 * ReSTFS
 * ReSTFS Open API 3.0 Spec
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ch.cyberduck.core.eue.io.swagger.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * ResourceUpdateModelUpdate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-10-14T22:10:10.297090+02:00[Europe/Zurich]")
public class ResourceUpdateModelUpdate {
  @JsonProperty("ui:fs")
  private Uifs uifs = null;

  @JsonProperty("ui:win32")
  private UiWin32 uiwin32 = null;

  public ResourceUpdateModelUpdate uifs(Uifs uifs) {
    this.uifs = uifs;
    return this;
  }

   /**
   * Get uifs
   * @return uifs
  **/
  @Schema(description = "")
  public Uifs getUifs() {
    return uifs;
  }

  public void setUifs(Uifs uifs) {
    this.uifs = uifs;
  }

  public ResourceUpdateModelUpdate uiwin32(UiWin32 uiwin32) {
    this.uiwin32 = uiwin32;
    return this;
  }

   /**
   * Get uiwin32
   * @return uiwin32
  **/
  @Schema(description = "")
  public UiWin32 getUiwin32() {
    return uiwin32;
  }

  public void setUiwin32(UiWin32 uiwin32) {
    this.uiwin32 = uiwin32;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceUpdateModelUpdate resourceUpdateModelUpdate = (ResourceUpdateModelUpdate) o;
    return Objects.equals(this.uifs, resourceUpdateModelUpdate.uifs) &&
        Objects.equals(this.uiwin32, resourceUpdateModelUpdate.uiwin32);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uifs, uiwin32);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceUpdateModelUpdate {\n");
    
    sb.append("    uifs: ").append(toIndentedString(uifs)).append("\n");
    sb.append("    uiwin32: ").append(toIndentedString(uiwin32)).append("\n");
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
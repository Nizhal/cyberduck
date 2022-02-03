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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * UiGeo
 */


public class UiGeo {
  @JsonProperty("databaseLatestUpdate")
  private Long databaseLatestUpdate = null;

  @JsonProperty("reverseGeocodingFullyIndexed")
  private Boolean reverseGeocodingFullyIndexed = null;

  public UiGeo databaseLatestUpdate(Long databaseLatestUpdate) {
    this.databaseLatestUpdate = databaseLatestUpdate;
    return this;
  }

   /**
   * Get databaseLatestUpdate
   * @return databaseLatestUpdate
  **/
  @Schema(description = "")
  public Long getDatabaseLatestUpdate() {
    return databaseLatestUpdate;
  }

  public void setDatabaseLatestUpdate(Long databaseLatestUpdate) {
    this.databaseLatestUpdate = databaseLatestUpdate;
  }

  public UiGeo reverseGeocodingFullyIndexed(Boolean reverseGeocodingFullyIndexed) {
    this.reverseGeocodingFullyIndexed = reverseGeocodingFullyIndexed;
    return this;
  }

   /**
   * Get reverseGeocodingFullyIndexed
   * @return reverseGeocodingFullyIndexed
  **/
  @Schema(description = "")
  public Boolean isReverseGeocodingFullyIndexed() {
    return reverseGeocodingFullyIndexed;
  }

  public void setReverseGeocodingFullyIndexed(Boolean reverseGeocodingFullyIndexed) {
    this.reverseGeocodingFullyIndexed = reverseGeocodingFullyIndexed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UiGeo uiGeo = (UiGeo) o;
    return Objects.equals(this.databaseLatestUpdate, uiGeo.databaseLatestUpdate) &&
        Objects.equals(this.reverseGeocodingFullyIndexed, uiGeo.reverseGeocodingFullyIndexed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseLatestUpdate, reverseGeocodingFullyIndexed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UiGeo {\n");
    
    sb.append("    databaseLatestUpdate: ").append(toIndentedString(databaseLatestUpdate)).append("\n");
    sb.append("    reverseGeocodingFullyIndexed: ").append(toIndentedString(reverseGeocodingFullyIndexed)).append("\n");
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

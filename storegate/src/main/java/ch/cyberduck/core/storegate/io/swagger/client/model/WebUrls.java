/*
 * Storegate.Web
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.storegate.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * An object containing session resources
 */
@ApiModel(description = "An object containing session resources")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-02T17:31:35.366+02:00")
public class WebUrls {
  @JsonProperty("filesUrl")
  private String filesUrl = null;

  @JsonProperty("backupUrl")
  private String backupUrl = null;

  @JsonProperty("commonUrl")
  private String commonUrl = null;

  @JsonProperty("accountUrl")
  private String accountUrl = null;

  @JsonProperty("settingsUrl")
  private String settingsUrl = null;

  @JsonProperty("backupManagementUrl")
  private String backupManagementUrl = null;

  @JsonProperty("syncManagementUrl")
  private String syncManagementUrl = null;

  @JsonProperty("supportUrl")
  private String supportUrl = null;

  @JsonProperty("wopiUrl")
  private String wopiUrl = null;

  @JsonProperty("partnerUrl")
  private String partnerUrl = null;

  @JsonProperty("retailerUrl")
  private String retailerUrl = null;

  public WebUrls filesUrl(String filesUrl) {
    this.filesUrl = filesUrl;
    return this;
  }

   /**
   * A preformatted web url: https://{domain.com}/{0}?pid&#x3D;{pid}&amp;amp;rid&#x3D;{pid}
   * @return filesUrl
  **/
  @ApiModelProperty(value = "A preformatted web url: https://{domain.com}/{0}?pid={pid}&amp;rid={pid}")
  public String getFilesUrl() {
    return filesUrl;
  }

  public void setFilesUrl(String filesUrl) {
    this.filesUrl = filesUrl;
  }

  public WebUrls backupUrl(String backupUrl) {
    this.backupUrl = backupUrl;
    return this;
  }

   /**
   * 
   * @return backupUrl
  **/
  @ApiModelProperty(value = "")
  public String getBackupUrl() {
    return backupUrl;
  }

  public void setBackupUrl(String backupUrl) {
    this.backupUrl = backupUrl;
  }

  public WebUrls commonUrl(String commonUrl) {
    this.commonUrl = commonUrl;
    return this;
  }

   /**
   * 
   * @return commonUrl
  **/
  @ApiModelProperty(value = "")
  public String getCommonUrl() {
    return commonUrl;
  }

  public void setCommonUrl(String commonUrl) {
    this.commonUrl = commonUrl;
  }

  public WebUrls accountUrl(String accountUrl) {
    this.accountUrl = accountUrl;
    return this;
  }

   /**
   * 
   * @return accountUrl
  **/
  @ApiModelProperty(value = "")
  public String getAccountUrl() {
    return accountUrl;
  }

  public void setAccountUrl(String accountUrl) {
    this.accountUrl = accountUrl;
  }

  public WebUrls settingsUrl(String settingsUrl) {
    this.settingsUrl = settingsUrl;
    return this;
  }

   /**
   * 
   * @return settingsUrl
  **/
  @ApiModelProperty(value = "")
  public String getSettingsUrl() {
    return settingsUrl;
  }

  public void setSettingsUrl(String settingsUrl) {
    this.settingsUrl = settingsUrl;
  }

  public WebUrls backupManagementUrl(String backupManagementUrl) {
    this.backupManagementUrl = backupManagementUrl;
    return this;
  }

   /**
   * 
   * @return backupManagementUrl
  **/
  @ApiModelProperty(value = "")
  public String getBackupManagementUrl() {
    return backupManagementUrl;
  }

  public void setBackupManagementUrl(String backupManagementUrl) {
    this.backupManagementUrl = backupManagementUrl;
  }

  public WebUrls syncManagementUrl(String syncManagementUrl) {
    this.syncManagementUrl = syncManagementUrl;
    return this;
  }

   /**
   * 
   * @return syncManagementUrl
  **/
  @ApiModelProperty(value = "")
  public String getSyncManagementUrl() {
    return syncManagementUrl;
  }

  public void setSyncManagementUrl(String syncManagementUrl) {
    this.syncManagementUrl = syncManagementUrl;
  }

  public WebUrls supportUrl(String supportUrl) {
    this.supportUrl = supportUrl;
    return this;
  }

   /**
   * 
   * @return supportUrl
  **/
  @ApiModelProperty(value = "")
  public String getSupportUrl() {
    return supportUrl;
  }

  public void setSupportUrl(String supportUrl) {
    this.supportUrl = supportUrl;
  }

  public WebUrls wopiUrl(String wopiUrl) {
    this.wopiUrl = wopiUrl;
    return this;
  }

   /**
   * 
   * @return wopiUrl
  **/
  @ApiModelProperty(value = "")
  public String getWopiUrl() {
    return wopiUrl;
  }

  public void setWopiUrl(String wopiUrl) {
    this.wopiUrl = wopiUrl;
  }

  public WebUrls partnerUrl(String partnerUrl) {
    this.partnerUrl = partnerUrl;
    return this;
  }

   /**
   * 
   * @return partnerUrl
  **/
  @ApiModelProperty(value = "")
  public String getPartnerUrl() {
    return partnerUrl;
  }

  public void setPartnerUrl(String partnerUrl) {
    this.partnerUrl = partnerUrl;
  }

  public WebUrls retailerUrl(String retailerUrl) {
    this.retailerUrl = retailerUrl;
    return this;
  }

   /**
   * 
   * @return retailerUrl
  **/
  @ApiModelProperty(value = "")
  public String getRetailerUrl() {
    return retailerUrl;
  }

  public void setRetailerUrl(String retailerUrl) {
    this.retailerUrl = retailerUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebUrls webUrls = (WebUrls) o;
    return Objects.equals(this.filesUrl, webUrls.filesUrl) &&
        Objects.equals(this.backupUrl, webUrls.backupUrl) &&
        Objects.equals(this.commonUrl, webUrls.commonUrl) &&
        Objects.equals(this.accountUrl, webUrls.accountUrl) &&
        Objects.equals(this.settingsUrl, webUrls.settingsUrl) &&
        Objects.equals(this.backupManagementUrl, webUrls.backupManagementUrl) &&
        Objects.equals(this.syncManagementUrl, webUrls.syncManagementUrl) &&
        Objects.equals(this.supportUrl, webUrls.supportUrl) &&
        Objects.equals(this.wopiUrl, webUrls.wopiUrl) &&
        Objects.equals(this.partnerUrl, webUrls.partnerUrl) &&
        Objects.equals(this.retailerUrl, webUrls.retailerUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filesUrl, backupUrl, commonUrl, accountUrl, settingsUrl, backupManagementUrl, syncManagementUrl, supportUrl, wopiUrl, partnerUrl, retailerUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebUrls {\n");
    
    sb.append("    filesUrl: ").append(toIndentedString(filesUrl)).append("\n");
    sb.append("    backupUrl: ").append(toIndentedString(backupUrl)).append("\n");
    sb.append("    commonUrl: ").append(toIndentedString(commonUrl)).append("\n");
    sb.append("    accountUrl: ").append(toIndentedString(accountUrl)).append("\n");
    sb.append("    settingsUrl: ").append(toIndentedString(settingsUrl)).append("\n");
    sb.append("    backupManagementUrl: ").append(toIndentedString(backupManagementUrl)).append("\n");
    sb.append("    syncManagementUrl: ").append(toIndentedString(syncManagementUrl)).append("\n");
    sb.append("    supportUrl: ").append(toIndentedString(supportUrl)).append("\n");
    sb.append("    wopiUrl: ").append(toIndentedString(wopiUrl)).append("\n");
    sb.append("    partnerUrl: ").append(toIndentedString(partnerUrl)).append("\n");
    sb.append("    retailerUrl: ").append(toIndentedString(retailerUrl)).append("\n");
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


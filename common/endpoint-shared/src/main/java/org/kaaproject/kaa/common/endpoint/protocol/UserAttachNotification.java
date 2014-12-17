/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.common.endpoint.protocol;  

public class UserAttachNotification {
   private java.lang.String userExternalId;
   private java.lang.String endpointAccessToken;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public UserAttachNotification() {}

  /**
   * All-args constructor.
   */
  public UserAttachNotification(java.lang.String userExternalId, java.lang.String endpointAccessToken) {
    this.userExternalId = userExternalId;
    this.endpointAccessToken = endpointAccessToken;
  }

  /**
   * Gets the value of the 'userExternalId' field.
   */
  public java.lang.String getUserExternalId() {
    return userExternalId;
  }

  /**
   * Sets the value of the 'userExternalId' field.
   * @param value the value to set.
   */
  public void setUserExternalId(java.lang.String value) {
    this.userExternalId = value;
  }

  /**
   * Gets the value of the 'endpointAccessToken' field.
   */
  public java.lang.String getEndpointAccessToken() {
    return endpointAccessToken;
  }

  /**
   * Sets the value of the 'endpointAccessToken' field.
   * @param value the value to set.
   */
  public void setEndpointAccessToken(java.lang.String value) {
    this.endpointAccessToken = value;
  }
}

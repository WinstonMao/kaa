/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.common.endpoint.protocol;  

public class ServerSync{

   private java.lang.Integer requestId;
   private org.kaaproject.kaa.common.endpoint.protocol.SyncResponseResultType status;
   private org.kaaproject.kaa.common.endpoint.protocol.ProfileServerSync profileSyncResponse;
   private org.kaaproject.kaa.common.endpoint.protocol.ConfigurationServerSync configurationSyncResponse;
   private org.kaaproject.kaa.common.endpoint.protocol.NotificationServerSync notificationSyncResponse;
   private org.kaaproject.kaa.common.endpoint.protocol.UserServerSync userSyncResponse;
   private org.kaaproject.kaa.common.endpoint.protocol.EventServerSync eventSyncResponse;
   private org.kaaproject.kaa.common.endpoint.protocol.RedirectServerSync redirectSyncResponse;
   private org.kaaproject.kaa.common.endpoint.protocol.LogServerSync logSyncResponse;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public ServerSync() {}

  /**
   * All-args constructor.
   */
  public ServerSync(java.lang.Integer requestId, org.kaaproject.kaa.common.endpoint.protocol.SyncResponseResultType status, org.kaaproject.kaa.common.endpoint.protocol.ProfileServerSync profileSyncResponse, org.kaaproject.kaa.common.endpoint.protocol.ConfigurationServerSync configurationSyncResponse, org.kaaproject.kaa.common.endpoint.protocol.NotificationServerSync notificationSyncResponse, org.kaaproject.kaa.common.endpoint.protocol.UserServerSync userSyncResponse, org.kaaproject.kaa.common.endpoint.protocol.EventServerSync eventSyncResponse, org.kaaproject.kaa.common.endpoint.protocol.RedirectServerSync redirectSyncResponse, org.kaaproject.kaa.common.endpoint.protocol.LogServerSync logSyncResponse) {
    this.requestId = requestId;
    this.status = status;
    this.profileSyncResponse = profileSyncResponse;
    this.configurationSyncResponse = configurationSyncResponse;
    this.notificationSyncResponse = notificationSyncResponse;
    this.userSyncResponse = userSyncResponse;
    this.eventSyncResponse = eventSyncResponse;
    this.redirectSyncResponse = redirectSyncResponse;
    this.logSyncResponse = logSyncResponse;
  }

  /**
   * Gets the value of the 'requestId' field.
   */
  public java.lang.Integer getRequestId() {
    return requestId;
  }

  /**
   * Sets the value of the 'requestId' field.
   * @param value the value to set.
   */
  public void setRequestId(java.lang.Integer value) {
    this.requestId = value;
  }

  /**
   * Gets the value of the 'status' field.
   */
  public org.kaaproject.kaa.common.endpoint.protocol.SyncResponseResultType getStatus() {
    return status;
  }

  /**
   * Sets the value of the 'status' field.
   * @param value the value to set.
   */
  public void setStatus(org.kaaproject.kaa.common.endpoint.protocol.SyncResponseResultType value) {
    this.status = value;
  }

  /**
   * Gets the value of the 'profileSyncResponse' field.
   */
  public org.kaaproject.kaa.common.endpoint.protocol.ProfileServerSync getProfileSyncResponse() {
    return profileSyncResponse;
  }

  /**
   * Sets the value of the 'profileSyncResponse' field.
   * @param value the value to set.
   */
  public void setProfileSyncResponse(org.kaaproject.kaa.common.endpoint.protocol.ProfileServerSync value) {
    this.profileSyncResponse = value;
  }

  /**
   * Gets the value of the 'configurationSyncResponse' field.
   */
  public org.kaaproject.kaa.common.endpoint.protocol.ConfigurationServerSync getConfigurationSyncResponse() {
    return configurationSyncResponse;
  }

  /**
   * Sets the value of the 'configurationSyncResponse' field.
   * @param value the value to set.
   */
  public void setConfigurationSyncResponse(org.kaaproject.kaa.common.endpoint.protocol.ConfigurationServerSync value) {
    this.configurationSyncResponse = value;
  }

  /**
   * Gets the value of the 'notificationSyncResponse' field.
   */
  public org.kaaproject.kaa.common.endpoint.protocol.NotificationServerSync getNotificationSyncResponse() {
    return notificationSyncResponse;
  }

  /**
   * Sets the value of the 'notificationSyncResponse' field.
   * @param value the value to set.
   */
  public void setNotificationSyncResponse(org.kaaproject.kaa.common.endpoint.protocol.NotificationServerSync value) {
    this.notificationSyncResponse = value;
  }

  /**
   * Gets the value of the 'userSyncResponse' field.
   */
  public org.kaaproject.kaa.common.endpoint.protocol.UserServerSync getUserSyncResponse() {
    return userSyncResponse;
  }

  /**
   * Sets the value of the 'userSyncResponse' field.
   * @param value the value to set.
   */
  public void setUserSyncResponse(org.kaaproject.kaa.common.endpoint.protocol.UserServerSync value) {
    this.userSyncResponse = value;
  }

  /**
   * Gets the value of the 'eventSyncResponse' field.
   */
  public org.kaaproject.kaa.common.endpoint.protocol.EventServerSync getEventSyncResponse() {
    return eventSyncResponse;
  }

  /**
   * Sets the value of the 'eventSyncResponse' field.
   * @param value the value to set.
   */
  public void setEventSyncResponse(org.kaaproject.kaa.common.endpoint.protocol.EventServerSync value) {
    this.eventSyncResponse = value;
  }

  /**
   * Gets the value of the 'redirectSyncResponse' field.
   */
  public org.kaaproject.kaa.common.endpoint.protocol.RedirectServerSync getRedirectSyncResponse() {
    return redirectSyncResponse;
  }

  /**
   * Sets the value of the 'redirectSyncResponse' field.
   * @param value the value to set.
   */
  public void setRedirectSyncResponse(org.kaaproject.kaa.common.endpoint.protocol.RedirectServerSync value) {
    this.redirectSyncResponse = value;
  }

  /**
   * Gets the value of the 'logSyncResponse' field.
   */
  public org.kaaproject.kaa.common.endpoint.protocol.LogServerSync getLogSyncResponse() {
    return logSyncResponse;
  }

  /**
   * Sets the value of the 'logSyncResponse' field.
   * @param value the value to set.
   */
  public void setLogSyncResponse(org.kaaproject.kaa.common.endpoint.protocol.LogServerSync value) {
    this.logSyncResponse = value;
  }
}

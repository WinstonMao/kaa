/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.common.endpoint.protocol;  

public class ProfileServerSync {
   private org.kaaproject.kaa.common.endpoint.protocol.SyncResponseStatus responseStatus;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public ProfileServerSync() {}

  /**
   * All-args constructor.
   */
  public ProfileServerSync(org.kaaproject.kaa.common.endpoint.protocol.SyncResponseStatus responseStatus) {
    this.responseStatus = responseStatus;
  }

  /**
   * Gets the value of the 'responseStatus' field.
   */
  public org.kaaproject.kaa.common.endpoint.protocol.SyncResponseStatus getResponseStatus() {
    return responseStatus;
  }

  /**
   * Sets the value of the 'responseStatus' field.
   * @param value the value to set.
   */
  public void setResponseStatus(org.kaaproject.kaa.common.endpoint.protocol.SyncResponseStatus value) {
    this.responseStatus = value;
  }
}

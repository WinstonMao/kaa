/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.common.endpoint.protocol;  

public class UserAttachResponse {
   private org.kaaproject.kaa.common.endpoint.protocol.SyncResponseResultType result;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public UserAttachResponse() {}

  /**
   * All-args constructor.
   */
  public UserAttachResponse(org.kaaproject.kaa.common.endpoint.protocol.SyncResponseResultType result) {
    this.result = result;
  }

  /**
   * Gets the value of the 'result' field.
   */
  public org.kaaproject.kaa.common.endpoint.protocol.SyncResponseResultType getResult() {
    return result;
  }

  /**
   * Sets the value of the 'result' field.
   * @param value the value to set.
   */
  public void setResult(org.kaaproject.kaa.common.endpoint.protocol.SyncResponseResultType value) {
    this.result = value;
  }

}

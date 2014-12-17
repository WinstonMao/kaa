/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.common.endpoint.protocol;  

public class EndpointDetachRequest {
   private java.lang.String requestId;
   private java.lang.String endpointKeyHash;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public EndpointDetachRequest() {}

  /**
   * All-args constructor.
   */
  public EndpointDetachRequest(java.lang.String requestId, java.lang.String endpointKeyHash) {
    this.requestId = requestId;
    this.endpointKeyHash = endpointKeyHash;
  }

  /**
   * Gets the value of the 'requestId' field.
   */
  public java.lang.String getRequestId() {
    return requestId;
  }

  /**
   * Sets the value of the 'requestId' field.
   * @param value the value to set.
   */
  public void setRequestId(java.lang.String value) {
    this.requestId = value;
  }

  /**
   * Gets the value of the 'endpointKeyHash' field.
   */
  public java.lang.String getEndpointKeyHash() {
    return endpointKeyHash;
  }

  /**
   * Sets the value of the 'endpointKeyHash' field.
   * @param value the value to set.
   */
  public void setEndpointKeyHash(java.lang.String value) {
    this.endpointKeyHash = value;
  }

@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((endpointKeyHash == null) ? 0 : endpointKeyHash.hashCode());
    result = prime * result + ((requestId == null) ? 0 : requestId.hashCode());
    return result;
}

@Override
public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null) {
        return false;
    }
    if (getClass() != obj.getClass()) {
        return false;
    }
    EndpointDetachRequest other = (EndpointDetachRequest) obj;
    if (endpointKeyHash == null) {
        if (other.endpointKeyHash != null) {
            return false;
        }
    } else if (!endpointKeyHash.equals(other.endpointKeyHash)) {
        return false;
    }
    if (requestId == null) {
        if (other.requestId != null) {
            return false;
        }
    } else if (!requestId.equals(other.requestId)) {
        return false;
    }
    return true;
}
}

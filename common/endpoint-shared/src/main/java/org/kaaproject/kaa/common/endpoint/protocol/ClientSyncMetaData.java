/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.common.endpoint.protocol;

public class ClientSyncMetaData {
   private java.lang.String applicationToken;
   private java.nio.ByteBuffer endpointPublicKeyHash;
   private java.nio.ByteBuffer profileHash;
   private long timeout;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public ClientSyncMetaData() {}

  /**
   * All-args constructor.
   */
  public ClientSyncMetaData(java.lang.String applicationToken, java.nio.ByteBuffer endpointPublicKeyHash, java.nio.ByteBuffer profileHash, java.lang.Long timeout) {
    this.applicationToken = applicationToken;
    this.endpointPublicKeyHash = endpointPublicKeyHash;
    this.profileHash = profileHash;
    this.timeout = timeout;
  }

  /**
   * Gets the value of the 'applicationToken' field.
   */
  public java.lang.String getApplicationToken() {
    return applicationToken;
  }

  /**
   * Sets the value of the 'applicationToken' field.
   * @param value the value to set.
   */
  public void setApplicationToken(java.lang.String value) {
    this.applicationToken = value;
  }

  /**
   * Gets the value of the 'endpointPublicKeyHash' field.
   */
  public java.nio.ByteBuffer getEndpointPublicKeyHash() {
    return endpointPublicKeyHash;
  }

  /**
   * Sets the value of the 'endpointPublicKeyHash' field.
   * @param value the value to set.
   */
  public void setEndpointPublicKeyHash(java.nio.ByteBuffer value) {
    this.endpointPublicKeyHash = value;
  }

  /**
   * Gets the value of the 'profileHash' field.
   */
  public java.nio.ByteBuffer getProfileHash() {
    return profileHash;
  }

  /**
   * Sets the value of the 'profileHash' field.
   * @param value the value to set.
   */
  public void setProfileHash(java.nio.ByteBuffer value) {
    this.profileHash = value;
  }

  /**
   * Gets the value of the 'timeout' field.
   */
  public java.lang.Long getTimeout() {
    return timeout;
  }

  /**
   * Sets the value of the 'timeout' field.
   * @param value the value to set.
   */
  public void setTimeout(java.lang.Long value) {
    this.timeout = value;
  }

@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((applicationToken == null) ? 0 : applicationToken.hashCode());
    result = prime * result + ((endpointPublicKeyHash == null) ? 0 : endpointPublicKeyHash.hashCode());
    result = prime * result + ((profileHash == null) ? 0 : profileHash.hashCode());
    result = prime * result + (int) (timeout ^ (timeout >>> 32));
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
    ClientSyncMetaData other = (ClientSyncMetaData) obj;
    if (applicationToken == null) {
        if (other.applicationToken != null) {
            return false;
        }
    } else if (!applicationToken.equals(other.applicationToken)) {
        return false;
    }
    if (endpointPublicKeyHash == null) {
        if (other.endpointPublicKeyHash != null) {
            return false;
        }
    } else if (!endpointPublicKeyHash.equals(other.endpointPublicKeyHash)) {
        return false;
    }
    if (profileHash == null) {
        if (other.profileHash != null) {
            return false;
        }
    } else if (!profileHash.equals(other.profileHash)) {
        return false;
    }
    if (timeout != other.timeout) {
        return false;
    }
    return true;
}
}

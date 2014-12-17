/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.common.endpoint.protocol;  

public class EndpointVersionInfo {
   private int configVersion;
   private int profileVersion;
   private int systemNfVersion;
   private int userNfVersion;
   private java.util.List<org.kaaproject.kaa.common.endpoint.protocol.EventClassFamilyVersionInfo> eventFamilyVersions;
   private int logSchemaVersion;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public EndpointVersionInfo() {}

  /**
   * All-args constructor.
   */
  public EndpointVersionInfo(java.lang.Integer configVersion, java.lang.Integer profileVersion, java.lang.Integer systemNfVersion, java.lang.Integer userNfVersion, java.util.List<org.kaaproject.kaa.common.endpoint.protocol.EventClassFamilyVersionInfo> eventFamilyVersions, java.lang.Integer logSchemaVersion) {
    this.configVersion = configVersion;
    this.profileVersion = profileVersion;
    this.systemNfVersion = systemNfVersion;
    this.userNfVersion = userNfVersion;
    this.eventFamilyVersions = eventFamilyVersions;
    this.logSchemaVersion = logSchemaVersion;
  }

  /**
   * Gets the value of the 'configVersion' field.
   */
  public java.lang.Integer getConfigVersion() {
    return configVersion;
  }

  /**
   * Sets the value of the 'configVersion' field.
   * @param value the value to set.
   */
  public void setConfigVersion(java.lang.Integer value) {
    this.configVersion = value;
  }

  /**
   * Gets the value of the 'profileVersion' field.
   */
  public java.lang.Integer getProfileVersion() {
    return profileVersion;
  }

  /**
   * Sets the value of the 'profileVersion' field.
   * @param value the value to set.
   */
  public void setProfileVersion(java.lang.Integer value) {
    this.profileVersion = value;
  }

  /**
   * Gets the value of the 'systemNfVersion' field.
   */
  public java.lang.Integer getSystemNfVersion() {
    return systemNfVersion;
  }

  /**
   * Sets the value of the 'systemNfVersion' field.
   * @param value the value to set.
   */
  public void setSystemNfVersion(java.lang.Integer value) {
    this.systemNfVersion = value;
  }

  /**
   * Gets the value of the 'userNfVersion' field.
   */
  public java.lang.Integer getUserNfVersion() {
    return userNfVersion;
  }

  /**
   * Sets the value of the 'userNfVersion' field.
   * @param value the value to set.
   */
  public void setUserNfVersion(java.lang.Integer value) {
    this.userNfVersion = value;
  }

  /**
   * Gets the value of the 'eventFamilyVersions' field.
   */
  public java.util.List<org.kaaproject.kaa.common.endpoint.protocol.EventClassFamilyVersionInfo> getEventFamilyVersions() {
    return eventFamilyVersions;
  }

  /**
   * Sets the value of the 'eventFamilyVersions' field.
   * @param value the value to set.
   */
  public void setEventFamilyVersions(java.util.List<org.kaaproject.kaa.common.endpoint.protocol.EventClassFamilyVersionInfo> value) {
    this.eventFamilyVersions = value;
  }

  /**
   * Gets the value of the 'logSchemaVersion' field.
   */
  public java.lang.Integer getLogSchemaVersion() {
    return logSchemaVersion;
  }

  /**
   * Sets the value of the 'logSchemaVersion' field.
   * @param value the value to set.
   */
  public void setLogSchemaVersion(java.lang.Integer value) {
    this.logSchemaVersion = value;
  }

@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + configVersion;
    result = prime * result + ((eventFamilyVersions == null) ? 0 : eventFamilyVersions.hashCode());
    result = prime * result + logSchemaVersion;
    result = prime * result + profileVersion;
    result = prime * result + systemNfVersion;
    result = prime * result + userNfVersion;
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
    EndpointVersionInfo other = (EndpointVersionInfo) obj;
    if (configVersion != other.configVersion) {
        return false;
    }
    if (eventFamilyVersions == null) {
        if (other.eventFamilyVersions != null) {
            return false;
        }
    } else if (!eventFamilyVersions.equals(other.eventFamilyVersions)) {
        return false;
    }
    if (logSchemaVersion != other.logSchemaVersion) {
        return false;
    }
    if (profileVersion != other.profileVersion) {
        return false;
    }
    if (systemNfVersion != other.systemNfVersion) {
        return false;
    }
    if (userNfVersion != other.userNfVersion) {
        return false;
    }
    return true;
}

}

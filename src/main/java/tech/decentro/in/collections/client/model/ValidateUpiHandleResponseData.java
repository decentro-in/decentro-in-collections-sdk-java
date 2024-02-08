/*
 * decentro-in-collections
 * Collections
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: admin@decentro.tech
 *
 * Do not edit the class manually.
 */


package tech.decentro.in.collections.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import tech.decentro.in.collections.client.JSON;

/**
 * ValidateUpiHandleResponseData
 */
@javax.annotation.Generated(value = "tech.decentro.in.collections")
public class ValidateUpiHandleResponseData {
  public static final String SERIALIZED_NAME_UPI_ID = "upiId";
  @SerializedName(SERIALIZED_NAME_UPI_ID)
  private String upiId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_STATUS_DESCRIPTION = "statusDescription";
  @SerializedName(SERIALIZED_NAME_STATUS_DESCRIPTION)
  private String statusDescription;

  public ValidateUpiHandleResponseData() {
  }

  public ValidateUpiHandleResponseData upiId(String upiId) {

    
    
    
    
    this.upiId = upiId;
    return this;
  }

   /**
   * Get upiId
   * @return upiId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DecentroTest12@ybl", value = "")

  public String getUpiId() {
    return upiId;
  }


  public void setUpiId(String upiId) {

    
    
    
    this.upiId = upiId;
  }


  public ValidateUpiHandleResponseData name(String name) {

    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Decentro Test", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {

    
    
    
    this.name = name;
  }


  public ValidateUpiHandleResponseData status(String status) {

    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VALID", value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {

    
    
    
    this.status = status;
  }


  public ValidateUpiHandleResponseData statusDescription(String statusDescription) {

    
    
    
    
    this.statusDescription = statusDescription;
    return this;
  }

   /**
   * Get statusDescription
   * @return statusDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Success", value = "")

  public String getStatusDescription() {
    return statusDescription;
  }


  public void setStatusDescription(String statusDescription) {

    
    
    
    this.statusDescription = statusDescription;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the ValidateUpiHandleResponseData instance itself
   */
  public ValidateUpiHandleResponseData putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateUpiHandleResponseData validateUpiHandleResponseData = (ValidateUpiHandleResponseData) o;
    return Objects.equals(this.upiId, validateUpiHandleResponseData.upiId) &&
        Objects.equals(this.name, validateUpiHandleResponseData.name) &&
        Objects.equals(this.status, validateUpiHandleResponseData.status) &&
        Objects.equals(this.statusDescription, validateUpiHandleResponseData.statusDescription)&&
        Objects.equals(this.additionalProperties, validateUpiHandleResponseData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(upiId, name, status, statusDescription, additionalProperties);
  }

  @Override
  public String toString() {
    return toJson();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("upiId");
    openapiFields.add("name");
    openapiFields.add("status");
    openapiFields.add("statusDescription");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ValidateUpiHandleResponseData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ValidateUpiHandleResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ValidateUpiHandleResponseData is not found in the empty JSON string", ValidateUpiHandleResponseData.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("upiId") != null && !jsonObj.get("upiId").isJsonNull()) && !jsonObj.get("upiId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upiId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upiId").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("statusDescription") != null && !jsonObj.get("statusDescription").isJsonNull()) && !jsonObj.get("statusDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusDescription").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ValidateUpiHandleResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ValidateUpiHandleResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ValidateUpiHandleResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ValidateUpiHandleResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ValidateUpiHandleResponseData>() {
           @Override
           public void write(JsonWriter out, ValidateUpiHandleResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public ValidateUpiHandleResponseData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ValidateUpiHandleResponseData instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ValidateUpiHandleResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ValidateUpiHandleResponseData
  * @throws IOException if the JSON string is invalid with respect to ValidateUpiHandleResponseData
  */
  public static ValidateUpiHandleResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ValidateUpiHandleResponseData.class);
  }

 /**
  * Convert an instance of ValidateUpiHandleResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


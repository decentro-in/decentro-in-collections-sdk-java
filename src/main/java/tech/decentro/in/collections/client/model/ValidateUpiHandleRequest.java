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
 * ValidateUpiHandleRequest
 */
@javax.annotation.Generated(value = "tech.decentro.in.collections")
public class ValidateUpiHandleRequest {
  public static final String SERIALIZED_NAME_REFERENCE_ID = "reference_id";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  public static final String SERIALIZED_NAME_UPI_ID = "upi_id";
  @SerializedName(SERIALIZED_NAME_UPI_ID)
  private String upiId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public ValidateUpiHandleRequest() {
  }

  public ValidateUpiHandleRequest referenceId(String referenceId) {
    // x-konfig-strip
    referenceId = StringUtils.strip(referenceId);

    
    
    if (referenceId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for referenceId. Length must be greater than or equal to 1.");
    }
    
    this.referenceId = referenceId;
    return this;
  }

   /**
   * Get referenceId
   * @return referenceId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ABCDEF12345", required = true, value = "")

  public String getReferenceId() {
    return referenceId;
  }


  public void setReferenceId(String referenceId) {
    // x-konfig-strip
    referenceId = StringUtils.strip(referenceId);

    
    
    if (referenceId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for referenceId. Length must be greater than or equal to 1.");
    }
    this.referenceId = referenceId;
  }


  public ValidateUpiHandleRequest upiId(String upiId) {
    // x-konfig-strip
    upiId = StringUtils.strip(upiId);

    
    
    if (upiId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for upiId. Length must be greater than or equal to 1.");
    }
    
    this.upiId = upiId;
    return this;
  }

   /**
   * Get upiId
   * @return upiId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "test001@abc", required = true, value = "")

  public String getUpiId() {
    return upiId;
  }


  public void setUpiId(String upiId) {
    // x-konfig-strip
    upiId = StringUtils.strip(upiId);

    
    
    if (upiId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for upiId. Length must be greater than or equal to 1.");
    }
    this.upiId = upiId;
  }


  public ValidateUpiHandleRequest type(String type) {

    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BASIC", value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {

    
    
    
    this.type = type;
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
   * @return the ValidateUpiHandleRequest instance itself
   */
  public ValidateUpiHandleRequest putAdditionalProperty(String key, Object value) {
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
    ValidateUpiHandleRequest validateUpiHandleRequest = (ValidateUpiHandleRequest) o;
    return Objects.equals(this.referenceId, validateUpiHandleRequest.referenceId) &&
        Objects.equals(this.upiId, validateUpiHandleRequest.upiId) &&
        Objects.equals(this.type, validateUpiHandleRequest.type)&&
        Objects.equals(this.additionalProperties, validateUpiHandleRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceId, upiId, type, additionalProperties);
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
    openapiFields.add("reference_id");
    openapiFields.add("upi_id");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("reference_id");
    openapiRequiredFields.add("upi_id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ValidateUpiHandleRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ValidateUpiHandleRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ValidateUpiHandleRequest is not found in the empty JSON string", ValidateUpiHandleRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ValidateUpiHandleRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("reference_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference_id").toString()));
      }
      if (!jsonObj.get("upi_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upi_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upi_id").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ValidateUpiHandleRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ValidateUpiHandleRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ValidateUpiHandleRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ValidateUpiHandleRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ValidateUpiHandleRequest>() {
           @Override
           public void write(JsonWriter out, ValidateUpiHandleRequest value) throws IOException {
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
           public ValidateUpiHandleRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ValidateUpiHandleRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ValidateUpiHandleRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ValidateUpiHandleRequest
  * @throws IOException if the JSON string is invalid with respect to ValidateUpiHandleRequest
  */
  public static ValidateUpiHandleRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ValidateUpiHandleRequest.class);
  }

 /**
  * Convert an instance of ValidateUpiHandleRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


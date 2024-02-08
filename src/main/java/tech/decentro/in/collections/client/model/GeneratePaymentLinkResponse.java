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
import tech.decentro.in.collections.client.model.GeneratePaymentLinkResponseData;

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
 * GeneratePaymentLinkResponse
 */
@javax.annotation.Generated(value = "tech.decentro.in.collections")
public class GeneratePaymentLinkResponse {
  public static final String SERIALIZED_NAME_DECENTRO_TXN_ID = "decentroTxnId";
  @SerializedName(SERIALIZED_NAME_DECENTRO_TXN_ID)
  private String decentroTxnId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_RESPONSE_CODE = "responseCode";
  @SerializedName(SERIALIZED_NAME_RESPONSE_CODE)
  private String responseCode;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private GeneratePaymentLinkResponseData data;

  public static final String SERIALIZED_NAME_RESPONSE_KEY = "responseKey";
  @SerializedName(SERIALIZED_NAME_RESPONSE_KEY)
  private String responseKey;

  public GeneratePaymentLinkResponse() {
  }

  public GeneratePaymentLinkResponse decentroTxnId(String decentroTxnId) {

    
    
    
    
    this.decentroTxnId = decentroTxnId;
    return this;
  }

   /**
   * Get decentroTxnId
   * @return decentroTxnId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "XYZ", value = "")

  public String getDecentroTxnId() {
    return decentroTxnId;
  }


  public void setDecentroTxnId(String decentroTxnId) {

    
    
    
    this.decentroTxnId = decentroTxnId;
  }


  public GeneratePaymentLinkResponse status(String status) {

    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUCCESS", value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {

    
    
    
    this.status = status;
  }


  public GeneratePaymentLinkResponse responseCode(String responseCode) {

    
    
    
    
    this.responseCode = responseCode;
    return this;
  }

   /**
   * Get responseCode
   * @return responseCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "S00000", value = "")

  public String getResponseCode() {
    return responseCode;
  }


  public void setResponseCode(String responseCode) {

    
    
    
    this.responseCode = responseCode;
  }


  public GeneratePaymentLinkResponse message(String message) {

    
    
    
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Payment Link created Successfully", value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {

    
    
    
    this.message = message;
  }


  public GeneratePaymentLinkResponse data(GeneratePaymentLinkResponseData data) {

    
    
    
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GeneratePaymentLinkResponseData getData() {
    return data;
  }


  public void setData(GeneratePaymentLinkResponseData data) {

    
    
    
    this.data = data;
  }


  public GeneratePaymentLinkResponse responseKey(String responseKey) {

    
    
    
    
    this.responseKey = responseKey;
    return this;
  }

   /**
   * Get responseKey
   * @return responseKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "success_payment_link_created", value = "")

  public String getResponseKey() {
    return responseKey;
  }


  public void setResponseKey(String responseKey) {

    
    
    
    this.responseKey = responseKey;
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
   * @return the GeneratePaymentLinkResponse instance itself
   */
  public GeneratePaymentLinkResponse putAdditionalProperty(String key, Object value) {
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
    GeneratePaymentLinkResponse generatePaymentLinkResponse = (GeneratePaymentLinkResponse) o;
    return Objects.equals(this.decentroTxnId, generatePaymentLinkResponse.decentroTxnId) &&
        Objects.equals(this.status, generatePaymentLinkResponse.status) &&
        Objects.equals(this.responseCode, generatePaymentLinkResponse.responseCode) &&
        Objects.equals(this.message, generatePaymentLinkResponse.message) &&
        Objects.equals(this.data, generatePaymentLinkResponse.data) &&
        Objects.equals(this.responseKey, generatePaymentLinkResponse.responseKey)&&
        Objects.equals(this.additionalProperties, generatePaymentLinkResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(decentroTxnId, status, responseCode, message, data, responseKey, additionalProperties);
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
    openapiFields.add("decentroTxnId");
    openapiFields.add("status");
    openapiFields.add("responseCode");
    openapiFields.add("message");
    openapiFields.add("data");
    openapiFields.add("responseKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GeneratePaymentLinkResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GeneratePaymentLinkResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GeneratePaymentLinkResponse is not found in the empty JSON string", GeneratePaymentLinkResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("decentroTxnId") != null && !jsonObj.get("decentroTxnId").isJsonNull()) && !jsonObj.get("decentroTxnId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `decentroTxnId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("decentroTxnId").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("responseCode") != null && !jsonObj.get("responseCode").isJsonNull()) && !jsonObj.get("responseCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `responseCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("responseCode").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      // validate the optional field `data`
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        GeneratePaymentLinkResponseData.validateJsonObject(jsonObj.getAsJsonObject("data"));
      }
      if ((jsonObj.get("responseKey") != null && !jsonObj.get("responseKey").isJsonNull()) && !jsonObj.get("responseKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `responseKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("responseKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GeneratePaymentLinkResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GeneratePaymentLinkResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GeneratePaymentLinkResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GeneratePaymentLinkResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GeneratePaymentLinkResponse>() {
           @Override
           public void write(JsonWriter out, GeneratePaymentLinkResponse value) throws IOException {
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
           public GeneratePaymentLinkResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GeneratePaymentLinkResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GeneratePaymentLinkResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GeneratePaymentLinkResponse
  * @throws IOException if the JSON string is invalid with respect to GeneratePaymentLinkResponse
  */
  public static GeneratePaymentLinkResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GeneratePaymentLinkResponse.class);
  }

 /**
  * Convert an instance of GeneratePaymentLinkResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


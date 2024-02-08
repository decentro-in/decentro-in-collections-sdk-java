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
 * GetTransactionStatusResponseData
 */
@javax.annotation.Generated(value = "tech.decentro.in.collections")
public class GetTransactionStatusResponseData {
  public static final String SERIALIZED_NAME_TRANSACTION_STATUS = "transactionStatus";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_STATUS)
  private String transactionStatus;

  public static final String SERIALIZED_NAME_BANK_REFERENCE_NUMBER = "bankReferenceNumber";
  @SerializedName(SERIALIZED_NAME_BANK_REFERENCE_NUMBER)
  private String bankReferenceNumber;

  public static final String SERIALIZED_NAME_NPCI_TXN_ID = "npciTxnId";
  @SerializedName(SERIALIZED_NAME_NPCI_TXN_ID)
  private String npciTxnId;

  public GetTransactionStatusResponseData() {
  }

  public GetTransactionStatusResponseData transactionStatus(String transactionStatus) {

    
    
    
    
    this.transactionStatus = transactionStatus;
    return this;
  }

   /**
   * Get transactionStatus
   * @return transactionStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PENDING", value = "")

  public String getTransactionStatus() {
    return transactionStatus;
  }


  public void setTransactionStatus(String transactionStatus) {

    
    
    
    this.transactionStatus = transactionStatus;
  }


  public GetTransactionStatusResponseData bankReferenceNumber(String bankReferenceNumber) {

    
    
    
    
    this.bankReferenceNumber = bankReferenceNumber;
    return this;
  }

   /**
   * Get bankReferenceNumber
   * @return bankReferenceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NA", value = "")

  public String getBankReferenceNumber() {
    return bankReferenceNumber;
  }


  public void setBankReferenceNumber(String bankReferenceNumber) {

    
    
    
    this.bankReferenceNumber = bankReferenceNumber;
  }


  public GetTransactionStatusResponseData npciTxnId(String npciTxnId) {

    
    
    
    
    this.npciTxnId = npciTxnId;
    return this;
  }

   /**
   * Get npciTxnId
   * @return npciTxnId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NA", value = "")

  public String getNpciTxnId() {
    return npciTxnId;
  }


  public void setNpciTxnId(String npciTxnId) {

    
    
    
    this.npciTxnId = npciTxnId;
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
   * @return the GetTransactionStatusResponseData instance itself
   */
  public GetTransactionStatusResponseData putAdditionalProperty(String key, Object value) {
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
    GetTransactionStatusResponseData getTransactionStatusResponseData = (GetTransactionStatusResponseData) o;
    return Objects.equals(this.transactionStatus, getTransactionStatusResponseData.transactionStatus) &&
        Objects.equals(this.bankReferenceNumber, getTransactionStatusResponseData.bankReferenceNumber) &&
        Objects.equals(this.npciTxnId, getTransactionStatusResponseData.npciTxnId)&&
        Objects.equals(this.additionalProperties, getTransactionStatusResponseData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionStatus, bankReferenceNumber, npciTxnId, additionalProperties);
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
    openapiFields.add("transactionStatus");
    openapiFields.add("bankReferenceNumber");
    openapiFields.add("npciTxnId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetTransactionStatusResponseData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetTransactionStatusResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetTransactionStatusResponseData is not found in the empty JSON string", GetTransactionStatusResponseData.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("transactionStatus") != null && !jsonObj.get("transactionStatus").isJsonNull()) && !jsonObj.get("transactionStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionStatus").toString()));
      }
      if ((jsonObj.get("bankReferenceNumber") != null && !jsonObj.get("bankReferenceNumber").isJsonNull()) && !jsonObj.get("bankReferenceNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bankReferenceNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bankReferenceNumber").toString()));
      }
      if ((jsonObj.get("npciTxnId") != null && !jsonObj.get("npciTxnId").isJsonNull()) && !jsonObj.get("npciTxnId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `npciTxnId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("npciTxnId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetTransactionStatusResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetTransactionStatusResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetTransactionStatusResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetTransactionStatusResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<GetTransactionStatusResponseData>() {
           @Override
           public void write(JsonWriter out, GetTransactionStatusResponseData value) throws IOException {
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
           public GetTransactionStatusResponseData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetTransactionStatusResponseData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetTransactionStatusResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetTransactionStatusResponseData
  * @throws IOException if the JSON string is invalid with respect to GetTransactionStatusResponseData
  */
  public static GetTransactionStatusResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetTransactionStatusResponseData.class);
  }

 /**
  * Convert an instance of GetTransactionStatusResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


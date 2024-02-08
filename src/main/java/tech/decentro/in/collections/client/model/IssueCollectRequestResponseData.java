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
 * IssueCollectRequestResponseData
 */
@javax.annotation.Generated(value = "tech.decentro.in.collections")
public class IssueCollectRequestResponseData {
  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_TRANSACTION_STATUS = "transactionStatus";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_STATUS)
  private String transactionStatus;

  public static final String SERIALIZED_NAME_TRANSACTION_STATUS_DESCRIPTION = "transactionStatusDescription";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_STATUS_DESCRIPTION)
  private String transactionStatusDescription;

  public static final String SERIALIZED_NAME_BANK_REFERENCE_NUMBER = "bankReferenceNumber";
  @SerializedName(SERIALIZED_NAME_BANK_REFERENCE_NUMBER)
  private String bankReferenceNumber;

  public static final String SERIALIZED_NAME_NPCI_TRANSACTION_ID = "npciTransactionId";
  @SerializedName(SERIALIZED_NAME_NPCI_TRANSACTION_ID)
  private String npciTransactionId;

  public IssueCollectRequestResponseData() {
  }

  public IssueCollectRequestResponseData transactionId(String transactionId) {

    
    
    
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Get transactionId
   * @return transactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "XYZ", value = "")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {

    
    
    
    this.transactionId = transactionId;
  }


  public IssueCollectRequestResponseData transactionStatus(String transactionStatus) {

    
    
    
    
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


  public IssueCollectRequestResponseData transactionStatusDescription(String transactionStatusDescription) {

    
    
    
    
    this.transactionStatusDescription = transactionStatusDescription;
    return this;
  }

   /**
   * Get transactionStatusDescription
   * @return transactionStatusDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Successfully initiated the collection request.", value = "")

  public String getTransactionStatusDescription() {
    return transactionStatusDescription;
  }


  public void setTransactionStatusDescription(String transactionStatusDescription) {

    
    
    
    this.transactionStatusDescription = transactionStatusDescription;
  }


  public IssueCollectRequestResponseData bankReferenceNumber(String bankReferenceNumber) {

    
    
    
    
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


  public IssueCollectRequestResponseData npciTransactionId(String npciTransactionId) {

    
    
    
    
    this.npciTransactionId = npciTransactionId;
    return this;
  }

   /**
   * Get npciTransactionId
   * @return npciTransactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "XYZ1234", value = "")

  public String getNpciTransactionId() {
    return npciTransactionId;
  }


  public void setNpciTransactionId(String npciTransactionId) {

    
    
    
    this.npciTransactionId = npciTransactionId;
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
   * @return the IssueCollectRequestResponseData instance itself
   */
  public IssueCollectRequestResponseData putAdditionalProperty(String key, Object value) {
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
    IssueCollectRequestResponseData issueCollectRequestResponseData = (IssueCollectRequestResponseData) o;
    return Objects.equals(this.transactionId, issueCollectRequestResponseData.transactionId) &&
        Objects.equals(this.transactionStatus, issueCollectRequestResponseData.transactionStatus) &&
        Objects.equals(this.transactionStatusDescription, issueCollectRequestResponseData.transactionStatusDescription) &&
        Objects.equals(this.bankReferenceNumber, issueCollectRequestResponseData.bankReferenceNumber) &&
        Objects.equals(this.npciTransactionId, issueCollectRequestResponseData.npciTransactionId)&&
        Objects.equals(this.additionalProperties, issueCollectRequestResponseData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, transactionStatus, transactionStatusDescription, bankReferenceNumber, npciTransactionId, additionalProperties);
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
    openapiFields.add("transactionId");
    openapiFields.add("transactionStatus");
    openapiFields.add("transactionStatusDescription");
    openapiFields.add("bankReferenceNumber");
    openapiFields.add("npciTransactionId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IssueCollectRequestResponseData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!IssueCollectRequestResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssueCollectRequestResponseData is not found in the empty JSON string", IssueCollectRequestResponseData.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("transactionId") != null && !jsonObj.get("transactionId").isJsonNull()) && !jsonObj.get("transactionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionId").toString()));
      }
      if ((jsonObj.get("transactionStatus") != null && !jsonObj.get("transactionStatus").isJsonNull()) && !jsonObj.get("transactionStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionStatus").toString()));
      }
      if ((jsonObj.get("transactionStatusDescription") != null && !jsonObj.get("transactionStatusDescription").isJsonNull()) && !jsonObj.get("transactionStatusDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionStatusDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionStatusDescription").toString()));
      }
      if ((jsonObj.get("bankReferenceNumber") != null && !jsonObj.get("bankReferenceNumber").isJsonNull()) && !jsonObj.get("bankReferenceNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bankReferenceNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bankReferenceNumber").toString()));
      }
      if ((jsonObj.get("npciTransactionId") != null && !jsonObj.get("npciTransactionId").isJsonNull()) && !jsonObj.get("npciTransactionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `npciTransactionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("npciTransactionId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssueCollectRequestResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssueCollectRequestResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssueCollectRequestResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssueCollectRequestResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<IssueCollectRequestResponseData>() {
           @Override
           public void write(JsonWriter out, IssueCollectRequestResponseData value) throws IOException {
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
           public IssueCollectRequestResponseData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             IssueCollectRequestResponseData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of IssueCollectRequestResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IssueCollectRequestResponseData
  * @throws IOException if the JSON string is invalid with respect to IssueCollectRequestResponseData
  */
  public static IssueCollectRequestResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssueCollectRequestResponseData.class);
  }

 /**
  * Convert an instance of IssueCollectRequestResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


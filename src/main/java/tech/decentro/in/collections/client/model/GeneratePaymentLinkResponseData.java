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
import tech.decentro.in.collections.client.model.GeneratePaymentLinkResponseDataPspUri;

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
 * GeneratePaymentLinkResponseData
 */
@javax.annotation.Generated(value = "tech.decentro.in.collections")
public class GeneratePaymentLinkResponseData {
  public static final String SERIALIZED_NAME_GENERATED_LINK = "generatedLink";
  @SerializedName(SERIALIZED_NAME_GENERATED_LINK)
  private String generatedLink;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_TRANSACTION_STATUS = "transactionStatus";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_STATUS)
  private String transactionStatus;

  public static final String SERIALIZED_NAME_ENCODED_DYNAMIC_QR_CODE = "encodedDynamicQrCode";
  @SerializedName(SERIALIZED_NAME_ENCODED_DYNAMIC_QR_CODE)
  private String encodedDynamicQrCode;

  public static final String SERIALIZED_NAME_UPI_URI = "upiUri";
  @SerializedName(SERIALIZED_NAME_UPI_URI)
  private String upiUri;

  public static final String SERIALIZED_NAME_PSP_URI = "pspUri";
  @SerializedName(SERIALIZED_NAME_PSP_URI)
  private GeneratePaymentLinkResponseDataPspUri pspUri;

  public GeneratePaymentLinkResponseData() {
  }

  public GeneratePaymentLinkResponseData generatedLink(String generatedLink) {

    
    
    
    
    this.generatedLink = generatedLink;
    return this;
  }

   /**
   * Get generatedLink
   * @return generatedLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://decf.in/pay/bbs2czljt1", value = "")

  public String getGeneratedLink() {
    return generatedLink;
  }


  public void setGeneratedLink(String generatedLink) {

    
    
    
    this.generatedLink = generatedLink;
  }


  public GeneratePaymentLinkResponseData transactionId(String transactionId) {

    
    
    
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Get transactionId
   * @return transactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xyz", value = "")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {

    
    
    
    this.transactionId = transactionId;
  }


  public GeneratePaymentLinkResponseData transactionStatus(String transactionStatus) {

    
    
    
    
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


  public GeneratePaymentLinkResponseData encodedDynamicQrCode(String encodedDynamicQrCode) {

    
    
    
    
    this.encodedDynamicQrCode = encodedDynamicQrCode;
    return this;
  }

   /**
   * Get encodedDynamicQrCode
   * @return encodedDynamicQrCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "iVBORw0KGgoAAAANSUhEUgAAA/wAAAP8CAYAAAD7obX7AAAAAXNSR0IArs4c6QAAIABJREFUeF7s/e16Y0mSo+0q9vkf88S+4u3u...SHORTENED-BY-KONFIG...VIEqUAWqQBWoAlWgClSBKlAFqkAVuKECXfhvaGopVYEqUAWqQBWoAlWgClSBKlAFqkAV+P8BRKbBe+YKpxYAAAAASUVORK5CYII=", value = "")

  public String getEncodedDynamicQrCode() {
    return encodedDynamicQrCode;
  }


  public void setEncodedDynamicQrCode(String encodedDynamicQrCode) {

    
    
    
    this.encodedDynamicQrCode = encodedDynamicQrCode;
  }


  public GeneratePaymentLinkResponseData upiUri(String upiUri) {

    
    
    
    
    this.upiUri = upiUri;
    return this;
  }

   /**
   * Get upiUri
   * @return upiUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "upi://pay?ver=01&mode=15&am=1.00&cu=INR&pa=decentro@timecosmos&pn=Decentro%20Tech%20Pvt%20Ltd&mc=6012&tr=KJDYI74HRFIW4E7FG847&tn=Welcome%20to%20Decentro%20Test&mid=DECE1&msid=DEC1&mtid=DEC1", value = "")

  public String getUpiUri() {
    return upiUri;
  }


  public void setUpiUri(String upiUri) {

    
    
    
    this.upiUri = upiUri;
  }


  public GeneratePaymentLinkResponseData pspUri(GeneratePaymentLinkResponseDataPspUri pspUri) {

    
    
    
    
    this.pspUri = pspUri;
    return this;
  }

   /**
   * Get pspUri
   * @return pspUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GeneratePaymentLinkResponseDataPspUri getPspUri() {
    return pspUri;
  }


  public void setPspUri(GeneratePaymentLinkResponseDataPspUri pspUri) {

    
    
    
    this.pspUri = pspUri;
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
   * @return the GeneratePaymentLinkResponseData instance itself
   */
  public GeneratePaymentLinkResponseData putAdditionalProperty(String key, Object value) {
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
    GeneratePaymentLinkResponseData generatePaymentLinkResponseData = (GeneratePaymentLinkResponseData) o;
    return Objects.equals(this.generatedLink, generatePaymentLinkResponseData.generatedLink) &&
        Objects.equals(this.transactionId, generatePaymentLinkResponseData.transactionId) &&
        Objects.equals(this.transactionStatus, generatePaymentLinkResponseData.transactionStatus) &&
        Objects.equals(this.encodedDynamicQrCode, generatePaymentLinkResponseData.encodedDynamicQrCode) &&
        Objects.equals(this.upiUri, generatePaymentLinkResponseData.upiUri) &&
        Objects.equals(this.pspUri, generatePaymentLinkResponseData.pspUri)&&
        Objects.equals(this.additionalProperties, generatePaymentLinkResponseData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generatedLink, transactionId, transactionStatus, encodedDynamicQrCode, upiUri, pspUri, additionalProperties);
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
    openapiFields.add("generatedLink");
    openapiFields.add("transactionId");
    openapiFields.add("transactionStatus");
    openapiFields.add("encodedDynamicQrCode");
    openapiFields.add("upiUri");
    openapiFields.add("pspUri");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GeneratePaymentLinkResponseData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GeneratePaymentLinkResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GeneratePaymentLinkResponseData is not found in the empty JSON string", GeneratePaymentLinkResponseData.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("generatedLink") != null && !jsonObj.get("generatedLink").isJsonNull()) && !jsonObj.get("generatedLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `generatedLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("generatedLink").toString()));
      }
      if ((jsonObj.get("transactionId") != null && !jsonObj.get("transactionId").isJsonNull()) && !jsonObj.get("transactionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionId").toString()));
      }
      if ((jsonObj.get("transactionStatus") != null && !jsonObj.get("transactionStatus").isJsonNull()) && !jsonObj.get("transactionStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionStatus").toString()));
      }
      if ((jsonObj.get("encodedDynamicQrCode") != null && !jsonObj.get("encodedDynamicQrCode").isJsonNull()) && !jsonObj.get("encodedDynamicQrCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encodedDynamicQrCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encodedDynamicQrCode").toString()));
      }
      if ((jsonObj.get("upiUri") != null && !jsonObj.get("upiUri").isJsonNull()) && !jsonObj.get("upiUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upiUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upiUri").toString()));
      }
      // validate the optional field `pspUri`
      if (jsonObj.get("pspUri") != null && !jsonObj.get("pspUri").isJsonNull()) {
        GeneratePaymentLinkResponseDataPspUri.validateJsonObject(jsonObj.getAsJsonObject("pspUri"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GeneratePaymentLinkResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GeneratePaymentLinkResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GeneratePaymentLinkResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GeneratePaymentLinkResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<GeneratePaymentLinkResponseData>() {
           @Override
           public void write(JsonWriter out, GeneratePaymentLinkResponseData value) throws IOException {
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
           public GeneratePaymentLinkResponseData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GeneratePaymentLinkResponseData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GeneratePaymentLinkResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GeneratePaymentLinkResponseData
  * @throws IOException if the JSON string is invalid with respect to GeneratePaymentLinkResponseData
  */
  public static GeneratePaymentLinkResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GeneratePaymentLinkResponseData.class);
  }

 /**
  * Convert an instance of GeneratePaymentLinkResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


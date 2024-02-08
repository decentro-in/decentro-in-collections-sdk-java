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
 * GeneratePaymentLinkResponseDataPspUri
 */
@javax.annotation.Generated(value = "tech.decentro.in.collections")
public class GeneratePaymentLinkResponseDataPspUri {
  public static final String SERIALIZED_NAME_COMMON_URI = "commonUri";
  @SerializedName(SERIALIZED_NAME_COMMON_URI)
  private String commonUri;

  public static final String SERIALIZED_NAME_GPAY_URI = "gpayUri";
  @SerializedName(SERIALIZED_NAME_GPAY_URI)
  private String gpayUri;

  public static final String SERIALIZED_NAME_PHONEPE_URI = "phonepeUri";
  @SerializedName(SERIALIZED_NAME_PHONEPE_URI)
  private String phonepeUri;

  public static final String SERIALIZED_NAME_PAYTM_URI = "paytmUri";
  @SerializedName(SERIALIZED_NAME_PAYTM_URI)
  private String paytmUri;

  public GeneratePaymentLinkResponseDataPspUri() {
  }

  public GeneratePaymentLinkResponseDataPspUri commonUri(String commonUri) {

    
    
    
    
    this.commonUri = commonUri;
    return this;
  }

   /**
   * Get commonUri
   * @return commonUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "upi://pay?ver=01&mode=15&am=1.00&cu=INR&pa=decentro@timecosmos&pn=Decentro%20Tech%20Pvt%20Ltd&mc=6012&tr=KJDYI74HRFIW4E7FG847&tn=Welcome%20to%20Decentro%20Test&mid=DECE1&msid=DEC1&mtid=DEC1", value = "")

  public String getCommonUri() {
    return commonUri;
  }


  public void setCommonUri(String commonUri) {

    
    
    
    this.commonUri = commonUri;
  }


  public GeneratePaymentLinkResponseDataPspUri gpayUri(String gpayUri) {

    
    
    
    
    this.gpayUri = gpayUri;
    return this;
  }

   /**
   * Get gpayUri
   * @return gpayUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "gpay://upi/pay?ver=01&mode=15&am=1.00&cu=INR&pa=decentro@timecosmos&pn=Decentro%20Tech%20Pvt%20Ltd&mc=6012&tr=KJDYI74HRFIW4E7FG847&tn=Welcome%20to%20Decentro%20Test&mid=DECE1&msid=DEC1&mtid=DEC1", value = "")

  public String getGpayUri() {
    return gpayUri;
  }


  public void setGpayUri(String gpayUri) {

    
    
    
    this.gpayUri = gpayUri;
  }


  public GeneratePaymentLinkResponseDataPspUri phonepeUri(String phonepeUri) {

    
    
    
    
    this.phonepeUri = phonepeUri;
    return this;
  }

   /**
   * Get phonepeUri
   * @return phonepeUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "phonepe://pay?ver=01&mode=15&am=1.00&cu=INR&pa=decentro@timecosmos&pn=Decentro%20Tech%20Pvt%20Ltd&mc=6012&tr=KJDYI74HRFIW4E7FG847&tn=Welcome%20to%20Decentro%20Test&mid=DECE1&msid=DEC1&mtid=DEC1", value = "")

  public String getPhonepeUri() {
    return phonepeUri;
  }


  public void setPhonepeUri(String phonepeUri) {

    
    
    
    this.phonepeUri = phonepeUri;
  }


  public GeneratePaymentLinkResponseDataPspUri paytmUri(String paytmUri) {

    
    
    
    
    this.paytmUri = paytmUri;
    return this;
  }

   /**
   * Get paytmUri
   * @return paytmUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "paytmmp://pay?ver=01&mode=15&am=1.00&cu=INR&pa=decentro@timecosmos&pn=Decentro%20Tech%20Pvt%20Ltd&mc=6012&tr=KJDYI74HRFIW4E7FG847&tn=Welcome%20to%20Decentro%20Test&mid=DECE1&msid=DEC1&mtid=DEC1", value = "")

  public String getPaytmUri() {
    return paytmUri;
  }


  public void setPaytmUri(String paytmUri) {

    
    
    
    this.paytmUri = paytmUri;
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
   * @return the GeneratePaymentLinkResponseDataPspUri instance itself
   */
  public GeneratePaymentLinkResponseDataPspUri putAdditionalProperty(String key, Object value) {
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
    GeneratePaymentLinkResponseDataPspUri generatePaymentLinkResponseDataPspUri = (GeneratePaymentLinkResponseDataPspUri) o;
    return Objects.equals(this.commonUri, generatePaymentLinkResponseDataPspUri.commonUri) &&
        Objects.equals(this.gpayUri, generatePaymentLinkResponseDataPspUri.gpayUri) &&
        Objects.equals(this.phonepeUri, generatePaymentLinkResponseDataPspUri.phonepeUri) &&
        Objects.equals(this.paytmUri, generatePaymentLinkResponseDataPspUri.paytmUri)&&
        Objects.equals(this.additionalProperties, generatePaymentLinkResponseDataPspUri.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonUri, gpayUri, phonepeUri, paytmUri, additionalProperties);
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
    openapiFields.add("commonUri");
    openapiFields.add("gpayUri");
    openapiFields.add("phonepeUri");
    openapiFields.add("paytmUri");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GeneratePaymentLinkResponseDataPspUri
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GeneratePaymentLinkResponseDataPspUri.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GeneratePaymentLinkResponseDataPspUri is not found in the empty JSON string", GeneratePaymentLinkResponseDataPspUri.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("commonUri") != null && !jsonObj.get("commonUri").isJsonNull()) && !jsonObj.get("commonUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commonUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commonUri").toString()));
      }
      if ((jsonObj.get("gpayUri") != null && !jsonObj.get("gpayUri").isJsonNull()) && !jsonObj.get("gpayUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gpayUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gpayUri").toString()));
      }
      if ((jsonObj.get("phonepeUri") != null && !jsonObj.get("phonepeUri").isJsonNull()) && !jsonObj.get("phonepeUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phonepeUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phonepeUri").toString()));
      }
      if ((jsonObj.get("paytmUri") != null && !jsonObj.get("paytmUri").isJsonNull()) && !jsonObj.get("paytmUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paytmUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paytmUri").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GeneratePaymentLinkResponseDataPspUri.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GeneratePaymentLinkResponseDataPspUri' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GeneratePaymentLinkResponseDataPspUri> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GeneratePaymentLinkResponseDataPspUri.class));

       return (TypeAdapter<T>) new TypeAdapter<GeneratePaymentLinkResponseDataPspUri>() {
           @Override
           public void write(JsonWriter out, GeneratePaymentLinkResponseDataPspUri value) throws IOException {
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
           public GeneratePaymentLinkResponseDataPspUri read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GeneratePaymentLinkResponseDataPspUri instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GeneratePaymentLinkResponseDataPspUri given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GeneratePaymentLinkResponseDataPspUri
  * @throws IOException if the JSON string is invalid with respect to GeneratePaymentLinkResponseDataPspUri
  */
  public static GeneratePaymentLinkResponseDataPspUri fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GeneratePaymentLinkResponseDataPspUri.class);
  }

 /**
  * Convert an instance of GeneratePaymentLinkResponseDataPspUri to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


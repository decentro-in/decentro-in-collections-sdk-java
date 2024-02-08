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
 * GeneratePaymentLinkRequest
 */
@javax.annotation.Generated(value = "tech.decentro.in.collections")
public class GeneratePaymentLinkRequest {
  public static final String SERIALIZED_NAME_REFERENCE_ID = "reference_id";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  public static final String SERIALIZED_NAME_PAYEE_ACCOUNT = "payee_account";
  @SerializedName(SERIALIZED_NAME_PAYEE_ACCOUNT)
  private String payeeAccount;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_PURPOSE_MESSAGE = "purpose_message";
  @SerializedName(SERIALIZED_NAME_PURPOSE_MESSAGE)
  private String purposeMessage;

  public static final String SERIALIZED_NAME_GENERATE_QR = "generate_qr";
  @SerializedName(SERIALIZED_NAME_GENERATE_QR)
  private Integer generateQr;

  public static final String SERIALIZED_NAME_EXPIRY_TIME = "expiry_time";
  @SerializedName(SERIALIZED_NAME_EXPIRY_TIME)
  private Integer expiryTime;

  public static final String SERIALIZED_NAME_CUSTOMIZED_QR_WITH_LOGO = "customized_qr_with_logo";
  @SerializedName(SERIALIZED_NAME_CUSTOMIZED_QR_WITH_LOGO)
  private Integer customizedQrWithLogo;

  public static final String SERIALIZED_NAME_GENERATE_URI = "generate_uri";
  @SerializedName(SERIALIZED_NAME_GENERATE_URI)
  private Integer generateUri;

  public GeneratePaymentLinkRequest() {
  }

  public GeneratePaymentLinkRequest referenceId(String referenceId) {
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


  public GeneratePaymentLinkRequest payeeAccount(String payeeAccount) {
    // x-konfig-strip
    payeeAccount = StringUtils.strip(payeeAccount);

    
    
    if (payeeAccount.length() < 1) {
      throw new IllegalArgumentException("Invalid value for payeeAccount. Length must be greater than or equal to 1.");
    }
    
    this.payeeAccount = payeeAccount;
    return this;
  }

   /**
   * Get payeeAccount
   * @return payeeAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "00000000000000000", required = true, value = "")

  public String getPayeeAccount() {
    return payeeAccount;
  }


  public void setPayeeAccount(String payeeAccount) {
    // x-konfig-strip
    payeeAccount = StringUtils.strip(payeeAccount);

    
    
    if (payeeAccount.length() < 1) {
      throw new IllegalArgumentException("Invalid value for payeeAccount. Length must be greater than or equal to 1.");
    }
    this.payeeAccount = payeeAccount;
  }


  public GeneratePaymentLinkRequest amount(Double amount) {

    if (amount <= 0) {
      throw new IllegalArgumentException("Invalid value for amount. Must be greater than 0.");
    }
    
    
    
    this.amount = amount;
    return this;
  }

  public GeneratePaymentLinkRequest amount(Integer amount) {

    if (amount <= 0) {
      throw new IllegalArgumentException("Invalid value for amount. Must be greater than 0.");
    }
    
    
    
    this.amount = amount.doubleValue();
    return this;
  }

   /**
   * Get amount
   * minimum: 0
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "4", required = true, value = "")

  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {

    if (amount <= 0) {
      throw new IllegalArgumentException("Invalid value for amount. Must be greater than 0.");
    }
    
    
    this.amount = amount;
  }


  public GeneratePaymentLinkRequest purposeMessage(String purposeMessage) {
    // x-konfig-strip
    purposeMessage = StringUtils.strip(purposeMessage);

    
    
    if (purposeMessage.length() < 1) {
      throw new IllegalArgumentException("Invalid value for purposeMessage. Length must be greater than or equal to 1.");
    }
    
    this.purposeMessage = purposeMessage;
    return this;
  }

   /**
   * Get purposeMessage
   * @return purposeMessage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Welcome to Decentro", required = true, value = "")

  public String getPurposeMessage() {
    return purposeMessage;
  }


  public void setPurposeMessage(String purposeMessage) {
    // x-konfig-strip
    purposeMessage = StringUtils.strip(purposeMessage);

    
    
    if (purposeMessage.length() < 1) {
      throw new IllegalArgumentException("Invalid value for purposeMessage. Length must be greater than or equal to 1.");
    }
    this.purposeMessage = purposeMessage;
  }


  public GeneratePaymentLinkRequest generateQr(Integer generateQr) {

    if (generateQr < 0) {
      throw new IllegalArgumentException("Invalid value for generateQr. Must be greater than or equal to 0.");
    }
    if (generateQr > 1) {
      throw new IllegalArgumentException("Invalid value for generateQr. Must be less than or equal to 1.");
    }
    
    
    this.generateQr = generateQr;
    return this;
  }

   /**
   * Get generateQr
   * minimum: 0
   * maximum: 1
   * @return generateQr
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "")

  public Integer getGenerateQr() {
    return generateQr;
  }


  public void setGenerateQr(Integer generateQr) {

    if (generateQr < 0) {
      throw new IllegalArgumentException("Invalid value for generateQr. Must be greater than or equal to 0.");
    }
    if (generateQr > 1) {
      throw new IllegalArgumentException("Invalid value for generateQr. Must be less than or equal to 1.");
    }
    
    this.generateQr = generateQr;
  }


  public GeneratePaymentLinkRequest expiryTime(Integer expiryTime) {

    if (expiryTime <= 0) {
      throw new IllegalArgumentException("Invalid value for expiryTime. Must be greater than 0.");
    }
    
    
    
    this.expiryTime = expiryTime;
    return this;
  }

   /**
   * Get expiryTime
   * minimum: 0
   * @return expiryTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "")

  public Integer getExpiryTime() {
    return expiryTime;
  }


  public void setExpiryTime(Integer expiryTime) {

    if (expiryTime <= 0) {
      throw new IllegalArgumentException("Invalid value for expiryTime. Must be greater than 0.");
    }
    
    
    this.expiryTime = expiryTime;
  }


  public GeneratePaymentLinkRequest customizedQrWithLogo(Integer customizedQrWithLogo) {

    
    
    
    
    this.customizedQrWithLogo = customizedQrWithLogo;
    return this;
  }

   /**
   * Get customizedQrWithLogo
   * @return customizedQrWithLogo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getCustomizedQrWithLogo() {
    return customizedQrWithLogo;
  }


  public void setCustomizedQrWithLogo(Integer customizedQrWithLogo) {

    
    
    
    this.customizedQrWithLogo = customizedQrWithLogo;
  }


  public GeneratePaymentLinkRequest generateUri(Integer generateUri) {

    
    
    
    
    this.generateUri = generateUri;
    return this;
  }

   /**
   * Get generateUri
   * @return generateUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getGenerateUri() {
    return generateUri;
  }


  public void setGenerateUri(Integer generateUri) {

    
    
    
    this.generateUri = generateUri;
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
   * @return the GeneratePaymentLinkRequest instance itself
   */
  public GeneratePaymentLinkRequest putAdditionalProperty(String key, Object value) {
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
    GeneratePaymentLinkRequest generatePaymentLinkRequest = (GeneratePaymentLinkRequest) o;
    return Objects.equals(this.referenceId, generatePaymentLinkRequest.referenceId) &&
        Objects.equals(this.payeeAccount, generatePaymentLinkRequest.payeeAccount) &&
        Objects.equals(this.amount, generatePaymentLinkRequest.amount) &&
        Objects.equals(this.purposeMessage, generatePaymentLinkRequest.purposeMessage) &&
        Objects.equals(this.generateQr, generatePaymentLinkRequest.generateQr) &&
        Objects.equals(this.expiryTime, generatePaymentLinkRequest.expiryTime) &&
        Objects.equals(this.customizedQrWithLogo, generatePaymentLinkRequest.customizedQrWithLogo) &&
        Objects.equals(this.generateUri, generatePaymentLinkRequest.generateUri)&&
        Objects.equals(this.additionalProperties, generatePaymentLinkRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceId, payeeAccount, amount, purposeMessage, generateQr, expiryTime, customizedQrWithLogo, generateUri, additionalProperties);
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
    openapiFields.add("payee_account");
    openapiFields.add("amount");
    openapiFields.add("purpose_message");
    openapiFields.add("generate_qr");
    openapiFields.add("expiry_time");
    openapiFields.add("customized_qr_with_logo");
    openapiFields.add("generate_uri");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("reference_id");
    openapiRequiredFields.add("payee_account");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("purpose_message");
    openapiRequiredFields.add("generate_qr");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GeneratePaymentLinkRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GeneratePaymentLinkRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GeneratePaymentLinkRequest is not found in the empty JSON string", GeneratePaymentLinkRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GeneratePaymentLinkRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("reference_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference_id").toString()));
      }
      if (!jsonObj.get("payee_account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee_account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee_account").toString()));
      }
      if (!jsonObj.get("purpose_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `purpose_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("purpose_message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GeneratePaymentLinkRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GeneratePaymentLinkRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GeneratePaymentLinkRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GeneratePaymentLinkRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GeneratePaymentLinkRequest>() {
           @Override
           public void write(JsonWriter out, GeneratePaymentLinkRequest value) throws IOException {
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
           public GeneratePaymentLinkRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GeneratePaymentLinkRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GeneratePaymentLinkRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GeneratePaymentLinkRequest
  * @throws IOException if the JSON string is invalid with respect to GeneratePaymentLinkRequest
  */
  public static GeneratePaymentLinkRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GeneratePaymentLinkRequest.class);
  }

 /**
  * Convert an instance of GeneratePaymentLinkRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


/*
 * decentro-in-collections
 * Collections
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: admin@decentro.tech
 *
 * Do not edit the class manually.
 */


package tech.decentro.in.collections.client;

@javax.annotation.Generated(value = "tech.decentro.in.collections")
public class Configuration {
    private static ApiClient defaultApiClient = new ApiClient();
    public boolean verifyingSsl = true;
    public String host = "https://in.staging.decentro.tech";
    public String client_id;
    public String client_secret;
    public String module_secret;
    public String provider_secret;

    /**
     * Get the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @return Default API client
     */
    public static ApiClient getDefaultApiClient() {
        return defaultApiClient;
    }

    /**
     * Set the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @param apiClient API client
     */
    public static void setDefaultApiClient(ApiClient apiClient) {
        defaultApiClient = apiClient;
    }
}

package tech.decentro.in.collections.client;

import tech.decentro.in.collections.client.api.CollectionsApi;

public class Decentro {
    private ApiClient apiClient;
    public final CollectionsApi collections;

    public Decentro() {
        this(null);
    }

    public Decentro(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.collections = new CollectionsApi(this.apiClient);
    }

}

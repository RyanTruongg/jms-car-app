package com.cars.app.client.dealer.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.cars.app.client.dealer.ClientConfiguration;

@FeignClient(name = "${dealerResource.name:dealerResource}", configuration = ClientConfiguration.class)
public interface DealerResourceApiClient extends DealerResourceApi {
}

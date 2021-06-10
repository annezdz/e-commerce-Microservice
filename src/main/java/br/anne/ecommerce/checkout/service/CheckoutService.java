package br.anne.ecommerce.checkout.service;


import br.anne.ecommerce.checkout.entity.CheckoutEntity;
import br.anne.ecommerce.checkout.resource.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);
}

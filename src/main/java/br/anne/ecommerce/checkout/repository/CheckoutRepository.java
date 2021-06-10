package br.anne.ecommerce.checkout.repository;

import br.anne.ecommerce.checkout.entity.CheckoutEntity;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CheckoutRepository extends JpaRepository<CheckoutEntity, Long> {
}

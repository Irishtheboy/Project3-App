package za.co.admatech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.admatech.domain.Payment;
import za.co.admatech.domain.enums.PaymentStatus;

import java.time.LocalDate;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Payment findByPaymentId(String paymentId);

    Payment findByTransactionId(String transactionId);

    Payment findByCreatedAt(LocalDate createdAt);

    Payment findByPaymentStatus(PaymentStatus paymentStatus);

    void deleteByPaymentId(String paymentId);
}
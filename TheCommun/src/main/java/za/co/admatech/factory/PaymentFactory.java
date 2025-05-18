package za.co.admatech.factory;

import za.co.admatech.domain.Payment;
import za.co.admatech.domain.enums.PaymentStatus;
import java.time.LocalDate;

public class PaymentFactory {

    // Factory method to create a Payment with default values
    public static Payment createDefaultPayment() {
        return new Payment.Builder()
                .setPaymentId("DefaultPaymentID")
                .setTransactionId("DefaultTransactionID")
                .setCreatedAt(LocalDate.now())
                .setPaymentStatus(PaymentStatus.PENDING)
                .build();
    }


    public static Payment createPayment(String paymentId, String transactionId, LocalDate createdAt, PaymentStatus paymentStatus) {
        return new Payment.Builder()
                .setPaymentId(paymentId)
                .setTransactionId(transactionId)
                .setCreatedAt(createdAt)
                .setPaymentStatus(paymentStatus)
                .build();
    }

    public static Payment createCopyOfPayment(Payment existingPayment) {
        return new Payment.Builder()
                .copy(existingPayment)
                .build();
    }

    public static Payment createCompletedPayment(String paymentId, String transactionId) {
        return new Payment.Builder()
                .setPaymentId(paymentId)
                .setTransactionId(transactionId)
                .setCreatedAt(LocalDate.now())
                .setPaymentStatus(PaymentStatus.COMPLETED)
                .build();
    }

    public static Payment createFailedPayment(String paymentId, String transactionId, LocalDate createdAt) {
        return new Payment.Builder()
                .setPaymentId(paymentId)
                .setTransactionId(transactionId)
                .setCreatedAt(createdAt)
                .setPaymentStatus(PaymentStatus.FAILED)
                .build();
    }

    public static Payment createPendingPayment(String paymentId, String transactionId) {
        return new Payment.Builder()
                .setPaymentId(paymentId)
                .setTransactionId(transactionId)
                .setCreatedAt(LocalDate.now())
                .setPaymentStatus(PaymentStatus.PENDING)
                .build();
    }
}
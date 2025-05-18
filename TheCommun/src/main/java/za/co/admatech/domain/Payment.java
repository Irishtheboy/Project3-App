package za.co.admatech.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import za.co.admatech.domain.enums.PaymentStatus;

import java.time.LocalDate;

@Entity
public class Payment {
    @Id
    private String paymentId;
    private String transactionId;
    private LocalDate createdAt;
    private PaymentStatus paymentStatus;

    public Payment() {
    }

    private Payment(Builder builder) {
        this.paymentId = builder.paymentId;
        this.transactionId = builder.transactionId;
        this.createdAt = builder.createdAt;
        this.paymentStatus = builder.paymentStatus;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId='" + paymentId + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", createdAt=" + createdAt +
                ", paymentStatus=" + paymentStatus +
                '}';
    }

    public static class Builder {
        private String paymentId;
        private String transactionId;
        private LocalDate createdAt;
        private PaymentStatus paymentStatus;

        public Builder setPaymentId(String paymentId) {
            this.paymentId = paymentId;
            return this;
        }

        public Builder setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        public Builder setCreatedAt(LocalDate createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setPaymentStatus(PaymentStatus paymentStatus) {
            this.paymentStatus = paymentStatus;
            return this;
        }

        public Builder copy(Payment payment) {
            this.paymentId = payment.paymentId;
            this.transactionId = payment.transactionId;
            this.createdAt = payment.createdAt;
            this.paymentStatus = payment.paymentStatus;
            return this;
        }

        public Payment build() {
            return new Payment(this);
        }
    }
}
package za.co.admatech.domain;

public class JobProvider extends User {
    private double averageRating;

    private JobProvider(Builder builder) {
        super(builder);
        this.averageRating = builder.averageRating;
    }

    public double getAverageRating() {
        return averageRating;
    }

    @Override
    public String toString() {
        return super.toString() + ", averageRating=" + averageRating;
    }

    public static class Builder extends User.Builder {
        private double averageRating;

        public Builder setAverageRating(double averageRating) {
            this.averageRating = averageRating;
            return this;
        }

        @Override
        public Builder setUserId(String userId) {
            super.setUserId(userId);
            return this;
        }

        @Override
        public Builder setFirstName(String firstName) {
            super.setFirstName(firstName);
            return this;
        }

        @Override
        public Builder setLastName(String lastName) {
            super.setLastName(lastName);
            return this;
        }

        @Override
        public Builder setEmail(String email) {
            super.setEmail(email);
            return this;
        }

        @Override
        public Builder setPhoneNumber(String phoneNumber) {
            super.setPhoneNumber(phoneNumber);
            return this;
        }

        @Override
        public Builder setPasswordHash(String passwordHash) {
            super.setPasswordHash(passwordHash);
            return this;
        }

        @Override
        public JobProvider build() {
            return new JobProvider(this);
        }
    }
}

package za.co.admatech.domain;

public class JobProvider extends User {
    private double averageRating;

    public JobProvider() {
        super();
    }

    public JobProvider(Builder builder) {
        super(builder);
        this.averageRating = builder.averageRating;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    @Override
    public String toString() {
        return "JobProvider{" +
                "userId='" + getUserId() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", passwordHash='" + getPasswordHash() + '\'' +
                ", averageRating=" + averageRating +
                '}';
    }

    public static class Builder extends User.Builder {
        private double averageRating;

        public Builder setAverageRating(double averageRating) {
            this.averageRating = averageRating;
            return this;
        }

        @Override
        public JobProvider build() {
            return new JobProvider(this);
        }
    }
}

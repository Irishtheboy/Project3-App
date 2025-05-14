package za.co.admatech.domain;

public class Member extends User {
    private double averageRating;

    public Member() {
        super();
    }

    public Member(Builder builder) {
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
        return "Member{" +
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
        public Member build() {
            return new Member(this);
        }
    }
}

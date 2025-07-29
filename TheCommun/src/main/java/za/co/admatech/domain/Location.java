package za.co.admatech.domain;

public class Location {

 private double latitude;
 private double longitude;
 private String address;
 private String city;
 private String zipCode;

    public Location() {
    }

    public Location (Builder builder){
        this.latitude = builder.latitude;
        this.longitude = builder.longitude;
        this.address = builder.address;
        this.city = builder.city;
        this.zipCode = builder.zipCode;

    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return "Location{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
    
    public static class Builder{

        private double latitude;
        private double longitude;
        private String address;
        private String city;
        private String zipCode;

        public Builder setLatitude(double latitude) {
            this.latitude = latitude;
            return this;
        }

        public Builder setLongitude(double longitude) {
            this.longitude = longitude;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setZipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }
        
        public Builder copy(Location location){
            this.latitude = location.latitude;
            this.longitude = location.longitude;
            this.address = location.address;
            this.city = location.city;
            this.zipCode = location.zipCode;
            return this;
        }
        public Location build(){return new Location(this);}
    }
}

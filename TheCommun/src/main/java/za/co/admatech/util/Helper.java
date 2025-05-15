package za.co.admatech.util;
// will change over time
import org.apache.commons.validator.routines.EmailValidator;
import za.co.admatech.domain.enums.DisputeStatus;

import java.time.LocalDate;
import java.util.UUID;

public class Helper {
    public static boolean isNullOrEmpty(String s) {
        if (s.isEmpty() || s == null)
            return true;
        return false;
    }

    public static String generateId() {
        return UUID.randomUUID().toString();
    }

    public static boolean isValidEmail(String email) {
        EmailValidator validator = EmailValidator.getInstance();
        if (validator.isValid(email)) {
            return true;
        }else {
            return false;
        }
    }
    // Todo: isValidPostalCode method - 4 digits with range 1000 to 9999
    public static boolean isValidPostalCode(short postalCode) {
        if (postalCode < 1000 || postalCode > 9999) {
            return false;
        }
        return true;
    }

    // Todo: isValidStreetNumber method - 1 to 5 digits with range 1 to 99999
    public static boolean isValidStreetNumber(short streetNumber) {
        if (streetNumber < 1 || streetNumber > 99999) {
            return false;
        }
        return true;
    }

    public static boolean isValidLocalDate(LocalDate date) {
        if (date == null) {
            return false;
        }
        LocalDate today = LocalDate.now();
        return (!date.isAfter(today)) && date.getYear() >= 1900;
    }


    public static boolean isValidPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            return false;
        }
        return true;
    }



    public static boolean isValidDisputeStatus(String status) {
        if (status == null || status.isEmpty()) {
            return false;
        }

        for (DisputeStatus ds : DisputeStatus.values()) {
            if (ds.name().equalsIgnoreCase(status) || ds.getStatus().equalsIgnoreCase(status)) {
                return true;
            }
        }

        return false;
    }
    public static boolean isValidDisputeStatus(DisputeStatus status) {
        if (status == null) {
            return false;
        }
        for (DisputeStatus ds : DisputeStatus.values()) {
            if (ds == status) {
                return true;
            }
        }
        return false;
    }
}

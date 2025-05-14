package za.co.admatech.factory;

import za.co.admatech.domain.Member;
import za.co.admatech.util.Helper;

public class MemberFactory {
    public static Member createMember(
            String userId,
            String firstName,
            String lastName,
            String email,
            String phoneNumber,
            String passwordHash,
            double averageRating
    ) {
        // Basic validations
        if (Helper.isNullOrEmpty(userId) ||
                Helper.isNullOrEmpty(firstName) ||
                Helper.isNullOrEmpty(lastName) ||
                !Helper.isValidEmail(email) ||
                !Helper.isValidPhoneNumber(phoneNumber) ||
                Helper.isNullOrEmpty(passwordHash)) {
            return null;
        }

        return new Member.Builder()
                .setUserId(userId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setPhoneNumber(phoneNumber)
                .setPasswordHash(passwordHash)
                .setAverageRating(averageRating)
                .build();
    }

}

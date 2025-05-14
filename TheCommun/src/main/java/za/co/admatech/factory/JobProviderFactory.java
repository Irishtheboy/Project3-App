package za.co.admatech.factory;

import za.co.admatech.domain.JobProvider;
import za.co.admatech.util.Helper;

public class JobProviderFactory {
    public static JobProvider createJobProvider(
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

        return new JobProvider.Builder()
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

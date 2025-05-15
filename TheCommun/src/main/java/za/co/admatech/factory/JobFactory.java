package za.co.admatech.factory;

import za.co.admatech.domain.Job;
import za.co.admatech.domain.enums.JobStatus;
import za.co.admatech.util.Helper;

import java.time.LocalDate;

public class JobFactory {
    public static Job createJob(short jobId, String title, String description, String category) {
        if (Helper.isNullOrEmpty(title) || Helper.isNullOrEmpty(description) || Helper.isNullOrEmpty(category))
            return null;

        return new Job.Builder()
                .setJobId(jobId)
                .setTitle(title)
                .setDescription(description)
                .setCategory(category)
                .build();

    }

    public static Job createJob(short jobId, String title, String description, String category, LocalDate postedDate, JobStatus jobStatus) {
        if (Helper.isNullOrEmpty(title) || Helper.isNullOrEmpty(description) || Helper.isNullOrEmpty(category))
            return null;

        if (Helper.isValidLocalDate(postedDate))
            return null;

        //is valid job status

        return new Job.Builder()
                .setJobId(jobId)
                .setTitle(title)
                .setDescription(description)
                .setCategory(category)
                .setPostedDate(postedDate)
                .setJobStatus(jobStatus)
                .build();
    }
}

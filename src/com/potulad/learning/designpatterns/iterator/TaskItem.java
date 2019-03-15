package com.potulad.learning.designpatterns.iterator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

/**
 * A java POJO that contains information about a task
 */
@AllArgsConstructor
@Getter
public class TaskItem {

    /**
     * Task ID. E.g. 1123123
     */
    private final long taskId;

    /**
     * Task name. E.g. GenerateReportTask
     */
    @NonNull
    private final String taskName;

    /**
     * The time when the task was requested in milliseconds
     */
    private final long taskStartDateInMillis;

    @Override
    public String toString() {
        return "[" + taskName + " : " + taskId + " : " + taskStartDateInMillis +  "]";
    }
}

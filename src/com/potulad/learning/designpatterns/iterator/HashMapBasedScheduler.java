package com.potulad.learning.designpatterns.iterator;

import lombok.NonNull;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * A scheduler that uses HashMap based implementation to store taskItems
 */
public class HashMapBasedScheduler extends Scheduler {

    /**
     * A HashMap with the taskIds (of a taskItem) as the key and the taskItem as the value.
     */
    private final Map<Long, TaskItem> taskItemMap = new HashMap<>();

    @Override
    public void process(@NonNull TaskItem taskItem) {
        System.out.println("Process HashMap taskItem - " + taskItem);
    }

    @Override
    public void addTaskItem(@NonNull TaskItem taskItem) {
        if(!taskItemMap.containsKey(taskItem.getTaskId())) {
            taskItemMap.put(taskItem.getTaskId(), taskItem);
        }
    }

    @Override
    public Iterator<TaskItem> getIterator() {
        return taskItemMap.values().iterator();
    }
}

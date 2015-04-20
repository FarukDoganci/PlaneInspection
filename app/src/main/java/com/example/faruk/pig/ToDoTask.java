package com.example.faruk.pig;

public class ToDoTask {

    // At this moment our task will only have one string
    private String mTask = "";

    // Constructor with initial String
    public ToDoTask (String stringTask) {

        mTask = stringTask;

    }
    // Get task as String
    public String getTask() {

        return mTask;

    }

    // Set task as string
    public void setTask(String task) {

        mTask = task;

    }



}
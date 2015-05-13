package com.example.faruk.pig;

public class StepsToCheck {

    // At this moment our task will only have one string
    private int mTask;

    public int getID() {
        return ID;
    }

    private int ID = -1;


    // Constructor with initial String
    public StepsToCheck(int stringTask) {

        mTask = stringTask;
       this.ID = ID;
        ID++;
    }

    // Get task as String
    public int getTask() {

        return mTask;

    }

    // Set task as string
    public void setTask(int task) {

        mTask = task;

    }


}
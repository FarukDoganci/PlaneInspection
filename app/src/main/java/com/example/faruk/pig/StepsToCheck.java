package com.example.faruk.pig;

public class StepsToCheck {

    // At this moment our task will only have one string
    private int mTask;
    private int ID;


    // Constructor with initial String
    public StepsToCheck(int stringTask, int ID) {

        mTask = stringTask;
        this.ID = ID;
    }

    public StepsToCheck(int stringTask) {
        mTask = stringTask;
    }




    // Get task as String
    public int getTask() {

        return mTask;

    }

    // Set task as string
    public void setTask(int task) {

        mTask = task;

    }

    public int getID() {

        return ID;
    }


}
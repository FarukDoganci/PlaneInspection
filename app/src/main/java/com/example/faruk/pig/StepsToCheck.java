package com.example.faruk.pig;

/**
 * @author Faruk Doganci, Marc Fink, Marco Mancuso
 *         This class creates the steps with a String and ID.
 */
public class StepsToCheck {

    private int mTask;
    private int ID;


    // Constructor with initial String and ID
    public StepsToCheck(int stringTask, int ID) {

        mTask = stringTask;
        this.ID = ID;
    }
    // don't use this constructor if you are going to extend the info function

    public StepsToCheck(int stringTask) {
        mTask = stringTask;
    }


    // Get task as String
    public int getTask() {

        return mTask;

    }

    public int getID() {

        return ID;
    }


}
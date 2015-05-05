package com.example.faruk.pig;

import java.util.ArrayList;
import java.util.List;

/* Manager of tasks. Basically it's the checklist with all the tasks.
   All tasks are hard-written.
*/
public class CheckingStepManager {

    // List to store all the tasks
    private List<StepsToCheck> ListToCheck;


    public CheckingStepManager() {


        ListToCheck = new ArrayList<StepsToCheck>();

        // Generate random tasks
// need to finish this by today

        // i = 0
        StepsToCheck title_1 = new StepsToCheck(R.string.title);
        ListToCheck.add(title_1);

        // i = 1
        StepsToCheck desc_1 = new StepsToCheck(R.string.describtion);
        ListToCheck.add(desc_1);

        // i = 2
        StepsToCheck map_1 = new StepsToCheck(R.string.map);
        ListToCheck.add(map_1);

        // i = 3
        StepsToCheck Step_1A = new StepsToCheck(R.string.task_1a);
        ListToCheck.add(Step_1A);

        // i = 4
        StepsToCheck Step_1B = new StepsToCheck(R.string.task_1b);
        ListToCheck.add(Step_1B);

        // i = 5
        StepsToCheck Step_2A = new StepsToCheck(R.string.task_2a);
        ListToCheck.add(Step_2A);

        // i = 6
        StepsToCheck Step_2B = new StepsToCheck(R.string.task_2b);
        ListToCheck.add(Step_2B);

        // i = 7
        StepsToCheck Step_3A = new StepsToCheck(R.string.task_3a);
        ListToCheck.add(Step_3A);

        // i = 8
        StepsToCheck Step_3B = new StepsToCheck(R.string.task_3b);
        ListToCheck.add(Step_3B);

    }


    //Return all tasks
    public List<StepsToCheck> getToDoList() {

        return ListToCheck;
    }

}
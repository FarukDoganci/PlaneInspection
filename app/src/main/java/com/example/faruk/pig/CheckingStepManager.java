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

        StepsToCheck title_1 = new StepsToCheck(R.string.title);
        ListToCheck.add(title_1);

        StepsToCheck desc_1 = new StepsToCheck(R.string.describtion);
        ListToCheck.add(desc_1);

        StepsToCheck map_1 = new StepsToCheck(R.string.map);
        ListToCheck.add(map_1);

        StepsToCheck Step_1A = new StepsToCheck(R.string.task_1a);
        ListToCheck.add(Step_1A);

        StepsToCheck Step_1B = new StepsToCheck(R.string.task_1b);
        ListToCheck.add(Step_1B);

        StepsToCheck Step_2A = new StepsToCheck(R.string.task_2a);
        ListToCheck.add(Step_2A);

        StepsToCheck Step_2B = new StepsToCheck(R.string.task_2b);
        ListToCheck.add(Step_2B);

        StepsToCheck Step_3 = new StepsToCheck(R.string.task_3);
        ListToCheck.add(Step_3);

    }


    //Return all tasks
    public List<StepsToCheck> getToDoList() {

        return ListToCheck;
    }

}
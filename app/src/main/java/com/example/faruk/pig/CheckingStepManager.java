package com.example.faruk.pig;

import java.util.ArrayList;
import java.util.List;

/* Manager of tasks. Basically it's a list with all the tasks. At this moment only 4.
   All tasks are hard-written but in the next version they'll be originated by voice
*/
public class CheckingStepManager {

    // List to store all the tasks
    private List<StepsToCheck> ListToCheck;


    public CheckingStepManager(){


        ListToCheck = new ArrayList<StepsToCheck>();

        // Generate random tasks
// need to finish this by today

        StepsToCheck title_1 = new StepsToCheck(R.string.title);
        ListToCheck.add(title_1);

        StepsToCheck desc_1 = new StepsToCheck(R.string.describtion);
        ListToCheck.add(desc_1);

        StepsToCheck map_1 = new StepsToCheck(R.string.map);
        ListToCheck.add(map_1);

        StepsToCheck Step_1 = new StepsToCheck(R.string.task_1);
        ListToCheck.add(Step_1);

        StepsToCheck Step_2 = new StepsToCheck(R.string.task_2);
        ListToCheck.add(Step_2);

        StepsToCheck Step_3 = new StepsToCheck(R.string.task_3);
        ListToCheck.add(Step_3);

    }

    //Return all tasks
    public List<StepsToCheck> getToDoList() {

        return ListToCheck;
    }

}
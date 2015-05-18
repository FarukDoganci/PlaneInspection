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
        StepsToCheck title_1 = new StepsToCheck(R.string.title, 0);
        ListToCheck.add(title_1);

        // i = 1
        StepsToCheck desc_1 = new StepsToCheck(R.string.describtion, 0);
        ListToCheck.add(desc_1);

        // i = 2
        StepsToCheck map_1 = new StepsToCheck(R.string.map, 0);
        ListToCheck.add(map_1);

        // i = 3
        StepsToCheck Step_1A = new StepsToCheck(R.string.task_1a, 1);
        ListToCheck.add(Step_1A);

        // i = 4
        StepsToCheck Step_1B = new StepsToCheck(R.string.task_1b, 1);
        ListToCheck.add(Step_1B);

        // i = 5
        StepsToCheck Step_2A = new StepsToCheck(R.string.task_2a, 2);
        ListToCheck.add(Step_2A);

        // i = 6
        StepsToCheck Step_2B = new StepsToCheck(R.string.task_2b, 2);
        ListToCheck.add(Step_2B);

        // i = 7
        StepsToCheck Step_3A = new StepsToCheck(R.string.task_3a, 3);
        ListToCheck.add(Step_3A);

        // i = 8
        StepsToCheck Step_3B = new StepsToCheck(R.string.task_3b, 3);
        ListToCheck.add(Step_3B);

        // i = 9
        StepsToCheck Step_4A = new StepsToCheck(R.string.task_4a);
        ListToCheck.add(Step_4A);

        // i = 10
        StepsToCheck Step_4B = new StepsToCheck(R.string.task_4b);
        ListToCheck.add(Step_4B);

        // i = 11
        StepsToCheck Step_5A = new StepsToCheck(R.string.task_5a);
        ListToCheck.add(Step_5A);

        // i = 12
        StepsToCheck Step_5B = new StepsToCheck(R.string.task_5b);
        ListToCheck.add(Step_5B);

        // i = 13
        StepsToCheck Step_6A = new StepsToCheck(R.string.task_6a);
        ListToCheck.add(Step_6A);

        // i = 14
        StepsToCheck Step_7A = new StepsToCheck(R.string.task_7a);
        ListToCheck.add(Step_7A);

        // i = 15
        StepsToCheck Step_7B = new StepsToCheck(R.string.task_7b);
        ListToCheck.add(Step_7B);

        // i = 16
        StepsToCheck Step_8A = new StepsToCheck(R.string.task_8a);
        ListToCheck.add(Step_8A);

        // i = 17
        StepsToCheck Step_8B = new StepsToCheck(R.string.task_8b);
        ListToCheck.add(Step_8B);

        // i = 18
        StepsToCheck Step_9A = new StepsToCheck(R.string.task_9a);
        ListToCheck.add(Step_9A);

        // i = 19
        StepsToCheck Step_9B = new StepsToCheck(R.string.task_9b);
        ListToCheck.add(Step_9B);

        // i = 20
        StepsToCheck Step_10A = new StepsToCheck(R.string.task_10a);
        ListToCheck.add(Step_10A);

        // i = 21
        StepsToCheck Step_11A = new StepsToCheck(R.string.task_11a);
        ListToCheck.add(Step_11A);

        // i = 22
        StepsToCheck Step_11B = new StepsToCheck(R.string.task_11b);
        ListToCheck.add(Step_11B);

        // i = 23
        StepsToCheck Step_12A = new StepsToCheck(R.string.task_12a);
        ListToCheck.add(Step_12A);

        // i = 24
        StepsToCheck Step_12B = new StepsToCheck(R.string.task_12b);
        ListToCheck.add(Step_12B);

        // i = 25
        StepsToCheck Step_13A = new StepsToCheck(R.string.task_13a);
        ListToCheck.add(Step_13A);

        // i = 26
        StepsToCheck Step_13B = new StepsToCheck(R.string.task_13b);
        ListToCheck.add(Step_13B);

        // i = 27
        StepsToCheck Step_14A = new StepsToCheck(R.string.task_14a);
        ListToCheck.add(Step_14A);

        // i = 28
        StepsToCheck Step_14B = new StepsToCheck(R.string.task_14b);
        ListToCheck.add(Step_14B);

        }




    //Return all tasks
    public List<StepsToCheck> getToDoList() {

        return ListToCheck;
    }

}
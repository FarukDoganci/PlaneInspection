package com.example.faruk.pig;

import java.util.ArrayList;
import java.util.List;

import com.google.android.glass.app.Card;

/* Manager of tasks. Basically it's a list with all the tasks. At this moment only 4.
   All tasks are hard-written but in the next version they'll be originated by voice
*/
public class ToDoListManager {

    // List to store all the tasks
    private List<ToDoTask> mToDoList;

    public ToDoListManager (){


        mToDoList = new ArrayList<ToDoTask>();

        // Generate random tasks

        ToDoTask task_1 = new ToDoTask("1. LH FWD FUSELAGE\n" +
                "\n- Passenger/crew Door check" +
                "\n- F/O / CAPT / STBY static ports" +
                "\n- AOA 1 probe" +
                "\n- Avionics equipment" +
                "\n- Oxygen overboard discharge indicator");
        mToDoList.add(task_1);

        ToDoTask task_2 = new ToDoTask("2. NOSE SECTION" +
                "\n- Cockpit Windshield" +
                "\n- Radome and latches" +
                "\n- Pilot probes" +
                "\n- Antennas" +
                "\n- TAT probes");
        mToDoList.add(task_2);

        ToDoTask task_3 = new ToDoTask("3. NOSE L/G AND DOOR" +
                "- Door's Attachment" +
                "\n- Gear Assy Structure" +
                "\n- Shock Absorber Sliding Tube");
        mToDoList.add(task_3);

    }

    // Return all tasks
    public List<ToDoTask> getToDoList() {

        return mToDoList;
    }

}
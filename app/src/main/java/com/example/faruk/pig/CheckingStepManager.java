package com.example.faruk.pig;

import com.google.android.glass.widget.CardBuilder;

import java.util.ArrayList;
import java.util.List;

/* Manager of tasks. Basically it's a list with all the tasks. At this moment only 4.
   All tasks are hard-written but in the next version they'll be originated by voice
*/
public class CheckingStepManager {

    // List to store all the tasks
    private List<StepsToCheck> StepstoCheck;
    private CardBuilder mCards;

    public CheckingStepManager(){


        StepstoCheck = new ArrayList<StepsToCheck>();

        // Generate random tasks
// need to finish this by today
        StepsToCheck Step_1 = new StepsToCheck("1. LH FWD FUSELAGE\n" +
                "\n- Passenger/crew Door check" +
                "\n- F/O / CAPT / STBY static ports" +
                "\n- AOA 1 probe" +
                "\n- Avionics equipment" +
                "\n- Oxygen overboard discharge indicator");
        StepstoCheck.add(Step_1);

        StepsToCheck task_2 = new StepsToCheck("2. NOSE SECTION" +
                "\n- Cockpit Windshield" +
                "\n- Radome and latches" +
                "\n- Pilot probes" +
                "\n- Antennas" +
                "\n- TAT probes");
        StepstoCheck.add(task_2);

        StepsToCheck task_3 = new StepsToCheck("3. NOSE L/G AND DOOR" +
                "- Door's Attachment" +
                "\n- Gear Assy Structure" +
                "\n- Shock Absorber Sliding Tube");
        StepstoCheck.add(task_3);

    }

    // Return all tasks
    public List<StepsToCheck> getToDoList() {

        return StepstoCheck;
    }

}
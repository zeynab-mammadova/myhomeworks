package az.company.homeworks.homework8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Schedule {
    private HashMap<String, Integer> schedule= new HashMap<>();



    public HashMap<String, Integer> getSchedule() {
        return schedule;
    }

    public void setSchedule(HashMap<String, Integer> schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "schedule=" + schedule +
                '}';
    }
}


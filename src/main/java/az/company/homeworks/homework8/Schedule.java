package az.company.homeworks.homework8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Schedule {
   private Map<String,String> table =new HashMap<String, String>();

   public Schedule(Map<String,String> table){
       this.table=table;
   }

   public Map<String,String> getTable(){
       return table;
    }
    public void setTable(Map<String,String> table){
       this.table=table;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "table=" + table +
                '}';
    }
}

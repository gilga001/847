import scala.Tuple2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Hashtable;

public class PositionalWord implements Serializable {

    private String key;
    private Integer frequency;
    private Hashtable<Integer, ArrayList<Integer>> list;

    PositionalWord(){}

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public Hashtable<Integer, ArrayList<Integer>> getList() {
        return list;
    }

    public void setList(Hashtable<Integer, ArrayList<Integer>> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return
                "key='" + key + '\'' +
                ", frequency=" + frequency +
                ", list=" + list.toString()
                ;
    }
}

package Dailytask;


import javax.annotation.processing.Generated;
import java.util.List;

@Generated("jsonschema2pojo")
public class Menu {


    private Integer menuID;
    private String menuName;
    private String menuStartTime;
    private String menuEndTime;
    private String firstOrderMinutes;
    private String lastOrderMinutes;
    private Float maxOrderAmount;
    private String promiseTime;
    private List<MiCollection> miCollections = null;
    private List<Object> lstOrderFullSlots = null;

    public Integer getMenuID() {
        return menuID;
    }

    public void setMenuID(Integer menuID) {
        this.menuID = menuID;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuStartTime() {
        return menuStartTime;
    }

    public void setMenuStartTime(String menuStartTime) {
        this.menuStartTime = menuStartTime;
    }

    public String getMenuEndTime() {
        return menuEndTime;
    }

    public void setMenuEndTime(String menuEndTime) {
        this.menuEndTime = menuEndTime;
    }

    public String getFirstOrderMinutes() {
        return firstOrderMinutes;
    }

    public void setFirstOrderMinutes(String firstOrderMinutes) {
        this.firstOrderMinutes = firstOrderMinutes;
    }

    public String getLastOrderMinutes() {
        return lastOrderMinutes;
    }

    public void setLastOrderMinutes(String lastOrderMinutes) {
        this.lastOrderMinutes = lastOrderMinutes;
    }

    public Float getMaxOrderAmount() {
        return maxOrderAmount;
    }

    public void setMaxOrderAmount(Float maxOrderAmount) {
        this.maxOrderAmount = maxOrderAmount;
    }

    public String getPromiseTime() {
        return promiseTime;
    }

    public void setPromiseTime(String promiseTime) {
        this.promiseTime = promiseTime;
    }

    public List<MiCollection> getMiCollections() {
        return miCollections;
    }

    public void setMiCollections(List<MiCollection> miCollections) {
        this.miCollections = miCollections;
    }

    public List<Object> getLstOrderFullSlots() {
        return lstOrderFullSlots;
    }

    public void setLstOrderFullSlots(List<Object> lstOrderFullSlots) {
        this.lstOrderFullSlots = lstOrderFullSlots;
    }
}

package Dailytask;

import javax.annotation.processing.Generated;
import java.util.List;

@Generated("jsonschema2pojo")
public class Single {


    private List<Menu> menus = null;
    private Boolean responseCode;
    private Integer response;
    private String responseMessage;

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public Boolean getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(Boolean responseCode) {
        this.responseCode = responseCode;
    }

    public Integer getResponse() {
        return response;
    }

    public void setResponse(Integer response) {
        this.response = response;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}

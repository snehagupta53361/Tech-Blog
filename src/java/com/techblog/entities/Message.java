
package com.techblog.entities;

/**
 *
 * @author SNEHA GUPTA
 */
public class Message {
    
    private String content;
    private String errorType;
    private String cssClass;

    public Message(String content, String errorType, String getCssClass) {
        this.content = content;
        this.errorType = errorType;
        this.cssClass = getCssClass;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getErrorType() {
        return errorType;
    }

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    public String getCssClass() {
        return cssClass;
    }

    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }


}

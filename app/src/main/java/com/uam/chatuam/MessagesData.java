package com.uam.chatuam;

public class MessagesData {
    private String heading,messages;
    public MessagesData(String heading,String messages){
        this.heading=heading;
        this.messages=messages;
    }

    public String getHeading(){
        return heading;
    }

    public String getMessages(){
        return messages;
    }
}

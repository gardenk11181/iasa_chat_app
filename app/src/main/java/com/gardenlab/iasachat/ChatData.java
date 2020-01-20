package com.gardenlab.iasachat;

public class ChatData {

    private String nick;
    private String msg;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    ChatData() {
        this("1","1");
    }

    ChatData(String nick, String msg){
        this.nick = nick;
        this.msg = msg;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dell
 */
public class ThreadUser {

    private String threadid;
    private String usrid;

    public ThreadUser(String threadid, String usrid) {
        this.threadid = threadid;
        this.usrid = usrid;
    }

 

    public String getThreadid() {
        return threadid;
    }

    public void setThreadid(String threadid) {
        this.threadid = threadid;
    }

    public String getUsrid() {
        return usrid;
    }

    public void setUsrid(String usrid) {
        this.usrid = usrid;
    }
    
    
}

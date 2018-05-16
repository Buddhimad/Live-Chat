/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Dell
 */
@WebService(serviceName = "Service")
public class Service {

    public ArrayList<String> msglist;
    public ArrayList<String> userlist;
    public ArrayList<String> activelist;
    public ArrayList<String> threadlist;
    public ArrayList<String> threaduser;
    private boolean isin = false;
    private boolean isregister = false;
    private boolean isloged = false;
    private static String temp;

    /**
     * This is a sample web service operation
     */
    public Service() {
        msglist = new ArrayList<>();
        userlist = new ArrayList<>();
        activelist = new ArrayList<>();
        threadlist = new ArrayList<>();
        threaduser = new ArrayList<>();
    }

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @WebMethod(operationName = "register")
    public boolean registerUser(String nickname, String loginid, String password) {
        String data = nickname + "#" + loginid + "#" + password;
        if (data != null) {
            for (String ru : userlist) {
                String[] text = ru.split("#");
                if (text[0].equals(nickname)) {
                    isregister = true;
                    break;
                }
            }
        }
        if (isregister) {
            isregister = false;
            return false;
        }
        userlist.add(data);
        writeUsersToText();
        printRegisterUser();
       
        return true;
    }

    @WebMethod(operationName = "login")
    public boolean loginUser(String loginid, String password) {
        String line = loginid + "#" + password;
        for (String ul : userlist) {
            String[] data = ul.split("#");
            if (data[1].equals(loginid) & data[2].equals(password)) {
                for (String al : activelist) {
                    String[] data2 = al.split("#");
                    if (data2[0].equals(loginid)) {
                        isloged = true;
                        break;
                    }
                }
                if (!isloged) {
                    activelist.add(line);
                    return true;
                }
                return true;

            }
        }

        return false;

    }

    @WebMethod(operationName = "newthread")
    public boolean addThread(String title, String date, String editedby) {
        String data = title + "#" + date + "#" + editedby;
        if (data != null) {
            threadlist.add(data);
            return true;
        }
        return false;

    }

    @WebMethod(operationName = "editthread")
    public boolean updateThread(String oldthread, String newthread, String editedby) {
        temp = oldthread;
        int count = 0;
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd/hh:mm:ss");
        String date = ft.format(dNow);
        String newline = newthread + "#" + date + "#" + editedby;
        for (String data : threadlist) {
            String[] tmp = data.split("#");
            if (tmp[0].equals(oldthread)) {
                int index = threadlist.indexOf(data);
                threadlist.remove(index);
                threadlist.add(newline);
                readmsg:
                for (int j = 0; j < msglist.size(); j++) {
                    String[] ln = msglist.get(j).split("#");
                    if (ln[3].equals(temp)) {
                        // int i = msglist.indexOf(msglist.get(j));
                        // msglist.remove(i);
                        String newmsgline = ln[0] + "#" + ln[1] + "#" + ln[2] + "#" + newthread;
                        msglist.add(newmsgline);

                    }
                }
//                for (String data2 : msglist) {
//                    String[] ln = data2.split("#");
//                    
//                    if (ln[3].equals(oldthread)) {
//                        int i = msglist.indexOf(data2);
//                        String newmsgline = ln[0] + "#" + ln[1] + "#" + ln[2] + "#" + newthread;
//                        //msglist.remove(i);
//                        msglist.add(newmsgline);
//                       
//                    }
//                    
//                }
                return true;
            }
        }

        return true;
    }

    @WebMethod(operationName = "broadcast")
    public boolean broadcast(String sender, String message, String time, String thread) {
        String data = sender + "#" + message + "#" + time + "#" + thread;
        if (data != null) {
            msglist.add(data);
             writeToText();
            return true;
        }
        return false;

    }

    @WebMethod(operationName = "receive")
    public ArrayList<String> receive() {
        return msglist;

    }

    @WebMethod(operationName = "getActivelist")
    public ArrayList<String> getActivelist() {
        return activelist;
    }

    @WebMethod(operationName = "setthreadUserList")
    public boolean setthreadUserList(String threadid, String userid) {
        String data = threadid + "#" + userid;
        if (data != null) {
            for (String t : threaduser) {
                String[] d = t.split("#");
                if (d[0].equals(threadid) & d[1].equals(userid)) {
                    isin = true;
                    break;
                }
            }
            if (isin != true) {
                threaduser.add(data);
                return true;
            }
            isin = false;
            return true;
        }

        return false;
    }

    @WebMethod(operationName = "getthreadList")
    public ArrayList<String> getthreadList() {
        return threadlist;
    }

    @WebMethod(operationName = "signout")
    public boolean logout(String loginid) {
        for (String al : activelist) {
            String[] data = al.split("#");
            if (data[0].equals(loginid)) {
                activelist.remove(al);
                return true;
            }
        }
        return false;
    }

    public void printRegisterUser() {
        for (String s : userlist) {
            System.out.println(s);
        }

    }

    private void writeToText() {
        String filePath = this.getClass().getResource("/").getPath() + "Data/MYFILE.txt";

        //java.io.File file = new java.io.File(filePath);
        BufferedWriter writer = null;
        try {

            FileWriter fw = null;

            //URL url = getClass().getResource("list.txt");
             File file = new File("D:\\IIT\\2nd year\\2nd Semester\\Client-Server\\Course Work\\Project\\ChatServer\\list.txt");
            // File file = new File(filePath);
            if (file.exists()) {
                file.delete();
                file.createNewFile();
                writer = new BufferedWriter(new FileWriter(file));
                for (String l : msglist) {
                    writer.write(l + "|");
                }
            } else {
                file.createNewFile();
                writer = new BufferedWriter(new FileWriter(file));
                for (String l : msglist) {
                    writer.write(l + "|");
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                // Close the writer regardless of what happens...
                writer.close();
            } catch (Exception e) {
            }
        }

    }

    private void saveToArray() {
        String filePath = this.getClass().getResource("/").getPath() + "Data/MYFILE.txt";

        java.io.File file = new java.io.File(filePath);
        FileReader filereader = null;
        msglist = new ArrayList<>();
        try {
            BufferedReader bufferedreader = null;
            filereader = new FileReader(file);
            bufferedreader = new BufferedReader(filereader);
            String line = null;
            while ((line = bufferedreader.readLine()) != null) {
                String[] data = line.split("|");
                msglist.add(data[0]);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                filereader.close();
            } catch (IOException ex) {
                Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private void writeUsersToText() {
        String filePath = this.getClass().getResource("/").getPath() + "Data/MYFILE.txt";

        //java.io.File file = new java.io.File(filePath);
        BufferedWriter writer = null;
        try {

            FileWriter fw = null;

            //URL url = getClass().getResource("list.txt");
             File file = new File("D:\\IIT\\2nd year\\2nd Semester\\Client-Server\\Course Work\\Project\\ChatServer\\users.txt");
            // File file = new File(filePath);
            if (file.exists()) {
                file.delete();
                file.createNewFile();
                writer = new BufferedWriter(new FileWriter(file));
                for (String l : userlist) {
                    writer.write(l + "|");
                }
            } else {
                file.createNewFile();
                writer = new BufferedWriter(new FileWriter(file));
                for (String l : userlist) {
                    writer.write(l + "|");
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                // Close the writer regardless of what happens...
                writer.close();
            } catch (Exception e) {
            }
        }

    }

}

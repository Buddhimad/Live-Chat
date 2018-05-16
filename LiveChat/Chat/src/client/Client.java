/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

/**
 *
 * @author Dell
 */
public class Client {

    public boolean broadcast(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) {
        server.Service_Service service = new server.Service_Service();
        server.Service port = service.getServicePort();
        return port.broadcast(arg0, arg1, arg2, arg3);
    }

    public boolean editthread(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        server.Service_Service service = new server.Service_Service();
        server.Service port = service.getServicePort();
        return port.editthread(arg0, arg1, arg2);
    }

    public java.util.List<java.lang.String> getActivelist() {
        server.Service_Service service = new server.Service_Service();
        server.Service port = service.getServicePort();
        return port.getActivelist();
    }

    public boolean login(java.lang.String arg0, java.lang.String arg1) {
        server.Service_Service service = new server.Service_Service();
        server.Service port = service.getServicePort();
        return port.login(arg0, arg1);
    }

    public boolean newthread(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        server.Service_Service service = new server.Service_Service();
        server.Service port = service.getServicePort();
        return port.newthread(arg0, arg1, arg2);
    }

    public java.util.List<java.lang.String> receive() {
        server.Service_Service service = new server.Service_Service();
        server.Service port = service.getServicePort();
        return port.receive();
    }

    public boolean register(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        server.Service_Service service = new server.Service_Service();
        server.Service port = service.getServicePort();
        return port.register(arg0, arg1, arg2);
    }

    public boolean setthreadUserList(java.lang.String arg0, java.lang.String arg1) {
        server.Service_Service service = new server.Service_Service();
        server.Service port = service.getServicePort();
        return port.setthreadUserList(arg0, arg1);
    }

    public java.util.List<java.lang.String> getthreadList() {
        server.Service_Service service = new server.Service_Service();
        server.Service port = service.getServicePort();
        return port.getthreadList();
    }

    public boolean signout(java.lang.String arg0) {
        server.Service_Service service = new server.Service_Service();
        server.Service port = service.getServicePort();
        return port.signout(arg0);
    }

}


package server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the server package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Newthread_QNAME = new QName("http://server/", "newthread");
    private final static QName _SetthreadUserList_QNAME = new QName("http://server/", "setthreadUserList");
    private final static QName _EditthreadResponse_QNAME = new QName("http://server/", "editthreadResponse");
    private final static QName _Login_QNAME = new QName("http://server/", "login");
    private final static QName _Signout_QNAME = new QName("http://server/", "signout");
    private final static QName _GetActivelist_QNAME = new QName("http://server/", "getActivelist");
    private final static QName _LoginResponse_QNAME = new QName("http://server/", "loginResponse");
    private final static QName _Broadcast_QNAME = new QName("http://server/", "broadcast");
    private final static QName _BroadcastResponse_QNAME = new QName("http://server/", "broadcastResponse");
    private final static QName _Receive_QNAME = new QName("http://server/", "receive");
    private final static QName _Register_QNAME = new QName("http://server/", "register");
    private final static QName _Hello_QNAME = new QName("http://server/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://server/", "helloResponse");
    private final static QName _RegisterResponse_QNAME = new QName("http://server/", "registerResponse");
    private final static QName _GetthreadList_QNAME = new QName("http://server/", "getthreadList");
    private final static QName _ReceiveResponse_QNAME = new QName("http://server/", "receiveResponse");
    private final static QName _NewthreadResponse_QNAME = new QName("http://server/", "newthreadResponse");
    private final static QName _GetActivelistResponse_QNAME = new QName("http://server/", "getActivelistResponse");
    private final static QName _SetthreadUserListResponse_QNAME = new QName("http://server/", "setthreadUserListResponse");
    private final static QName _Editthread_QNAME = new QName("http://server/", "editthread");
    private final static QName _GetthreadListResponse_QNAME = new QName("http://server/", "getthreadListResponse");
    private final static QName _SignoutResponse_QNAME = new QName("http://server/", "signoutResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Broadcast }
     * 
     */
    public Broadcast createBroadcast() {
        return new Broadcast();
    }

    /**
     * Create an instance of {@link BroadcastResponse }
     * 
     */
    public BroadcastResponse createBroadcastResponse() {
        return new BroadcastResponse();
    }

    /**
     * Create an instance of {@link Receive }
     * 
     */
    public Receive createReceive() {
        return new Receive();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link GetActivelist }
     * 
     */
    public GetActivelist createGetActivelist() {
        return new GetActivelist();
    }

    /**
     * Create an instance of {@link Signout }
     * 
     */
    public Signout createSignout() {
        return new Signout();
    }

    /**
     * Create an instance of {@link EditthreadResponse }
     * 
     */
    public EditthreadResponse createEditthreadResponse() {
        return new EditthreadResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link Newthread }
     * 
     */
    public Newthread createNewthread() {
        return new Newthread();
    }

    /**
     * Create an instance of {@link SetthreadUserList }
     * 
     */
    public SetthreadUserList createSetthreadUserList() {
        return new SetthreadUserList();
    }

    /**
     * Create an instance of {@link Editthread }
     * 
     */
    public Editthread createEditthread() {
        return new Editthread();
    }

    /**
     * Create an instance of {@link GetthreadListResponse }
     * 
     */
    public GetthreadListResponse createGetthreadListResponse() {
        return new GetthreadListResponse();
    }

    /**
     * Create an instance of {@link SignoutResponse }
     * 
     */
    public SignoutResponse createSignoutResponse() {
        return new SignoutResponse();
    }

    /**
     * Create an instance of {@link NewthreadResponse }
     * 
     */
    public NewthreadResponse createNewthreadResponse() {
        return new NewthreadResponse();
    }

    /**
     * Create an instance of {@link GetActivelistResponse }
     * 
     */
    public GetActivelistResponse createGetActivelistResponse() {
        return new GetActivelistResponse();
    }

    /**
     * Create an instance of {@link SetthreadUserListResponse }
     * 
     */
    public SetthreadUserListResponse createSetthreadUserListResponse() {
        return new SetthreadUserListResponse();
    }

    /**
     * Create an instance of {@link ReceiveResponse }
     * 
     */
    public ReceiveResponse createReceiveResponse() {
        return new ReceiveResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link GetthreadList }
     * 
     */
    public GetthreadList createGetthreadList() {
        return new GetthreadList();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Newthread }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "newthread")
    public JAXBElement<Newthread> createNewthread(Newthread value) {
        return new JAXBElement<Newthread>(_Newthread_QNAME, Newthread.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetthreadUserList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "setthreadUserList")
    public JAXBElement<SetthreadUserList> createSetthreadUserList(SetthreadUserList value) {
        return new JAXBElement<SetthreadUserList>(_SetthreadUserList_QNAME, SetthreadUserList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditthreadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "editthreadResponse")
    public JAXBElement<EditthreadResponse> createEditthreadResponse(EditthreadResponse value) {
        return new JAXBElement<EditthreadResponse>(_EditthreadResponse_QNAME, EditthreadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Signout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "signout")
    public JAXBElement<Signout> createSignout(Signout value) {
        return new JAXBElement<Signout>(_Signout_QNAME, Signout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivelist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getActivelist")
    public JAXBElement<GetActivelist> createGetActivelist(GetActivelist value) {
        return new JAXBElement<GetActivelist>(_GetActivelist_QNAME, GetActivelist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Broadcast }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "broadcast")
    public JAXBElement<Broadcast> createBroadcast(Broadcast value) {
        return new JAXBElement<Broadcast>(_Broadcast_QNAME, Broadcast.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BroadcastResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "broadcastResponse")
    public JAXBElement<BroadcastResponse> createBroadcastResponse(BroadcastResponse value) {
        return new JAXBElement<BroadcastResponse>(_BroadcastResponse_QNAME, BroadcastResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Receive }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "receive")
    public JAXBElement<Receive> createReceive(Receive value) {
        return new JAXBElement<Receive>(_Receive_QNAME, Receive.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "registerResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetthreadList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getthreadList")
    public JAXBElement<GetthreadList> createGetthreadList(GetthreadList value) {
        return new JAXBElement<GetthreadList>(_GetthreadList_QNAME, GetthreadList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "receiveResponse")
    public JAXBElement<ReceiveResponse> createReceiveResponse(ReceiveResponse value) {
        return new JAXBElement<ReceiveResponse>(_ReceiveResponse_QNAME, ReceiveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewthreadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "newthreadResponse")
    public JAXBElement<NewthreadResponse> createNewthreadResponse(NewthreadResponse value) {
        return new JAXBElement<NewthreadResponse>(_NewthreadResponse_QNAME, NewthreadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivelistResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getActivelistResponse")
    public JAXBElement<GetActivelistResponse> createGetActivelistResponse(GetActivelistResponse value) {
        return new JAXBElement<GetActivelistResponse>(_GetActivelistResponse_QNAME, GetActivelistResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetthreadUserListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "setthreadUserListResponse")
    public JAXBElement<SetthreadUserListResponse> createSetthreadUserListResponse(SetthreadUserListResponse value) {
        return new JAXBElement<SetthreadUserListResponse>(_SetthreadUserListResponse_QNAME, SetthreadUserListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Editthread }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "editthread")
    public JAXBElement<Editthread> createEditthread(Editthread value) {
        return new JAXBElement<Editthread>(_Editthread_QNAME, Editthread.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetthreadListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getthreadListResponse")
    public JAXBElement<GetthreadListResponse> createGetthreadListResponse(GetthreadListResponse value) {
        return new JAXBElement<GetthreadListResponse>(_GetthreadListResponse_QNAME, GetthreadListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "signoutResponse")
    public JAXBElement<SignoutResponse> createSignoutResponse(SignoutResponse value) {
        return new JAXBElement<SignoutResponse>(_SignoutResponse_QNAME, SignoutResponse.class, null, value);
    }

}

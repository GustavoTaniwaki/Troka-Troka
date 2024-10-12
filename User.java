import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


public class User {
    
    private String cpf;
    private String password;
    private String name;
    private Date birthDate;
    private String phone;
    private String email;
    private String address;
    private boolean isSuspect;

    private List<Good> ownership = new ArrayList<Good>();
    private List<Good> hearted = new ArrayList<Good>();
    private List<Good> interestDisplayed = new ArrayList<Good>();
    private List<Good> cart = new ArrayList<Good>();
    private List<Message> comment = new ArrayList<Message>();
    private List<Chat> chats = new ArrayList<Chat>();
    private List<Rating> userRating = new ArrayList<Rating>();
    private List<Interest> interests = new ArrayList<Interest>();

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isSuspect() {
        return isSuspect;
    }

    public void setSuspect(boolean isSuspect) {
        this.isSuspect = isSuspect;
    }

    public List<Good> getOwnership() {
        return ownership;
    }

    public void setOwnership(List<Good> ownership) {
        this.ownership = ownership;
    }

    public List<Good> getHearted() {
        return hearted;
    }

    public void setHearted(List<Good> hearted) {
        this.hearted = hearted;
    }

    public List<Good> getInterestDisplayed() {

    public void setInterestDisplayed(List<Good> interestDisplayed) {
        this.interestDisplayed = interestDisplayed;
    }

    public List<Good> getCart() {
        return cart;
    }

    public void setCart(List<Good> cart) {
        this.cart = cart;
    }

    public List<Message> getComment() {
        return comment;
    }

    public void setComment(List<Message> comment) {
        this.comment = comment;
    }

    public List<Chat> getChats() {
        return chats;
    }

    public void setChats(List<Chat> chats) {
        this.chats = chats;
    }

    public List<Rating> getUserRating() {
        return userRating;
    }

    public void setUserRating(List<Rating> userRating) {
        this.userRating = userRating;
    }

    public List<Interest> getInterests() {
        return interests;
    }

    public void setInterests(List<Interest> interests) {
        this.interests = interests;
    }

}
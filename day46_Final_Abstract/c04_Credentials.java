package day46_Final_Abstract;

public class c04_Credentials {
    final private String userName = "Reem";
    final private String passWord = "Reem12345";

    // since I declared them as final ==> can not generate setters. only getters

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }




}
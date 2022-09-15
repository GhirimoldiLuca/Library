package library.controller;

import library.main.App;
import library.main.Constants;
import library.model.Admin;
import library.model.Customer;
import library.model.Librarian;
import library.model.User;

public class InitialController implements Constants {

    public void login() throws java.lang.Exception{
        String mail="",pw="";
         boolean success = false;
        
        User user = verify(mail,pw);

        if(user != null) {
            success=true;
        }

        if(success){
            switch(user.getType()){
                case "Admin":{
                    user = new Admin();
                    break;
                }
                case "Librarian":{
                    user = new Librarian();
                    break;
                }
                case "Customer":{
                    user = new Customer();
                    break;
                }
                default:{
                    throw new UserTypeException("User type dont exist");
                }
            }
        } 
    }

    private class UserTypeException extends Exception { 
        public UserTypeException (String errorMessage) {
            super(errorMessage);
        }
    }

    private User verify(String mail,String pw){
        User user = null;
        if(true){
            user= new User();
        }
        return user;
    }
    public void registerCustomer() throws java.lang.Exception{
        //register
        login();
    }
}

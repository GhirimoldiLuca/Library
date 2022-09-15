package library.users;

import java.io.IOException;

import library.main.App;
import library.main.Constants;

public class Customer extends User implements Constants{
    public Customer() throws IOException{
        App.setRoot(customerPath);
    }
}

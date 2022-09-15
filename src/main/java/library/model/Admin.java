package library.model;

import java.io.IOException;

import library.main.App;
import library.main.Constants;

public class Admin extends User implements Constants{
    public Admin() throws IOException{
        App.setRoot(adminPath);
    }
}

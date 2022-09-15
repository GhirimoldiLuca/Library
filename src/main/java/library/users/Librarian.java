package library.users;

import java.io.IOException;

import library.main.App;
import library.main.Constants;

public class Librarian extends User implements Constants{
    public Librarian() throws IOException{
        App.setRoot(librarianPath);
    }
}

package library.controller;

import java.io.IOException;

import library.main.App;
import library.main.Constants;
import library.model.Borrow;

public class LibrarianController implements Constants {
    private void visualizeBooks(){}
    private void userBorrowData(){}
    private void addBook(){}
    private void appointmentsData(){}
    private void borrow(){}
    private void closeBorrow(){}
    private void editBorrowData(){}
    private void anticipateReturnData(){}
    
    private void gotoUserGUI() throws IOException{
        App.setRoot(userPath);
    }
}

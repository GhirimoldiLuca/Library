package library.controller;

import java.io.IOException;

import library.main.App;
import library.main.Constants;
import library.model.Borrow;

public class AdminController implements Constants {
    
    private void registerAdmin(){}
    private void registerLibrarian(){}
    
    private void visualizeUserData(){}
    private void visualizeLibrarian(){}

    private void editUserData(){}
    private void editLibrarins(){}
    private void editBooks(){}
    private void editAppointmentsData(){}

    private void deleteSelf(){}
    
    private void gotoUserGUI() throws IOException{
        App.setRoot(userPath);
    }
}

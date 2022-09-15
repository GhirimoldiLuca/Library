package library.model;

import java.util.Date;
import library.model.Book;
import library.users.Customer;

public class Borrow {
    private String userId;
    private String bookingCode;
    private Book book;
    private Date timeAppointment;
}

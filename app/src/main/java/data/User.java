package data;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by macbookpro on 08/08/17.
 */
@IgnoreExtraProperties
public class User {
    public String name;
    public String email;
    public String adress;
    public String phone;
    public String location;

    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public User() {
    }

    public User(String name, String email,String adress,String phone,String location) {
        this.name = name;
        this.email = email;
        this.adress = adress;
        this.phone = phone;
        this.location = location;
    }
}

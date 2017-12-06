package tokenmaster.pojo;

import com.sun.media.sound.InvalidFormatException;
import tokenmaster.util.TokenMasterUtil;

/**
 * Created by kushagra on 12/6/2017.
 */
public class ServiceConsumer
{
    String name;
    String email;
    String address;
    String contactNumber;
    String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws InvalidFormatException{

        boolean isvalidEmail = TokenMasterUtil.isValidEmailAddress(email);
        if (isvalidEmail)
        {
            this.email = email;
        }
        else
        {
            throw new InvalidFormatException("Email is not in valid format");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

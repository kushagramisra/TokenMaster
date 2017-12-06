package tokenmaster.pojo;

import com.sun.media.sound.InvalidFormatException;
import tokenmaster.util.TokenMasterUtil;

import java.net.URL;

/**
 * Created by kushagra on 12/6/2017.
 */
public class ServiceProvider
{
    String name;
    String address;
    String contact;
    String imageLocation;
    URL url;
    String email;
    String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws InvalidFormatException {
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

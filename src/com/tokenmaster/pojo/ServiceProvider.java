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
    String ipv4;
    String ipv6;
    String contact;
    String imageLocation;
    String endPoint;
    String email;

    public ServiceProvider()
    {
        
    }
    
    private ServiceProvider(ServiceProviderBuilder serviceProviderBuilder)
    {
        this.name = serviceProviderBuilder.name;
        this.ipv4 = serviceProviderBuilder.ipv4;
        this.ipv6 = serviceProviderBuilder.ipv6;
        this.contact = serviceProviderBuilder.contact;
        this.imageLocation = serviceProviderBuilder.imageLocation;
        this.endPoint = serviceProviderBuilder.endPoint;
        this.email = serviceProviderBuilder.email;
    }
    public String getIpv6() {
        return ipv6;
    }

    public void setIpv6(String ipv6) {
        this.ipv6 = ipv6;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIpv4() {
        return ipv4;
    }

    public void setIpv4(String ipv4) {
        this.ipv4 = ipv4;
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

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
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

    public static class ServiceProviderBuilder
    {
         private String name;
         private String ipv6;
         private String ipv4;
         private String endPoint;
         private String email;
         private String imageLocation;
         private String contact;


        public ServiceProviderBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public ServiceProviderBuilder setIpv6(String ipv6) {
            this.ipv6 = ipv6;
            return this;
        }

        public ServiceProviderBuilder setIpv4(String ipv4) {
            this.ipv4 = ipv4;
            return this;
        }

        public ServiceProviderBuilder setEndPoint(String endPoint) {
            this.endPoint = endPoint;
            return this;
        }

        public ServiceProviderBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public ServiceProviderBuilder setImageLocation(String imageLocation) {
            this.imageLocation = imageLocation;
            return this;
        }

        public ServiceProviderBuilder setContact(String contact) {
            this.contact = contact;
            return this;
        }

        public ServiceProvider build()
        {
            return new ServiceProvider(this);
        }

        
    }
}

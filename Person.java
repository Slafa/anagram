/**
 * Created by slafa on 14.02.2017.
 */
public class Person
{   //Superclass
    private String firstName;
    private String familyName;
    private String socialSecurityNumber;

    public Person(String socialSecurityNumber, String firstName, String familyName){
        setSocialSecurityNumber(socialSecurityNumber);
        setFirstName(firstName);
        setFamilyName(familyName);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

}

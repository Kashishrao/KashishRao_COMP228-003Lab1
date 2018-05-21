package Exercise1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class patient
{

    // eathe variable declare kitte aa

    private String
            patient_id,
            first_name,
            last_name,
            address,
            city,
            province,
            postal_code;


    public patient(String patient_id,
                   String first_name,
                   String last_name,
                   String address,
                   String city,
                   String province,
                   String postal_code){

        this.patient_id = patient_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.city = city;
        this.province = province;
        this.postal_code = postal_code;

    }  // patient method end



    public void setPatientId(String patientId)
    {
        this.patient_id = patientId;
    }

    public void setFirstName(String firstName)
    {
        this.first_name = firstName;
    }

    public void setLastName(String lastName)
    {
        this.last_name = lastName;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public void setCity(String city)
    {
        this.city = city;
    }
    public void setProvince(String province)
    {
        this.province = province;
    }
    public void setPostalCode(String postalCode)
    {
        this.postal_code = postalCode;
    }

    //Getter
    public String getPatientId()
    {
        return patient_id;
    }
    public String getFirstName()
    {
        return first_name;
    }
    public String getLastName()
    {
        return last_name;
    }
    public String getAddress()
    {
        return address;
    }
    public String getCity()
    {
        return city;
    }
    public String getProvince()
    {
        return province;
    }
    public String getPostalCode()
    {
        return postal_code;
    }

    public String getPatientInfo()
    {

        return "patient id: " + patient_id + "\n" +
                "first name: " + first_name + "\n" +
                "last name: " + last_name + "\n" +
                "address: " + address + "\n"+
                "city: " + city + "\n" +
                "province: " + province + "\n"+
                "postal code: " + postal_code + "\n";
    }


}



class patient_test {
    public static void main(String[] args) {

        String patient_id = JOptionPane.showInputDialog("enter ur patient id -->");
        String first_name = JOptionPane.showInputDialog("enetr ur patient name -->");
        String last_name = JOptionPane.showInputDialog("enter ur last name -->");
        String address = JOptionPane.showInputDialog("enter ur address -->");
        String city = JOptionPane.showInputDialog("enter ur city -->");
        String province = JOptionPane.showInputDialog("enter ur provience -->");
        String postal_code = JOptionPane.showInputDialog("enter ur postal code -->");

        patient patient = new patient( patient_id, first_name, last_name, address, city,
                province, postal_code);

        String message = patient.getPatientInfo();
        JOptionPane.showMessageDialog(null, message );
    }
}
package custom_models;

import util.CountryIdCodeGenerator;

public class Customer {

    private String name = "SuperName";
    private String surname = "SurnameNo";
    private String email = "yourBest@mail.com";
    private String identityCode;

    public String getName() {
        long customerNumber = System.currentTimeMillis() % 10000; // from 14 digit number to 4
        return name + " " + customerNumber;
    }

    public String getIdentityCode(String country){
        switch (country) {
            case "EE": //same for LT
                identityCode = CountryIdCodeGenerator.estonianIdGenerate();
                break;
            case "LV":
                identityCode = CountryIdCodeGenerator.latviaIdGenerate();
                break;
            default: identityCode = "111111111";
                break;
        }
        return identityCode;
    }
}

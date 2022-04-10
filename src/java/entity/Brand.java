package entity;

public class Brand {

    private String brand_id;
    private String country_id;
    private String brand_name;
    private String contract_Dates;
    private String contract_Duration;

    public Brand() {
    }

    public Brand(String brand_id, String country_id, String brand_name, String contract_Dates, String contract_Duration) {
        this.brand_id = brand_id;
        this.country_id = country_id;
        this.brand_name = brand_name;
        this.contract_Dates = contract_Dates;
        this.contract_Duration = contract_Duration;
    }

    public String getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(String brand_id) {
        this.brand_id = brand_id;
    }

    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getContract_Dates() {
        return contract_Dates;
    }

    public void setContract_Dates(String contract_Dates) {
        this.contract_Dates = contract_Dates;
    }

    public String getContract_Duration() {
        return contract_Duration;
    }

    public void setContract_Duration(String contract_Duration) {
        this.contract_Duration = contract_Duration;
    }

    @Override
    public String toString() {
        return "Brand{" + "brand_id=" + brand_id + ", country_id=" + country_id + ", brand_name=" + brand_name + ", contract_Dates=" + contract_Dates + ", contract_Duration=" + contract_Duration + '}';
    }

  

}

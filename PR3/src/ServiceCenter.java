public class ServiceCenter {
    private String servname, address, datein, dateout, carmodel,
            variantrep, resultname, surnamepers, cost;
    public ServiceCenter(String servicename, String addressserv, String carname,
                         String variantrem, String dateinserv) {
        this.servname = servicename;
        this.address = addressserv;
        this.carmodel = carname;
        this.variantrep = variantrem;
        this.datein = dateinserv;
    }
    public String getservname() {return servname;}
    public String getaddress() {return address;}
    public String getcarmodel() {return carmodel;}
    public String getvariantrep() {return variantrep;}
    public String getdatein() {return datein;}

    public void setServname(String servicename) {this.servname = servicename;}
    public void setAddress(String addressserv) {this.address = addressserv;}
    public void setCarmodel(String carname) {this.carmodel = carname;}
    public void setVariantrep(String variantrem) {this.variantrep = variantrem;}
    public void setDatein(String dateinserv) {this.datein = dateinserv;}

    public String toString(){
        return "Название станции техобсуживания: " + servname + "\n" +
                "Адрес станции: " + address + "\n" +
                "Название автотранспорта:"  + carmodel + "\n" +
                "Вид ремонта: " + variantrep + "\n" +
                "Дата поступления:" + datein + "\n" +
                "Дата выдачи: " + dateout + "\n" +
                "Результата ремонта: " + resultname + "\n" +
                "Фамилия персонала: " + surnamepers + "\n" +
                "Сумма ремонта: " + cost + " рублей";
    }

    public void setDateout(String date) {this.dateout = date;}
    public String getDateout (String date) {return dateout;}
    public void setResultname(String result) {this.resultname = result;}
    public String getResultname(String result) {return resultname;}
    public void setSurnamepers(String surname) {this.surnamepers = surname;}
    public String getSurnamepers (String surname) {return surnamepers;}
    public void setCost(String totalcost) {this.cost = totalcost;}
    public String getCost (String totalcost) {return cost;}
}

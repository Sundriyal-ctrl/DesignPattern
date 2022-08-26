/**
 * Builder Design Pattern
 * it is creational design pattern we used when we have too many arguments to send in constructor & it's
 * hard to maintain the order, when we dont want to send all parameter in Object initialisation(Generaly we
 * send optional parameter as Null)
 */
class Vehicle
{
    private String name;
    private String company;
    private String chasenumber;
    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getChasenumber() {
        return chasenumber;
    }
    public Vehicle(VehicleBuilder vehicleBuilder) {
       this.chasenumber=vehicleBuilder.chasenumber;
       this.name=vehicleBuilder.name;
       this.company=vehicleBuilder.company;
    }

    private Vehicle(){}
    static class VehicleBuilder{
        private String name;
        private String chasenumber;
        private String company;
        public VehicleBuilder(String name,String chasenumber) {
             this.chasenumber=chasenumber;
             this.name=name;
        }
        public VehicleBuilder setCompany(String company)
        {
            this.company = company;
            return this;
        }
        public Vehicle build()
        {
            return new Vehicle(this);
        }
    }

}
public class BuilderDesignPattern {
    public static void main(String[] args) {
        Vehicle.VehicleBuilder vehicleBuilder = new Vehicle.VehicleBuilder("Pulsar","12344");
        Vehicle v = vehicleBuilder.build();
        System.out.println(v.getChasenumber());
        System.out.println(v.getCompany());
        System.out.println(v.getName());
    }
}

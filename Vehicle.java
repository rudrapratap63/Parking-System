/*
This is an abstract class serving 2 others classes, used to store vehicle id.
Contributors -> Ritika Suman
 */
abstract class Vehicle{
    String id ;

    /**
     * Constructs a Vehicle with the specified identifier.
     * @param id the identifier of the vehicle
     */
    Vehicle(String id){
        this.id = id;
    }
}
/*
This is an abstract class serving 2 others classes, used to store vehicle id.
Contributors -> Ritika Suman
 */
abstract class Vehicle{
    String id ;
    Vehicle(String id){
        this.id = id;
    }
    Vehicle(){
        this.id = null;
    }

}
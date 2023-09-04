package Reservation.Backend.repos;

import Reservation.Backend.model.route;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface Busroute extends MongoRepository<route,String> {
    // template and id as arguments
    route findByrouteName(String name);//can contain null value or no value
    route findBycity(String city);
}

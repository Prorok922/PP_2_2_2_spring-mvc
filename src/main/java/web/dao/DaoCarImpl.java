package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class DaoCarImpl implements DaoCar{
    private List<Car> listCar;

    @Autowired
    public DaoCarImpl() {
        listCar = new ArrayList<>();
        listCar.add(new Car("niva", 100, 1999));
        listCar.add(new Car("niva", 101, 1999));
        listCar.add(new Car("niva", 102, 1999));
        listCar.add(new Car("niva", 103, 1999));
        listCar.add(new Car("niva", 104, 1999));
    }

    @Override
    public List<Car> getListCar(int count) {
        if (count == 0){
            return listCar;
        }
        return listCar.stream().limit(count).collect(Collectors.toList());
    }
}

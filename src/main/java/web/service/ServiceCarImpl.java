package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.DaoCarImpl;
import web.model.Car;

import java.util.List;

@Service
public class ServiceCarImpl implements ServiceCar{
    private DaoCarImpl daoCar;

    @Autowired
    public ServiceCarImpl() {
        daoCar = new DaoCarImpl();
    }

    @Override
    public List<Car> getListCar(int count) {
        return daoCar.getListCar(count);
    }
}

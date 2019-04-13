package xyz.vaith.app.service.impl;

import xyz.vaith.app.dao.CusteomerDao;
import xyz.vaith.app.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
    private CusteomerDao custeomerDao;

    public void setCusteomerDao(CusteomerDao custeomerDao) {
        this.custeomerDao = custeomerDao;
    }
}

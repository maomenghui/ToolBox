package mock.demo.service;

public class BaseService {
    public String selectOne() {
        return "selectOne";
    }

    public String selectOne(String arg) {
        return "selectOne" + arg;
    }

    public String selectMany() {
        return "selectMany";
    }

    public boolean update() {
        return true;
    }
}

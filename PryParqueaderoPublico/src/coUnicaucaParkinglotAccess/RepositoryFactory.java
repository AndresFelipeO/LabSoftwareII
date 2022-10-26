package coUnicaucaParkinglotAccess;

public class RepositoryFactory {
    private  RepositoryFactory instance;
    
    private void RepositoryFactory(){

    }
    public static RepositoryFactory getInstance() {
        return null;
    }
    public IVehicleRepository GetRepository(String type){
        return null;
    }
}

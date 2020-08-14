package empservicescalls;

import org.testng.annotations.Test;
import services.singleEmployeeResources;

public class TestSingleEmployee extends singleEmployeeResources {

    @Test
    public void singleEmployeeServicesSuccess(){
        callsingleEmployeeResourcesSuccessStatus();
    }
    @Test
    public void singleEmployeeServicesFailed(){
        callsingleEmployeeResourcesFailStatus();
    }
}

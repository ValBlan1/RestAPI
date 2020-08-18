package empservicescalls;

import org.testng.annotations.Test;
import services.singleEmployeeResources;

public class TestSingleEmployee extends singleEmployeeResources {

    @Test
    public void singleEmployeeServicesSuccess(){
       callSingleEmployeeResourcesSuccessStatus();
    }
    @Test
    public void singleEmployeeServicesFailed(){
        callSingleEmployeeResourcesFailStatus();
    }
}

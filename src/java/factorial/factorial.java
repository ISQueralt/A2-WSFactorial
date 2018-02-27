package factorial;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author queralt
 */
@WebService(serviceName = "factorial")
public class factorial {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     * @param n
     * @return 
     * Return -1 if number is negative
     */
    @WebMethod(operationName = "fact")
    public int fact(@WebParam(name = "n") int n) {
        if (n<0) return -1;
        int factorial = 1;
        while (n != 0) {
            factorial *= n;
            n--;
        }
        return factorial;
    }
}

package errores;
import static java.lang.Math.abs;
public class ErrorM {
    private int valorReal,valorAprox;
    double e,erabs,er,errrel,errp,errpor;

public ErrorM (int a, int b){
valorReal=a;
valorAprox=b;
}
public double ErrorREL(){
er=e/valorReal;
errrel= abs(er);
return errrel;
}
public double ErrorABS(){
    e=(valorReal-valorAprox);
    erabs= abs(e);
  return erabs;  
}
public double ErrorPOR(){
errp=er*100;
errpor = abs(errp);
return errpor;
}
}

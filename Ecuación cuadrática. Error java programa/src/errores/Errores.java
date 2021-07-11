package errores;
import java.util.Scanner;
public class Errores {
    public static void main(String[] args) {
          Scanner txt=new Scanner (System.in);
          int A,B;
     System.out.println("Ingrese valor real");
     A=txt.nextInt();
     System.out.println("ingrese valor aproximado");
     B=txt.nextInt();
     ErrorM e1 = new ErrorM(A,B);

     System.out.println("El valor real es: "+A+" y el aproximado es: "+B);
     System.out.println("El reultado fue el siguiente:");
     System.out.println("El error absoluto es: "+e1.ErrorABS());
     System.out.println("El error relativo es: "+e1.ErrorREL());
     System.out.println("El error relativo porcentual es es: "+e1.ErrorPOR()+"%");
    }
    
}

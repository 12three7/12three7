package classes;

import java.math.BigDecimal;
import java.math.BigInteger;

import static java.lang.Math.*;

public class NumberClass {
        public static void main(String[] args) {
                Long a  = 1832590857306501653L;
                System.out.println(a.byteValue());
                System.out.println(a.shortValue());
                System.out.println(a.intValue());
                System.out.println(a.longValue());
                System.out.println(a.floatValue());
                System.out.println(a.doubleValue());
                /*
                output (dari atas ke bawah):
                21
                -3563
                -597560811
                1832590857306501653
                1.8325908E18
                1.83259085730650163E18
                 */
                // casting
                int b = a.intValue();
                System.out.println(b);
                String n = "1982695823";
                int var253t297 = Integer.parseInt(n);
                Integer ksegr5t = Integer.valueOf(n);
                System.out.println(var253t297);
                System.out.println(ksegr5t);
                // math class/method/operations
                int x = 123456780;
                System.out.println(cos(x));
                System.out.println(sin(x));
                System.out.println(tan(x));
                System.out.println(log(x));
                System.out.println(min(x, ksegr5t));
                System.out.println(max(x, ksegr5t));
                System.out.println(floor(x));
                System.out.println(PI);
                System.out.println(E);
                System.out.println(PI * 9);

                Long longg = 999999999999999999L;
                BigInteger bigInteger = new BigInteger("99999999999999999999999999999999999999999999999999999999999999");
                BigDecimal bigDecimal = new BigDecimal("98409819492458325646456.86586468464864685464843753");
                System.out.println(bigInteger);
                System.out.println(bigDecimal);
                System.out.println(bigDecimal.add(new BigDecimal(724967643)));
                System.out.println(bigInteger.subtract(bigInteger));

        }
}

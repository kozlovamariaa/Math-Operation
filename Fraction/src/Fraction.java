import static java.lang.Math.abs;

class Main {
    public static void main(String[] args) {

        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(1, 3);

        Fraction f3 =  f1.sum(f2);
        f3.writeFraction(f3);
        Fraction f4 = f3.sum(f2);
        f4.writeFraction(f4);
    }
}

class Fraction{
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }


    public Fraction sum(Fraction f2){
        int det = Math.nok(this.denominator , f2.denominator);
        int numer = (det/this.denominator* this.numerator)+ (det/f2.denominator*f2.numerator);
        Fraction result = check(numer,det);
        return result;
    }

    public  Fraction difference(Fraction f2){
        int det = Math.nok(this.denominator , f2.denominator);
        int numer = (det/this.denominator* this.numerator)-(det/f2.denominator*f2.numerator);
        Fraction result = check(numer,det);
        return result;
    }

    public Fraction multiply(Fraction f2){
        int det = this.denominator * f2.denominator;
        int numer = this.numerator * f2.numerator;
        Fraction result = check(numer,det);
        return result;
    }

    public  Fraction divide(Fraction f2){
        int det = this.denominator*f2.numerator;
        int numer = this.numerator * f2.denominator;
        Fraction result = check(numer,det);
        return result;
    }


    public static Fraction check(int i, int y){
        int delitel = Math.nod(i,y);
        if(delitel<0){
            delitel*=-1;
        }
        i = i/delitel;
        y = y/delitel;
        return new Fraction(i,y);
    }


    public  void writeFraction(Fraction f){

        if(abs(f.numerator)>f.denominator && f.denominator!=1){
            int temp = f.numerator / f.denominator;
            f.numerator-=f.denominator*temp;
            System.out.print("   "+ abs(f.numerator)+ "\n");
            System.out.print(temp+ " "+ "––" + "\n");
            System.out.println("   "+ f.denominator);

        }
        else if(abs(f.denominator)==1){
            System.out.println(f.numerator);

        }
        else {
            System.out.print(f.numerator);
            System.out.print("/");
            System.out.print(f.denominator+"\n");
        }
    }

}

class Math{
    public static int nok(int a,int b){
        return a * b / nod(a, b);
    }
    public static int nod(int a,int b){
        if (b == 0) {
            return a;
        }
        return nod(b, a % b);
    }
}

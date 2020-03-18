import java.util.Arrays;

public class MyPolynomial {
private double[] coeffs;

    public MyPolynomial(double ... coeffs){
        this.coeffs = coeffs;
    }
    public int getDegree(){
        return coeffs.length;
    }
    public String toString(){
        String s="";
        for(int i=coeffs.length-1;i>=0;i--){
            s=s+coeffs[i]+"x^"+i;
            if(i!=0) s=s+"+";
        }
        return s;
    }

    public double evaluate(double x){
        double res=0,pow=1;
        for(int i=0;i<coeffs.length;i++){
            res=coeffs[i]*pow;
            pow*=x;
            }
        return res;
    }
    public MyPolynomial add(MyPolynomial right){
        MyPolynomial temp;
        if(this.coeffs.length>right.coeffs.length){
            temp=new MyPolynomial(this.coeffs);
            for(int i=0;i<right.coeffs.length;i++){
                temp.coeffs[i]+=right.coeffs[i];
            }
        }
        else {
            temp=new MyPolynomial(right.coeffs);
            for(int i=0;i<this.coeffs.length;i++){
                temp.coeffs[i]+=this.coeffs[i];
            }
        }
        return temp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyPolynomial)) return false;
        MyPolynomial that = (MyPolynomial) o;
        return Arrays.equals(coeffs, that.coeffs);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(coeffs);
    }

    public MyPolynomial multiply(MyPolynomial polynomial) {
        int totalLength = coeffs.length + polynomial.coeffs.length - 1;
        double[] result = new double[totalLength];
        for (int i = 0; i < coeffs.length; i++)
            for (int j = 0; j < polynomial.coeffs.length; j++) {
                result[i + j] += coeffs[i] * polynomial.coeffs[j];
            }
        return new MyPolynomial(result);
    }

}

// Last updated: 7/14/2026, 2:02:17 PM
class Solution {
    public double[] convertTemperature(double celsius) {
        double Kelvin=(double)celsius+273.15;
        double Fahreheit=(double)celsius*1.80 +32.00;
        return new double[] {Kelvin,Fahreheit};
    }
}
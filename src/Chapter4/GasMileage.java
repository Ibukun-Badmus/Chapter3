package Chapter4;

   public class GasMileage {

       private int milesDriven;
       private int gallonsUsed;


       public void setMilesDriven(int milesDriven) {
           this.milesDriven = milesDriven;
       }

       public void setGallonsUsed(int gallonsUsed) {
           this.gallonsUsed = gallonsUsed;
       }

       public int getMilesDriven() {
           return milesDriven;
       }

       public int getGallonsUsed() {
           return gallonsUsed;
       }

       public double milesPerGallonCalculator() {
           return (double) getMilesDriven() / getGallonsUsed();
       }
   }

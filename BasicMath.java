// Homework 1 Peter Stanley

class BasicMath
{
    public static void main(String[] args)
    {
           
        // initialize variables
        int hatBill = 1;
        int hatFlap = 2;
        int stuffOnHat;
        final int deerstalkerBills = 2;
        
        // do some basic arithmaric and show work
        stuffOnHat = hatBill + hatFlap;
        System.out.println(hatBill+" + "+hatFlap+" = "+stuffOnHat);
        System.out.println(hatBill+" - "+hatFlap+" = "+(hatBill - hatFlap));
        
        // do some basic arithmatic and don't show work
        final double flapStiches = 75; //lots of sewing for an earflap!
        double stitchesTotal = (flapStiches * hatFlap);
        System.out.println("you should have " +stitchesTotal / hatFlap+ "per earflap");
        
        // do some booleans and show work
        if( (hatBill > stuffOnHat) && (hatBill > hatFlap) ) {
            System.out.println(hatBill+" is greater than "+stuffOnHat+" and "+hatFlap+".");
        } else{
            System.out.println(hatBill+" is not greater than "+stuffOnHat+" and "+hatFlap+".");
        }
        
        if( (hatBill > deerstalkerBills) || (hatBill > stuffOnHat) ) {
            System.out.println(hatBill+ " is greater than either the number of bills on my deerstalker hat or "+stuffOnHat+".");
        } else{
            System.out.println(hatBill+ " is not greater than either the number of bills on my deerstalker hat or "+stuffOnHat+".");
        }
        
        int embroideredWords = 2;
        if( (hatBill > embroideredWords) && !(hatBill < hatFlap) ) {
            System.out.println("That's a lot of bills on your hat!");
        } else{
            System.out.println("I consider that normal");
        }
    }
}

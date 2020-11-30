public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;


    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }

    public abstract void displayInfo();



    public String getVersion(){
        return versionNumber;
    }
    public int getBatt(){
        return batteryPercentage;
    }
    public String getCarrier(){
        return carrier;
    }
    public String getRingTone(){
        return ringTone;
    }


    public void setVersion(String verNo){
        versionNumber = verNo;
    }
    public void setBatt(int batteryAmt){
        batteryPercentage = batteryAmt;
    }
    public void setCarrier(String myCarrier){
        carrier = myCarrier;
    }
    public void setRingTone(String myRT){
        ringTone = myRT;
    }
}
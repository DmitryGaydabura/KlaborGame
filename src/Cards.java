public class Cards {
    public String name;
    public int uniqueIndex;
    public double value;

    public int typeValue;

    public boolean isMaster;

    public int type;

    public String letter;

    public Cards(String name, int uniqueIndex, double value, int typeValue, boolean isMaster,int type,String letter) {
        this.name = name;
        this.uniqueIndex = uniqueIndex;
        this.value = value;
        this.typeValue = typeValue;
        this.isMaster = isMaster;
        this.type = type;
        this.letter = letter;
    }


    public void setValue(double value) {
        this.value = value;
    }

    public void setMaster(boolean isMaster){
        this.isMaster = isMaster;
    }

    @Override
    public String toString() {
        return name;
    }






}

public class Cards {
    public String name;
    public int uniqueIndex;
    public int value;

    public int typeValue;

    public boolean isMaster;

    public int type;

    public Cards(String name, int uniqueIndex, int value, int typeValue, boolean isMaster,int type) {
        this.name = name;
        this.uniqueIndex = uniqueIndex;
        this.value = value;
        this.typeValue = typeValue;
        this.isMaster = isMaster;
        this.type = type;
    }


    public void setValue(int value) {
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

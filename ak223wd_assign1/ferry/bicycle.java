package ak223wd_assign1.ferry;

public class bicycle extends Vehicle{

    private boolean embarked;

    public bicycle() {
        setNumberOfPass(1);
    }

    public boolean getembark(){
        return embarked;
    }
    private void setEmbark(boolean x){
        embarked=x;
    }


}
package patterns.prototype.conreteprototype;

public abstract class AbstractLetter implements Cloneable {
    private String state;

    public AbstractLetter(String state) {
        this.state = state;
    }

    public AbstractLetter clone(){
        AbstractLetter clone = null;
        try {
            clone = (AbstractLetter) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

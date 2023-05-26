package ch.noseryoung.blj.items;

public class Key extends Item {

    private int securityLevel;
    private String name;

    public Key(int securityLevel, String name) {
        super("Key");
        this.securityLevel = securityLevel;
        this.name = name;
    }

    public int getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(int securityLevel) {
        this.securityLevel = securityLevel;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

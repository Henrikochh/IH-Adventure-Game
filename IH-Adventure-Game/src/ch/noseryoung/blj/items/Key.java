package ch.noseryoung.blj.items;

import ch.noseryoung.blj.Item;

import java.security.SecurityPermission;

public class Key extends Item {

    private int securityLevel;

    public Key(int securityLevel) {
        super("Key");
        this.securityLevel = securityLevel;
    }

    public int getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(int securityLevel) {
        this.securityLevel = securityLevel;
    }
}

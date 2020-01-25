package com.rp.pattern.cor.example.support;

public class SpecialSupport extends Support {
    public SpecialSupport(String name) {
        super(name);
    }

    protected boolean resolve(Trouble trouble) {
        return false;
    }
}

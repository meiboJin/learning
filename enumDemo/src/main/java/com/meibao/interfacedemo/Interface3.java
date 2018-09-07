package com.meibao.interfacedemo;

public interface Interface3 extends  Interface1,Interface2 {
    @Override
    default int add() {
        return 0;
    }
}

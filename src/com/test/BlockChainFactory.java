package com.test;

public final class BlockChainFactory
{
    public final static Block createBlock(final String data, final String prehash) {
        return new Block(prehash,data);
    }
}

package com.test;

public class Block
{
    @Override
    public String toString()
    {
        return "Block [preBlockHash=" + preBlockHash + ", data=" + data + "]";
    }

    private final String hash;
    private final String preBlockHash;
    private final String data;
    private final long timestamp;

    public Block(final String preBlockHash, final String data)
    {
        this.preBlockHash = preBlockHash;
        this.data = data;
        this.timestamp = System.currentTimeMillis();
        this.hash = Util.digSignature(preBlockHash + Long.toString(timestamp) + data);
    }

    public String getPreBlockHash()
    {
        return preBlockHash;
    }

    public String getData()
    {
        return data;
    }

    public long getTimestamp()
    {
        return timestamp;
    }

    public String getHash()
    {
        return hash;
    }
}

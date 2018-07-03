package com.test;

import java.util.ArrayList;
import java.util.List;

public class BlockChainGenerator
{
    public static void main(String[] args)
    {
        final List<Block> list = new ArrayList<Block>();
        generateBlockChain(10, list);
        System.out.println("Boolean "+ validBlockIntegrity(list));
    }
    public static Block generateBlockChain(int nums, final List<Block> list){
        if(nums==0) {
            Block block = BlockChainFactory.createBlock("Block 0", "0");
            list.add(block);
            return block;
        }
        nums--;
        Block prev = generateBlockChain(nums,list);
        Block block = prev;
        if(nums!=0) {
            block = BlockChainFactory.createBlock("Block "+nums, prev.getHash());
            list.add(block);
        }
        return block;
    }
    
    
    public static boolean validBlockIntegrity(final List<Block> list) {
        for (int i = 1; i < list.size(); i++)
        {
            Block current = list.get(i);
            Block prev = list.get(i-1);
            if(!current.getPreBlockHash().equals(prev.getHash())) {
                return false;
            }
        }
        return true;
    }
}

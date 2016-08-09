package com.ly.shard;

public class PassportRuleParser {
	
	public static long parserTbIndex(long uid) {
		System.out.println("=====uid========");
        return getId(uid);
    }

    private static long getId(Long uid) {
        if (null==uid) {
            throw new IllegalArgumentException("ERROR ## the uid is null");
        }
        return uid%4;
    }

}

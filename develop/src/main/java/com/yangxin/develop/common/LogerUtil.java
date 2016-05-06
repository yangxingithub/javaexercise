package com.yangxin.develop.common;

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogerUtil.java



import org.apache.log4j.Logger;

public class LogerUtil
{

    public LogerUtil(Class<?> obj)
    {
        logger = Logger.getLogger(obj);
        debug = logger.isDebugEnabled();
        info = logger.isInfoEnabled();
    }

    public void debug(Object msg)
    {
        if(debug)
            logger.debug((new StringBuilder("\r\n==develop==")).append(msg).append("\r\n").toString());
    }

    public void info(Object msg)
    {
        if(info)
            logger.info((new StringBuilder("\r\n==develop==")).append(msg).append("\r\n").toString());
    }

    public void warn(Object msg)
    {
        logger.warn((new StringBuilder("\r\n==develop==")).append(msg).append("\r\n").toString());
    }

    public void error(Object msg)
    {
        logger.error((new StringBuilder("\r\n==develop==")).append(msg).append("\r\n").toString());
    }

    public void error(Object msg, Exception e)
    {
        logger.error((new StringBuilder("\r\n==develop==")).append(msg).append("\r\n").append(e).append("\r\n").toString());
    }

    private Logger logger;
    private boolean debug;
    private boolean info;
}

package com.lovecws.mumu.core.utils;

import org.apache.commons.lang3.RandomUtils;
import org.junit.Test;

/**
 * @author babymm
 * @version 1.0-SNAPSHOT
 * @Description: HttpClientUtil
 * @date 2017-11-22 11:17
 */
public class HttpClientUtilTest {

    @Test
    public void get() {
        //String content = HttpClientUtil.get("https://github.com/mumucommon/mumu-core");
        //System.out.println(content);
        int i = RandomUtils.nextInt(0, 2);
        System.out.println(i);
    }
}
